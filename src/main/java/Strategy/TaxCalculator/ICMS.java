package Strategy.TaxCalculator;

public class ICMS implements Tax {

    public double calculate(Budget budget) {
        return budget.getValue() * 0.06 + 50;
    }
}
