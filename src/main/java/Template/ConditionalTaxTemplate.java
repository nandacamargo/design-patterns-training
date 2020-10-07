package Template;

import Utils.Budget;

public abstract class ConditionalTaxTemplate implements Tax {

    public double calculate(Budget budget) {
        if (shouldBeMaxTax(budget))
            return maxTax(budget);
        return minTax(budget);
    }

    public abstract double minTax(Budget budget);
    public abstract double maxTax(Budget budget);
    public abstract boolean shouldBeMaxTax(Budget budget);

}
