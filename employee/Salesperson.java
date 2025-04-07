package employee;
public class Salesperson extends Employee{
    private double commissionPercentage;

    public Salesperson (String name, int age, double salary, double commissionPercentage) {
        super(name, age, salary);
        this.commissionPercentage = commissionPercentage;
    }
    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseComission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}