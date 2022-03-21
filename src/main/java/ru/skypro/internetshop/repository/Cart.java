package ru.skypro.internetshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
@SessionScope
public class Cart {

    private final List<Integer> items = new ArrayList<>();

    public Collection<Integer> getItems() {
        return items;
    }

    public int addItem(int item) {
        items.add(item);
        return item;
    }
}
