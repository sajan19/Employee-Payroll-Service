public class EmployeePayrollData {
    //Declare Variables
    public int id;
    public String name;
    public double salary;
    //Constructor
    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //To String Method
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}