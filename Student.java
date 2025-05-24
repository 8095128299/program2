import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat;
        if (dob.contains("-")) {
            dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        } else {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        }
        this.dateOfBirth = dateFormat.parse(dob);
    }

    public int calculateAge() {
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);

        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge());
    }
}