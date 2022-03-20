package ru.skypro.internetshop.service;

import java.util.Collection;

public interface CartService {

    void addItems(int... items);

    Collection<Integer> getItems();
}
