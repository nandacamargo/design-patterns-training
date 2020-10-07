package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public interface Discount {
    double discount(Budget budget);
    void setNextDiscount(Discount discount);
}
