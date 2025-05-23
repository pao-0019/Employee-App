public class GovernmentDetails {
    // Attributes
    private String sssNumber;
    private String philHealthNumber;
    private String pagibigNumber;
    private String tinNumber;

    // Constructor
    public GovernmentDetails(String sssNumber, String philHealthNumber, String pagibigNumber, String tinNumber) {
        this.sssNumber = sssNumber;
        this.philHealthNumber = philHealthNumber;
        this.pagibigNumber = pagibigNumber;
        this.tinNumber = tinNumber;
    }

    // Getter and Setter for sssNumber
    public String getSssNumber() {
        return sssNumber;
    }

    public void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    // Getter and Setter for philHealthNumber
    public String getPhilHealthNumber() {
        return philHealthNumber;
    }

    public void setPhilHealthNumber(String philHealthNumber) {
        this.philHealthNumber = philHealthNumber;
    }

    // Getter and Setter for pagibigNumber
    public String getPagibigNumber() {
        return pagibigNumber;
    }

    public void setPagibigNumber(String pagibigNumber) {
        this.pagibigNumber = pagibigNumber;
    }

    // Getter and Setter for tinNumber
    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }
}
