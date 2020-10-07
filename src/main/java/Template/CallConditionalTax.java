package Template;

import ChainOfResponsibility.DiscountCalculator.Item;
import Utils.Budget;

public class CallConditionalTax {

    public static void main(String[] args) {
        ICPP icpp = new ICPP();
        IKCV ikcv = new IKCV();

        Budget budget1 = new Budget(500.0);
        budget1.addItem(new Item("Keyboard", 150.0));
        budget1.addItem(new Item("Monitor", 350.0));

        Budget budget2 = new Budget(600.0);
        budget2.addItem(new Item("Keyboard", 100.0));
        budget2.addItem(new Item("Monitor", 500.0));

        System.out.println(icpp.calculate(budget1));
        System.out.println(ikcv.calculate(budget2));
    }
}
