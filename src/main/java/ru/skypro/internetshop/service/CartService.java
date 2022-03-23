package ru.skypro.internetshop.service;

import java.util.Collection;

public interface CartService {

    int[] addItems(int... items);

    Collection<Integer> getItems();
}
