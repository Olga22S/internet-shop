package ru.skypro.internetshop.service;

import org.springframework.stereotype.Service;
import ru.skypro.internetshop.model.Cart;

import java.util.Arrays;
import java.util.Collection;

@Service
public class CarServiceImpl implements CartService {

    private final Cart cart;

    public CarServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItems(int... items) {
        Arrays.stream(items)
                .forEach(s -> cart.getItems().add(s));
    }

    @Override
    public Collection<Integer> getItems() {
        return cart.getItems();
    }
}
