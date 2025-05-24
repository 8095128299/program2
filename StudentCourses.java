import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<String, Map<String, Integer>> semesterCourses;

    public StudentCourses() {
        semesterCourses = new HashMap<>();
    }

    public void addCourse(String semester, String course, int marks) {
        semesterCourses.putIfAbsent(semester, new HashMap<>());
        semesterCourses.get(semester).put(course, marks);
    }

    public void displayCourses() {
        System.out.println("\nStudent Course Information:");
        for (String semester : semesterCourses.keySet()) {
            System.out.println("\nSemester: " + semester);
            for (Map.Entry<String, Integer> entry : semesterCourses.get(semester).entrySet()) {
                System.out.println("Course: " + entry.getKey() + " | Marks: " + entry.getValue());
            }
        }
    }
}