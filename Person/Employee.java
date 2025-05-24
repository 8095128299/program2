public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonInfo();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
    
}