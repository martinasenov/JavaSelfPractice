package PracticeTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailParser {

    public static void main(String[] args) {

        String email =
                "Dear all,\n" +
                        "\n" +
                        "Please check if you are able to perform work as mentioned and confirm.\n" +
                        "\n" +
                        "Revision 0 for D-AZML\n" +
                        "\n" +
                        "WO 1273438 WEEKLY\n" +
                        "WO 1273439 DECAL INSP\n" +
                        "WO 1273437 WATER DRAIN\n" +
                        "\n" +
                        "Planned Start UTC: 19.04.2025 at 16:55\n" +
                        "Planned End UTC: 22.04.2025 at 02:10";

        EmailParser parser = new EmailParser();
        MaintenanceTask task = parser.parseEmail(email);

        System.out.println("aircraft reg: " + task.getRegistrationNumber());
        System.out.println("revision: " + task.getRevision());
        System.out.println("workorders: " + task.getWorkOrders());
        System.out.println("workorder descriptions: " + task.getWorkOrderDescriptions());
        System.out.println("plannedStartDateAndTime: " + task.getPlannedStart());
        System.out.println("plannedEndDateAndTime: " + task.getPlannedEnd());
    }

    public MaintenanceTask parseEmail(String emailText) {
        MaintenanceTask task = new MaintenanceTask();

        // 1. Extract Revision and Registration Number
        Pattern revisionPattern = Pattern.compile("Revision\\s(\\d+)\\sfor\\s([A-Z-\\d]+)");
        Matcher revMatcher = revisionPattern.matcher(emailText);
        String registrationNumber = null;

        if (revMatcher.find()) {
            task.setRevision(revMatcher.group(1));
            registrationNumber = revMatcher.group(2);
            task.setRegistrationNumber(registrationNumber);
        }

        // Preprocess: merge multi-line descriptions
        String[] lines = emailText.split("\\r?\\n");
        StringBuilder cleaned = new StringBuilder();
        Pattern woLineStart = Pattern.compile("^[•\\.]?\\s*\\d{7}(?:\\s*-\\s*|\\s+|–|-)");

        for (String line : lines) {
            String trimmedLine = line.trim();
            if (woLineStart.matcher(trimmedLine).find() || trimmedLine.startsWith("Planned Start") || trimmedLine.startsWith("Planned End")) {
                cleaned.append("\n").append(trimmedLine); // Keep as new line
            } else {
                cleaned.append(" ").append(trimmedLine); // Merge multi-line descriptions
            }
        }


        // 3. Now parse the cleaned string
       // Updated workOrderPattern to ensure the last work order is captured
       Pattern workOrderPattern = Pattern.compile("[•\\.]?\\s*(\\d{7})\\s*(?:-\\s*|–\\s*|\\s)(.*?)(?=\\n[•\\.]?\\s*\\d{7}\\s*(?:-\\s*|–\\s*|\\s)|\\nPlanned Start|\\z)", Pattern.DOTALL);
       Matcher workOrderMatcher = workOrderPattern.matcher(cleaned.toString());

       List<String> workOrders = new ArrayList<>();
       List<String> descriptions = new ArrayList<>();

       while (workOrderMatcher.find()) {
           String workOrder = workOrderMatcher.group(1);
           String fullDescription = workOrderMatcher.group(2).replaceAll("\\s+", " ").trim();

           if (registrationNumber != null && fullDescription.contains(registrationNumber)) {
               fullDescription = fullDescription.replace(registrationNumber, "").trim();
           }
           fullDescription = fullDescription.replaceAll("^[\\s\\-–—]+", "").trim();

           workOrders.add(workOrder);
           descriptions.add(fullDescription);
       }

       task.setWorkOrders(workOrders);
       task.setWorkOrderDescriptions(descriptions);

        // 4. Extract Start and End Dates
        DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy 'at' HH:mm 'UTC'");

// Primary: original pattern
        Pattern datePattern = Pattern.compile(
                "Planned Start (\\d{2}\\.\\d{2}\\.\\d{4} at \\d{2}:\\d{2} UTC).*?Planned End (\\d{2}\\.\\d{2}\\.\\d{4} at \\d{2}:\\d{2} UTC)",
                Pattern.DOTALL
        );
        Matcher dateMatcher = datePattern.matcher(emailText);

        if (dateMatcher.find()) {
            task.setPlannedStart(LocalDateTime.parse(dateMatcher.group(1), defaultFormatter));
            task.setPlannedEnd(LocalDateTime.parse(dateMatcher.group(2), defaultFormatter));
        } else {
            // Fallback for emails with different formatting or line breaks
            Pattern altDatePattern = Pattern.compile(
                    "Planned Start.*?(\\d{2}\\.\\d{2}\\.\\d{4})\\s*at\\s*(\\d{2}:\\d{2}).*?" +
                            "Planned End.*?(\\d{2}\\.\\d{2}\\.\\d{4})\\s*at\\s*(\\d{2}:\\d{2})",
                    Pattern.DOTALL
            );
            Matcher altMatcher = altDatePattern.matcher(emailText);

            if (altMatcher.find()) {
                DateTimeFormatter altFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                task.setPlannedStart(LocalDateTime.parse(altMatcher.group(1) + " " + altMatcher.group(2), altFormatter));
                task.setPlannedEnd(LocalDateTime.parse(altMatcher.group(3) + " " + altMatcher.group(4), altFormatter));
            }
        }


        return task;
    }


}