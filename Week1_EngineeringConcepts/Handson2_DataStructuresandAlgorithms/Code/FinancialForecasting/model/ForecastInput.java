package FinancialForecasting.model;

public class ForecastInput {
    private double initialValue;
    private double growthRate;
    private int years;

    public ForecastInput(double initialValue, double growthRate, int years) {
        this.initialValue = initialValue;
        this.growthRate = growthRate;
        this.years = years;
    }

    public double getInitialValue() { return initialValue; }
    public double getGrowthRate() { return growthRate; }
    public int getYears() { return years; }
}
