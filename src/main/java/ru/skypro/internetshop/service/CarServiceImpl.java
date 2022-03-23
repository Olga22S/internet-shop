package ru.skypro.internetshop.service;

import org.springframework.stereotype.Service;
import ru.skypro.internetshop.repository.Cart;

import java.util.Collection;

@Service
public class CarServiceImpl implements CartService {

    private final Cart cart;

    public CarServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public int[] addItems(int... items) {
        return cart.addItem(items);
    }

    @Override
    public Collection<Integer> getItems() {
        return cart.getItems();
    }
}
