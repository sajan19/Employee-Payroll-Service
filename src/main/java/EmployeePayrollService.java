import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    //List to store Employee Details
    private List<EmployeePayrollData> employeePayrollList;
    //Constructor of List
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }
    //Main Driver Class
    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        //Created an Object
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        //Scanner to take input from User
        Scanner consoleInputReader = new Scanner(System.in);
        //Calling Method Read and Write
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    //Method to Write Employee Details
    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
    //Method to read Employee Details
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }
}
