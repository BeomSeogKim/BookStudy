package Chapter13;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);

    private int maxSalary;
    private double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public static HealthInsurance getRatio(int salary) {
        if (salary <= LEVEL_ONE.maxSalary) {
            return LEVEL_ONE;
        } else if (salary <= LEVEL_TWO.maxSalary) {
            return LEVEL_TWO;
        } else if (salary <= LEVEL_THREE.maxSalary) {
            return LEVEL_THREE;
        } else if (salary <= LEVEL_FOUR.maxSalary) {
            return LEVEL_FOUR;
        } else if (salary <= LEVEL_FIVE.maxSalary) {
            return LEVEL_FIVE;
        } else {
            return LEVEL_SIX;
        }
    }

    public static void main(String[] args) {
        int[] salaryArray = {1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getRatio(salaryArray[0]);
        insurances[1] = HealthInsurance.getRatio(salaryArray[1]);
        insurances[2] = HealthInsurance.getRatio(salaryArray[2]);

        for (int loop = 0; loop < 3; loop++) {
            System.out.println(salaryArray[loop] + "=" + insurances[loop] + "," + insurances[loop].ratio);
        }
    }
}
