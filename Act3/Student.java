// Student.Subclass
public class Student extends Person {
    private String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Grade Level: " + this.gradeLevel);
    }
}