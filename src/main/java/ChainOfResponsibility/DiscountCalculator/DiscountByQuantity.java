package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public class DiscountByQuantity implements Discount {

    private Discount nextDiscount;

    public double discount(Budget budget) {
        if (budget.getItems().size() >= 5)
            return budget.getValue() * 0.1;

        return nextDiscount.discount(budget);
    }

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }
}
