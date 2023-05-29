package com.flavorflusion.fullstackbackend.repository;

import com.flavorflusion.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
