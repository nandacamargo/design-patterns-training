package Strategy.TaxCalculator;

public class ICCC implements Tax {
    public double calculate(Budget budget) {

        double value = budget.getValue();
        if (value < 1000)
            return budget.getValue() * 0.05;
        else if (value >= 1000 && value <= 3000)
            return budget.getValue() * 0.07;

        return budget.getValue() * 0.08 + 30;
    }
}

