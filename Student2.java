import java.util.HashMap;
import java.util.Map;

public class Student2 {
    private int semesterNumber;
    private Map<String, Integer> courseMarks;

    public Student2 (int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.courseMarks = new HashMap<>();
    }

    public void addCourseMark(String courseName, int marks) {
        courseMarks.put(courseName, marks);
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester " + semesterNumber + " Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example usage
        Student2 semester1 = new Student2 (1);
        semester1.addCourseMark("Mathematics", 90);
        semester1.addCourseMark("Physics", 85);
 
    }
}