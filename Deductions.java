public class Deductions {
    // Attributes
    private double sss;
    private double philHealth;
    private double pagibig;
    private double withholdingTax;

    // Constructor
    public Deductions(double sss, double philHealth, double pagibig, double withholdingTax) {
        this.sss = sss;
        this.philHealth = philHealth;
        this.pagibig = pagibig;
        this.withholdingTax = withholdingTax;
    }

    // Getter and Setter methods for sss
    public double getSss() {
        return sss;
    }

    public void setSss(double sss) {
        this.sss = sss;
    }

    // Getter and Setter methods for philHealth
    public double getPhilHealth() {
        return philHealth;
    }

    public void setPhilHealth(double philHealth) {
        this.philHealth = philHealth;
    }

    // Getter and Setter methods for pagibig
    public double getPagibig() {
        return pagibig;
    }

    public void setPagibig(double pagibig) {
        this.pagibig = pagibig;
    }

    // Getter and Setter methods for withholdingTax
    public double getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(double withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    // Method to calculate total deductions
    public double calculateTotalDeductions() {
        return sss + philHealth + pagibig + withholdingTax;
    }
}
