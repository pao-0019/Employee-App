import java.util.Date;
import java.sql.Time;

public class PayrollReport {
    // Attributes
    private String employeeID;
    private String employeeName;
    private String position;
    private String department;
    private double basicSalary;
    private double allowances;
    private double grossWage;
    private double deductions;
    private double netPay;
    private Date payrollDate;
    private double hoursWorked;
    private Time timeIn;
    private Time timeOut;

    // Constructor
    public PayrollReport(String employeeID, String employeeName, String position, String department, double basicSalary, 
                         double allowances, double grossWage, double deductions, double netPay, Date payrollDate, 
                         double hoursWorked, Time timeIn, Time timeOut) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.position = position;
        this.department = department;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.grossWage = grossWage;
        this.deductions = deductions;
        this.netPay = netPay;
        this.payrollDate = payrollDate;
        this.hoursWorked = hoursWorked;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    // Getter and Setter methods
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getGrossWage() {
        return grossWage;
    }

    public void setGrossWage(double grossWage) {
        this.grossWage = grossWage;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public Date getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(Date payrollDate) {
        this.payrollDate = payrollDate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    // Method to calculate gross wage
    public void calculateGrossWage() {
        this.grossWage = this.basicSalary + this.allowances;
    }

    // Method to calculate net pay
    public void calculateNetPay() {
        this.netPay = this.grossWage - this.deductions;
    }

    // Method to calculate the number of hours worked
    public double calculateHoursWorked() {
        // Calculate the difference between timeOut and timeIn in milliseconds
        long milliseconds = timeOut.getTime() - timeIn.getTime();
        
        // Convert milliseconds to hours
        return milliseconds / (1000.0 * 60.0 * 60.0);
    }

    // Method to display payroll report details
    public void displayPayrollReport() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowances);
        System.out.println("Gross Wage: " + grossWage);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Pay: " + netPay);
        System.out.println("Payroll Date: " + payrollDate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Time In: " + timeIn);
        System.out.println("Time Out: " + timeOut);
    }
}
