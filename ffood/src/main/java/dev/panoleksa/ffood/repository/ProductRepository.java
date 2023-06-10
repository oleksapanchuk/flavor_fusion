package dev.panoleksa.ffood.repository;

import dev.panoleksa.ffood.model.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Integer> {
}
