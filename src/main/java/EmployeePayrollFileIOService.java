import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollFileIOService {
    //Declare file name
    public static String PAYROLL_FILE_NAME = "payroll-file.txt";
    public void writeData(List<EmployeePayrollData> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        // Populate data in string buffer and write in the file
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Method to count entries in a file
    public long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File("payroll-file.txt").toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
    // Method to print the lines in the file
    public void printData() {
        try {
            Files.lines(new File("payroll-file.txt").toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // mMthod to read and print each line in the file
    public List<EmployeePayrollData> readData() {
        List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        try {
            Files.lines(new File("payroll-file.txt").toPath())
                    .map(String::trim).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeePayrollList;
    }
}