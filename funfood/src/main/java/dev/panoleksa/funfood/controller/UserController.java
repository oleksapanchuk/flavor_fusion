package dev.panoleksa.funfood.controller;

import dev.panoleksa.funfood.model.Product;
import dev.panoleksa.funfood.model.User;
import dev.panoleksa.funfood.repository.ProductRepository;
import dev.panoleksa.funfood.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funfood/user")
@CrossOrigin
public class UserController {

    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<User> findAll() {
        return repository.findAll();
    }
}
