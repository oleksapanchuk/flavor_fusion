package dev.panoleksa.funfood.repository;

import dev.panoleksa.funfood.model.Product;
import dev.panoleksa.funfood.model.User;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@NoArgsConstructor
public class UserRepository {

    private final List<User> userList = new ArrayList<>();

    public List<User> findAll() {
        return userList;
    }

}
