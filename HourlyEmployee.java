// Derived class HourlyEmployee
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int employeeId, String employeeName, String designation, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, designation); // Using super to call base class constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate weekly salary
    public double calculateWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    // Overriding calculateBonus with specific implementation
    @Override
    public double calculateBonus() {
        return calculateWeeklySalary() * 0.1; // 10% weekly bonus
    }

    // Display detailed information for HourlyEmployee
    public void displayInfo() {
        super.displayInfo(); // Calling base class displayInfo using super
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Salary: $" + calculateWeeklySalary());
        System.out.println("Bonus: $" + calculateBonus());
    }
}
