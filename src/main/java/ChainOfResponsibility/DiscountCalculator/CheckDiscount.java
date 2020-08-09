package ChainOfResponsibility.DiscountCalculator;

public class CheckDiscount {

    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator();

        Budget budget = new Budget(500.0);
        budget.addItem(new Item("Keyboard", 25.0));
        budget.addItem(new Item("Pen", 10.0));
        budget.addItem(new Item("Pencil", 12.0));

        System.out.println(calc.calculate(budget));

    }
}
