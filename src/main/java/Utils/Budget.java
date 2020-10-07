package Utils;


import ChainOfResponsibility.DiscountCalculator.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    private final double value;
    private final List<Item> items;


    public Budget(double value) {
        this.value = value;
        this.items = new ArrayList<Item>();
    }

    public double getValue() {
        return value;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }


    public boolean containsItem(String itemName) {
        for (Item item : items) {
            if (item.getName().contains(itemName)) return true;
        }
        return false;
    }
}
