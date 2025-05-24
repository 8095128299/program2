import java.text.ParseException;

 public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("John Doe", "1995-08-15", 101, 75000);
            employee.displayEmployeeDetails();
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }
} {
    
}
