import java.util.Date;
import java.sql.Time;

public class Attendance {
    // Attributes
    private String employeeID;
    private String employeeName;
    private Date date;
    private Time timeIn;
    private Time timeOut;

    // Constructor
    public Attendance(String employeeID, String employeeName, Date date, Time timeIn, Time timeOut) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    // Getter and Setter for employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getter and Setter for timeIn
    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    // Getter and Setter for timeOut
    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    // Method to calculate the hours worked
    public double calculateHoursWorked() {
        // Calculate the difference between timeOut and timeIn in milliseconds
        long milliseconds = timeOut.getTime() - timeIn.getTime();
        
        // Convert milliseconds to hours
        return milliseconds / (1000.0 * 60.0 * 60.0);
    }
}
