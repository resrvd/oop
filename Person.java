// Base Class
public class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    //Display method
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
    public static void main (String[] args){
        // Create instances of subclasses
        Student student = new Student("Miguel", 2024101, "1st Year");
        Teacher teacher = new Teacher("Sr. Fabro", 2024102, "Object Oriented Programming");
        Staff staff = new Staff("Mr. Amponin", 2024103, "Guidance Office");
    
        // Display information
        System.out.println("Student Information:");
        student.display();
        System.out.println("\nTeacher Information:");
        teacher.display();
        System.out.println("\nStaff Information:");
        staff.display();
    }
}



