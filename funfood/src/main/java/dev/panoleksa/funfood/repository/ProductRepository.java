package dev.panoleksa.funfood.repository;

import dev.panoleksa.funfood.model.Product;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@NoArgsConstructor
public class ProductRepository {

    private final List<Product> productList = new ArrayList<>();

    public List<Product> findAll() {
        return productList;
    }

}
