package ru.skypro.internetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.internetshop.service.CartService;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public int[] addItems(@RequestParam int... items) {
        return cartService.addItems(items);
    }

    @GetMapping("/get")
    public Collection<Integer> getItems() {
        return cartService.getItems();
    }
}
