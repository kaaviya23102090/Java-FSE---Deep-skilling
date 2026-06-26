public class Demo {

    public static void main(String[] args) {

        double presentValue = 10000; // Initial Investment
        double growthRate = 0.10;    // 10% Growth Rate
        int years = 5;

        double futureValue1 =
            Forecast.futureValue(
                        presentValue,
                        growthRate,
                        years);

        System.out.println("Future Value after "
                + years + " years = "
                + futureValue1);
    }
}