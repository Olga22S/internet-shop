package ru.skypro.internetshop.service;

import org.springframework.stereotype.Service;
import ru.skypro.internetshop.repository.Cart;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CartService {

    private final Cart cart;

    public CarServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(int... items) {
        return Arrays.stream(items)
                .map(cart::addItem)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Integer> getItems() {
        return Collections.unmodifiableCollection(cart.getItems());
    }
}
