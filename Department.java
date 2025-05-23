public class Department {
    // Attributes
    private String departmentName;
    private String supervisorName;

    // Constructor
    public Department(String departmentName, String supervisorName) {
        this.departmentName = departmentName;
        this.supervisorName = supervisorName;
    }

    // Getter and Setter for departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter and Setter for supervisorName
    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }
}
