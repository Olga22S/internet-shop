package ru.skypro.internetshop.service;

import java.util.Collection;
import java.util.List;

public interface CartService {

    List<Integer> addItems(int... items);

    Collection<Integer> getItems();
}
