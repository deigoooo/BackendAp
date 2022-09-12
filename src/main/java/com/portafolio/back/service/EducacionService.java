package com.portafolio.back.service;

import com.portafolio.back.exception.UserNotFoundException;
import com.portafolio.back.model.Educacion;
import com.portafolio.back.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService implements IEducacionService{
    
    private final EducacionRepository eduRepo;
    
    @Autowired
    public EducacionService(EducacionRepository eduRepo) {
        this.eduRepo = eduRepo;
    }

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion educacion) {
        return eduRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion modificarEducacion(Educacion educacion) {
        return eduRepo.save(educacion);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElseThrow(()->new UserNotFoundException("educacion no encontrada"));
    }

    
    

    
    


}
