package Act3;
public class Staff extends Person {
    private String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Department: " + this.department);
    }
}
