import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;

public class CSVHandler {

    // Method to read employees from a CSV file
    public static List<Employee> staticReadEmployees(String filePath) throws IOException {
        List<Employee> employees = new ArrayList<>();
        FileReader reader = new FileReader(filePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());

        // Reading each employee record
        for (CSVRecord record : csvParser) {
            String employeeID = record.get("EmployeeID");
            String fullName = record.get("FullName");
            String position = record.get("Position");
            String department = record.get("Department");

            // Create Employee object and add it to the list
            Employee employee = new Employee(employeeID, fullName, position, department);
            employees.add(employee);
        }

        csvParser.close();
        return employees;
    }

    // Method to write payroll reports to a CSV file
    public static void writePayrollReport(String filePath, List<PayrollReport> payrollReports) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(
                "EmployeeID", "EmployeeName", "Position", "Department", "BasicSalary", "Allowances", "GrossWage", 
                "Deductions", "NetPay", "PayrollDate", "HoursWorked", "TimeIn", "TimeOut"));

        // Writing payroll report data
        for (PayrollReport report : payrollReports) {
            csvPrinter.printRecord(
                    report.getEmployeeID(),
                    report.getEmployeeName(),
                    report.getPosition(),
                    report.getDepartment(),
                    report.getBasicSalary(),
                    report.getAllowances(),
                    report.getGrossWage(),
                    report.getDeductions(),
                    report.getNetPay(),
                    report.getPayrollDate(),
                    report.getHoursWorked(),
                    report.getTimeIn(),
                    report.getTimeOut()
            );
        }

        csvPrinter.flush();
        writer.close();
    }

    // Method to read attendance data from a CSV file
    public static List<Attendance> readAttendance(String filePath) throws IOException {
        List<Attendance> attendanceRecords = new ArrayList<>();
        FileReader reader = new FileReader(filePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());

        // Reading each attendance record
        for (CSVRecord record : csvParser) {
            String employeeID = record.get("EmployeeID");
            String employeeName = record.get("EmployeeName");
            Date date = new Date(record.get("Date"));  // Assume Date format is acceptable
            Time timeIn = Time.valueOf(record.get("TimeIn"));
            Time timeOut = Time.valueOf(record.get("TimeOut"));

            // Create Attendance object and add it to the list
            Attendance attendance = new Attendance(employeeID, employeeName, date, timeIn, timeOut);
            attendanceRecords.add(attendance);
        }

        csvParser.close();
        return attendanceRecords;
    }
}
