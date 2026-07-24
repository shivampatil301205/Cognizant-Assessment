import java.util.HashMap;

public class FinancialForecasting {

    public static double recursiveForecast(double value, double rate, int years) {
        if (years == 0) {
            return value;
        }
        return recursiveForecast(value * (1 + rate), rate, years - 1);
    }

    public static double memoizedForecast(double value, double rate, int years, HashMap<Integer, Double> memo) {
        if (years == 0) {
            return value;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double result = memoizedForecast(value, rate, years - 1, memo) * (1 + rate);
        memo.put(years, result);
        return result;
    }

    public static double iterativeForecast(double value, double rate, int years) {
        double result = value;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        System.out.printf("Recursive Forecast: %.2f%n", recursiveForecast(initialValue, growthRate, years));
        System.out.printf("Memoized Forecast: %.2f%n", memoizedForecast(initialValue, growthRate, years, new HashMap<>()));
        System.out.printf("Iterative Forecast: %.2f%n", iterativeForecast(initialValue, growthRate, years));
    }
}