package Act3;
// Teacher Subclass

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Subject: " + this.subject);
    }
}
