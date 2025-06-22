public class StudentRecordTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("John Doe", "12345", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Test 1: Display initial student details
        System.out.println("Test 1: Initial student details");
        controller.updateView();

        // Test 2: Update student details and display
        System.out.println("\nTest 2: Updated student details");
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B+");
        controller.updateView();

        // Test 3: Update only grade and display
        System.out.println("\nTest 3: Updated grade only");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}