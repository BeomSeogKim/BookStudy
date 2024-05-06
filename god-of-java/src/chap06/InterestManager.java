public class InterestManager {

    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for (int days = 1; days <= 365; days += 10) {
            double amount = manager.calculateAmount(days, 100);
            System.out.println(days + "of total amount : " + amount);
        }

    }

    public double getInterestRate(int day) {
        if (day >= 1 && day <= 90) return 0.005;
        if (day >= 91 && day <= 180) return 0.01;
        if (day >= 181 && day <= 364) return 0.02;
        if (day >= 365) return 0.056;
        return 0.0;
    }

    // day : 예금 거치 기간, amount : 예치 금액 return :
    public double calculateAmount(int day, long amount) {
        return amount + (amount * getInterestRate(day));
    }
}