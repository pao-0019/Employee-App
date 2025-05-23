public class GrossWage {
    // Attributes
    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public GrossWage(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getter and Setter methods for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter methods for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Method to calculate the gross wage
    public double calculateGrossWage() {
        return hoursWorked * hourlyRate;
    }
}
