package dev.panoleksa.funfood.controller;

import dev.panoleksa.funfood.model.Product;
import dev.panoleksa.funfood.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funfood/menu")
@CrossOrigin
public class ProductController {

    private final ProductRepository repository;

    @Autowired
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Product> findAll() {
        return repository.findAll();
    }


}
