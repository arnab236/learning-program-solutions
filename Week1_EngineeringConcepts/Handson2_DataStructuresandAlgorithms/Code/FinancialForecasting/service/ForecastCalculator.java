package FinancialForecasting.service;

public class ForecastCalculator {

    // Recursive approach
    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Iterative approach (optimized)
    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double value = initialValue;
        for (int i = 0; i < years; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }
}
