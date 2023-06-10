package dev.panoleksa.ffood.repository;

import dev.panoleksa.ffood.model.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order, Integer> {

}
