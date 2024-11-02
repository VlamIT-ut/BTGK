package KiemTraGK;

// Lớp BasePlusCommissionEmployee kế thừa từ CommissionEmployee
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // Lương cơ bản
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        // 10% increase to base salary as per requirement
        return (baseSalary * 1.1) + super.earnings();
    }

    @Override
    public void print() {
        System.out.println("Base-salaried commission employee:");
        super.print();
        System.out.printf("Base salary: %.2f\n", baseSalary);
    }
//logic code theo yeu cau

}