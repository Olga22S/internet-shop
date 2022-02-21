package ru.skypro.internetshop.service;

import java.util.List;

public interface CartService {

    void addItems(int... items);

    List<Integer> getItems();
}
