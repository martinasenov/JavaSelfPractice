package PracticeTasks;

public class StringPractice {

    public static void main(String[] args) {

        String name="Martin Asenov";

        String first_name=name.substring(0, name.lastIndexOf(" "));
        String last_name=name.substring(name.lastIndexOf(" "));

        System.out.println("first_name = " + first_name);
        System.out.println("last_name = " + last_name);

    }

}
