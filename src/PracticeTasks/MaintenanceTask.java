package PracticeTasks;

import java.time.LocalDateTime;
import java.util.List;

public class MaintenanceTask {

    private String revision;
    private String registrationNumber;
    private List<String> workOrders;
    private List<String> workOrderDescriptions;
    private LocalDateTime plannedStart;
    private LocalDateTime plannedEnd;

    // Getters and Setters
    public String getRevision() { return revision; }
    public void setRevision(String revision) { this.revision = revision; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public List<String> getWorkOrders() { return workOrders; }
    public void setWorkOrders(List<String> workOrders) { this.workOrders = workOrders; }

    public List<String> getWorkOrderDescriptions() { return workOrderDescriptions; }
    public void setWorkOrderDescriptions(List<String> workOrderDescriptions) { this.workOrderDescriptions = workOrderDescriptions; }

    public LocalDateTime getPlannedStart() { return plannedStart; }
    public void setPlannedStart(LocalDateTime plannedStart) { this.plannedStart = plannedStart; }

    public LocalDateTime getPlannedEnd() { return plannedEnd; }
    public void setPlannedEnd(LocalDateTime plannedEnd) { this.plannedEnd = plannedEnd; }
}