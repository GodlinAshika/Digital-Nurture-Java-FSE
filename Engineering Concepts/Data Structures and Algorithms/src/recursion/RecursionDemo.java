package recursion;

public class RecursionDemo {

    public static void main(String[] args) {
        double presentValue = 100000.0;
        double growthRate = 0.08;
        int years = 5;

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
