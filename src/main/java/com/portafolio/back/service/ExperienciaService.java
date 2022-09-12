package com.portafolio.back.service;

import com.portafolio.back.exception.UserNotFoundException;
import com.portafolio.back.model.Experiencia;
import com.portafolio.back.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
    
    private final ExperienciaRepository expRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository expRepo) {
        this.expRepo = expRepo;
    }

    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElseThrow(()->new UserNotFoundException("experiencia no encontrada"));
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return expRepo.save(experiencia);
    }

    @Override
    public Experiencia modificarExperiencia(Experiencia experiencia) {
        return expRepo.save(experiencia);
    }
    
    
    
}
