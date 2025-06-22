package FinancialForecasting.main;

import FinancialForecasting.service.ForecastCalculator;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;
        double growthRate = 0.08;  // 8% annual growth
        int years = 5;

        double recursiveValue = ForecastCalculator.forecastRecursive(initialValue, growthRate, years);
        double iterativeValue = ForecastCalculator.forecastIterative(initialValue, growthRate, years);

        System.out.printf("📈 Recursive Forecast after %d years: ₹%.2f%n", years, recursiveValue);
        System.out.printf("⚙️ Iterative Forecast after %d years: ₹%.2f%n", years, iterativeValue);
    }
}
