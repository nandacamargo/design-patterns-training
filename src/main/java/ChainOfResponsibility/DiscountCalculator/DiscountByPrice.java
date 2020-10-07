package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public class DiscountByPrice implements Discount {

    private Discount nextDiscount;

    public double discount(Budget budget) {
        if (budget.getValue() > 500)
            return budget.getValue() * 0.07;

        return nextDiscount.discount(budget);
    }

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }
}
