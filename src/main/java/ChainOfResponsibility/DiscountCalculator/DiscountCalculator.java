package ChainOfResponsibility.DiscountCalculator;

import Utils.Budget;

public class DiscountCalculator {

    public double calculate(Budget budget) {
        Discount discount1 = new DiscountByQuantity();
        Discount discount2 = new DiscountByPrice();
        Discount discount3 = new DiscountTieInSale();
        Discount discount4 = new NoDiscount();

        discount1.setNextDiscount(discount2);
        discount2.setNextDiscount(discount3);
        discount3.setNextDiscount(discount4);

        return discount1.discount(budget);
    }
}
