package Template;

import ChainOfResponsibility.DiscountCalculator.Item;
import Utils.Budget;

public class IKCV extends ConditionalTaxTemplate {

    private boolean biggerThan100(Budget budget) {
        for (Item item : budget.getItems())
            if (item.getPrice() > 100)
                return true;
        return false;
    }

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    public boolean shouldBeMaxTax(Budget budget) {
        return budget.getValue() > 500 && biggerThan100(budget);
    }

}