package ua.edu.ucu.apps.spring.filters;

import ua.edu.ucu.apps.spring.item.Item;

public interface Filter {
    boolean match(Item item);
}
