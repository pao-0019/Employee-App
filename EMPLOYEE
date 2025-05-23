import java.util.Date;

public class Employee {
    // Attributes
    private String employee;
    private String fullName;
    private Date birthDate;
    private String position;
    private String address;
    private String phoneNumber;
    private String status;
    private Department department; 

    // Constructor
    public Employee(String employee, String fullName, Date birthDate, String position, String address, String phoneNumber, String status, Department department) {
        this.employee = employee;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.department = department;
    }

    // Getter and Setter methods
    public String getEmployeeID() {
        return employee;
    }

    public void setEmployeeID(String employeeID) {
        this.employee = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employee);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Position: " + position);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Status: " + status);
        System.out.println("Department: " + department.getDepartmentName()); // Assuming Department has getDepartmentName method
    }
}
