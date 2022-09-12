package com.portafolio.back.security.repository;

import com.portafolio.back.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iUserRepository extends JpaRepository<User, Integer>{
    Optional<User>findByEmail(String email);   
    boolean existsByEmail(String email);
}
