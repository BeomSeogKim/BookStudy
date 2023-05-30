public class InsertManager {
    public static void main(String[] args) {
        InsertManager insertManager = new InsertManager();
        for (int i = 1; i <= 365; i += 10) {
            System.out.println(i + " 째 이자 : " + insertManager.getInterestRate(i) +
                    " | 받는 금액 : " + insertManager.calculateAmount(i, 1000000));
        }
    }

    public double getInterestRate(int day) {
        if (day >= 1 && day <=90) {
            return 0.005;
        } else if (day <= 180) {
            return 0.01;
        } else if (day <= 364) {
            return 0.02;
        } else {
            return 0.056;
        }
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        double interest = amount * interestRate;
        return amount + interest;
    }
}