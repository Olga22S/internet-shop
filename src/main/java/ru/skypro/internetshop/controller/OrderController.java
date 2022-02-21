package ru.skypro.internetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.internetshop.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(value = "/add")
    public void addItems(@RequestParam int... items) {
        cartService.addItems(items);
    }

    @GetMapping(value = "/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
