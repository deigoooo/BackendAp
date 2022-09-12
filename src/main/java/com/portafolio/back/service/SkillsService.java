package com.portafolio.back.service;

import com.portafolio.back.exception.UserNotFoundException;
import com.portafolio.back.model.Skills;
import com.portafolio.back.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService implements ISkillsService{
    
    private final SkillsRepository skiRepo;

    @Autowired
    public SkillsService(SkillsRepository skiRepo) {
        this.skiRepo = skiRepo;
    }

    @Override
    public List<Skills> verSkills() {
        return skiRepo.findAll();
    }

    @Override
    public Skills crearSkills(Skills skills) {
        return skiRepo.save(skills);
    }

    @Override
    public void borrarSkills(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skills modificarSkills(Skills skills) {
        return skiRepo.save(skills);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skiRepo.findById(id).orElseThrow(()->new UserNotFoundException("skills no encontrado"));
    }


    

    
}
