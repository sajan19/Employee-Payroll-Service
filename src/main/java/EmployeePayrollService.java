import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService  {
    public static String PAYROLL_FILE_NAME = "payroll-file.txt";
    public void printData(IOService ioService) {
        try{
            Files.lines(new File(PAYROLL_FILE_NAME).toPath()).forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public long countEntries(IOService fileIo) {
        try{
            Files.lines(new File(PAYROLL_FILE_NAME).toPath()).forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
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
        employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
    }
    //Method to Write Employee Details
    public void writeEmployeePayrollData(IOService fileIo) {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }

    //Method to read Employee Details
    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }
    //Method to print Data
    public void printData(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollService.IOService()
    }

}
