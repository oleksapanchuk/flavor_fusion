package dev.panoleksa.ffood.controller;

import dev.panoleksa.ffood.model.Order;
import dev.panoleksa.ffood.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fun-food/admin")
@CrossOrigin
public class OrderController {
    private final OrderRepository repository;

    @Autowired
    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all-orders")
    public List<Order> findAll() {
        return repository.findAll();
    }

}
