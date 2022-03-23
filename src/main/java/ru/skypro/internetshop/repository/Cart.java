package ru.skypro.internetshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Repository
@SessionScope
public class Cart {

    private final List<Integer> itemStorage = new ArrayList<>();

    public Collection<Integer> getItems() {
        return Collections.unmodifiableCollection(itemStorage);
    }

    public int[] addItem(int... items) {
        Arrays.stream(items)
                .forEach(itemStorage::add);
        return items;
    }
}
