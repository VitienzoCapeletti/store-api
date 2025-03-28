package com.store_api.repositories;

import com.store_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(String id);

}
