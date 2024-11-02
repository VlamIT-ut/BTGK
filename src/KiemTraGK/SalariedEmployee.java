package KiemTraGK;

// Lớp SalariedEmployee kế thừa từ Employee
class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public void print() {
        System.out.println("Salaried employee:");
        super.print();
        System.out.printf("Weekly salary: %.2f\n", weeklySalary);
    }
    //logic code theo yeu cau ...
}