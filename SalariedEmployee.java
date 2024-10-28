// Derived class SalariedEmployee
class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(int employeeId, String employeeName, String designation, double monthlySalary) {
        super(employeeId, employeeName, designation); // Using super to call base class constructor
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate weekly salary
    public double calculateWeeklySalary() {
        return monthlySalary / 4;
    }

    // Overriding calculateBonus with specific implementation
    @Override
    public double calculateBonus() {
        return calculateWeeklySalary() * 0.2; // 20% weekly bonus
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Display detailed information for SalariedEmployee
    public void displayInfo() {
        super.displayInfo(); // Calling base class displayInfo using super
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Weekly Salary: $" + calculateWeeklySalary());
        System.out.println("Bonus: $" + calculateBonus());
    }
}
