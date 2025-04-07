public class Analyst extends Employee {

    public Analyst(String name, int age, double salary) {
        super(name, age, salary);
    }
    public double getAnnualBonus() {
        return super.salary * .05;
    }
}