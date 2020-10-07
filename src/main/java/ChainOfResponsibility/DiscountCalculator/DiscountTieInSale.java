package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public class DiscountTieInSale implements Discount {

    private Discount nextDiscount;

    public double discount(Budget budget) {
        if (budget.containsItem("Pen") &&
                budget.containsItem("Pencil")) {
            return budget.getValue() * 0.05;
        }

        return nextDiscount.discount(budget);
    }

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }
}
