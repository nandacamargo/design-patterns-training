package ChainOfResponsibility.DiscountCalculator;

public interface Discount {
    double discount(Budget budget);
    void setNextDiscount(Discount discount);
}
