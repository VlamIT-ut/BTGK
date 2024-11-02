package KiemTraGK;

// Lớp CommissionEmployee kế thừa từ Employee
class CommissionEmployee extends Employee {
    private double grossSales; // Doanh thu tổng
    private double commissionRate; // Tỷ lệ hoa hồng
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public double  getgrossSales(){
        return grossSales;
    }

    public double  getcommissionRate(){
        return commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate*grossSales;
    }
    @Override
    public void print() {
        super.print();
        System.out.printf("Gross sales: %.2f\nCommission rate: %.2f\n",
                grossSales, commissionRate);
    }
    //logic code theo yêu cầu

}