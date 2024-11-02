package KiemTraGK;

public class Main {
    public static void main(String[] args) {
        // Create array of Employee references
        Employee[] employees = new Employee[4];

        // Initialize array with different types of employees
        employees[0] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.00);

        employees[1] = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000.00, 0.06);

        employees[2] = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000.00, 0.04, 300.00);

        employees[3] = new SalariedEmployee(
                "Karen", "Price", "444-44-4444", 600.00);

        System.out.println("Processing all employees polymorphically:\n");

        // Process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(); // blank line

            // Output employee information and earnings
            currentEmployee.print();
            System.out.printf("Earned: $%,.2f\n", currentEmployee.earnings());
        }

        // Get the type of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("\nEmployee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}