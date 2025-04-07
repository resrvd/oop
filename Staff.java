public class Staff extends Person {
    private String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo(); // Call the display method of the Person class
        System.out.println("Department: " + this.department);
    }
}
