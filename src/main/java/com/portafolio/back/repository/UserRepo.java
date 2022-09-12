package com.portafolio.back.repository;

import com.portafolio.back.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer>{
    Optional<User>findByEmail(String email);
    
}
