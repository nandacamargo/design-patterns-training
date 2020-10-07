package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public class NoDiscount implements Discount {

    public double discount(Budget budget) {
        return 0;
    }

    public void setNextDiscount(Discount discount) { }
}
