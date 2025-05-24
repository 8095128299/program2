import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe", "12-06-2000");
            student.displayStudentInfo();

            StudentCourses studentCourses = new StudentCourses();
            studentCourses.addCourse("Semester 1", "Math", 85);
            studentCourses.addCourse("Semester 1", "Physics", 78);
            studentCourses.addCourse("Semester 2", "Chemistry", 90);
            studentCourses.displayCourses();
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }
}