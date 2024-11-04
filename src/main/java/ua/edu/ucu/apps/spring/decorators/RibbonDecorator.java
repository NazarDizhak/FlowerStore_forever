package ua.edu.ucu.apps.spring.decorators;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.spring.item.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final int ADDITION_CONSTANT = 40;
    private Item item;
    @Getter @Setter 
    private String description;

    public RibbonDecorator(Item getItem) {
        item = getItem;
        description = "This is a ribbon";
    }

    public RibbonDecorator(Item getItem, String getDescription) {
        item = getItem;
        description = getDescription;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + ADDITION_CONSTANT;
    }
}