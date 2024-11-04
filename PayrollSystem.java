// Test program to showcase the employee payroll system
public class PayrollSystem {
    public static void main(String[] args) {
        // Creating an HourlyEmployee object
        HourlyEmployee hourlyEmp = new HourlyEmployee(1, "GAMYA", "Assistant", 40.0, 40);

        // Creating a SalariedEmployee object
        SalariedEmployee salariedEmp = new SalariedEmployee(2, "JEWEL", "Professor", 10000.0);

        // Creating an ExecutiveEmployee object
        ExecutiveEmployee execEmp = new ExecutiveEmployee(3, "JOSMI", "Dean", 8000.0, 15.0);

        // Displaying details for each employee type
        System.out.println("Hourly Employee Details:");
        hourlyEmp.displayInfo();

        System.out.println("\nSalaried Employee Details:");
        salariedEmp.displayInfo();

        System.out.println("\nExecutive Employee Details:");
        execEmp.displayInfo();

        // Calculating total payroll (weekly salary + bonus) for demonstration
        double totalPayroll = hourlyEmp.calculateWeeklySalary() + hourlyEmp.calculateBonus()
                            + salariedEmp.calculateWeeklySalary() + salariedEmp.calculateBonus()
                            + execEmp.calculateWeeklySalary() + execEmp.calculateBonus();

        System.out.println("\nTotal Payroll: $" + totalPayroll);
    }
}
