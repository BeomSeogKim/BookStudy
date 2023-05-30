public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = (double) yearlySalary / 12.0;
        double result = monthSalary;
        result -= calculateTax(monthSalary);
        result -= calculateNationalPension(monthSalary);
        result -= calculateHealthInsurance(monthSalary);
        return result;
    }

    public double calculateTax(double monthSalary) {
        return monthSalary * 0.125;
    }

    public double calculateNationalPension(double monthSalary) {
        return monthSalary * 0.081;
    }

    public double calculateHealthInsurance(double monthSalary) {
        return monthSalary * 0.135;
    }

}