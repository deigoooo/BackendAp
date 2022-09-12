package com.portafolio.back.security.service;

import com.portafolio.back.model.User;
import com.portafolio.back.security.repository.iUserRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    iUserRepository iuserRepo;

    public boolean existsByEmail(String email) {
        return iuserRepo.existsByEmail(email);
    }

    public void save(User usuario) {
        iuserRepo.save(usuario);
    }
}
