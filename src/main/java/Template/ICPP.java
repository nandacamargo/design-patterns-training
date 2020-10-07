package Template;

import ChainOfResponsibility.DiscountCalculator.Item;
import Utils.Budget;

public class ICPP extends ConditionalTaxTemplate {

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.05;
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.07;
    }

    @Override
    public boolean shouldBeMaxTax(Budget budget) {
        return budget.getValue() > 500;
    }

}