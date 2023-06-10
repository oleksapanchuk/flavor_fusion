package dev.panoleksa.ffood.repository;

import dev.panoleksa.ffood.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


}
