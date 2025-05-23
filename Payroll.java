public class Payroll {
    // Attributes
    private String employee;
    private GrossWage grossWage;
    private Deductions deductions;
    private double netPay;
    private String payrollDay;

    // Constructor
    public Payroll(String employee, GrossWage grossWage, Deductions deductions, String payrollDay) {
        this.employee = employee;
        this.grossWage = grossWage;
        this.deductions = deductions;
        this.payrollDay = payrollDay;
    }

    // Getter and Setter methods for employee
    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    // Getter and Setter methods for basicSalary
    public double getBasicSalary() {
        return grossWage.calculateGrossWage();  // Assuming basic salary is calculated by the gross wage
    }

    public void setBasicSalary(double basicSalary) {
        // Assuming the gross wage will update accordingly
        grossWage.setHourlyRate(basicSalary / grossWage.getHoursWorked());
    }

    // Getter and Setter methods for deductions
    public double getSssDeduction() {
        return deductions.getSssDeduction();
    }

    public void setSssDeduction(double sssDeduction) {
        deductions.setSssDeduction(sssDeduction);
    }

    public double getPhilHealthDeduction() {
        return deductions.getPhilHealthDeduction();
    }

    public void setPhilHealthDeduction(double philHealthDeduction) {
        deductions.setPhilHealthDeduction(philHealthDeduction);
    }

    public double getPagibigDeduction() {
        return deductions.getPagibigDeduction();
    }

    public void setPagibigDeduction(double pagibigDeduction) {
        deductions.setPagibigDeduction(pagibigDeduction);
    }

    public double getWithholdingTax() {
        return deductions.getWithholdingTax();
    }

    public void setWithholdingTax(double withholdingTax) {
        deductions.setWithholdingTax(withholdingTax);
    }

    // Getter and Setter methods for netPay
    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    // Getter and Setter methods for payrollDay
    public String getPayrollDay() {
        return payrollDay;
    }

    public void setPayrollDay(String payrollDay) {
        this.payrollDay = payrollDay;
    }

    // Method to calculate net pay
    public double calculateNetPay() {
        // Net pay is calculated as gross wage minus deductions
        this.netPay = grossWage.calculateGrossWage() - (deductions.getSssDeduction() + deductions.getPhilHealthDeduction() +
                                                       deductions.getPagibigDeduction() + deductions.getWithholdingTax());
        return netPay;
    }

    // Method to generate payslip
    public void generatePayslip() {
        System.out.println("Payslip for: " + employee);
        System.out.println("Payroll Date: " + payrollDay);
        System.out.println("Gross Wage: " + grossWage.calculateGrossWage());
        System.out.println("Deductions:");
        System.out.println("  - SSS: " + deductions.getSssDeduction());
        System.out.println("  - PhilHealth: " + deductions.getPhilHealthDeduction());
        System.out.println("  - Pagibig: " + deductions.getPagibigDeduction());
        System.out.println("  - Withholding Tax: " + deductions.getWithholdingTax());
        System.out.println("Net Pay: " + calculateNetPay());
    }
}
