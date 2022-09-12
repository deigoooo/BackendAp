package com.portafolio.back.service;

import com.portafolio.back.exception.UserNotFoundException;
import com.portafolio.back.model.Persona;
import com.portafolio.back.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService{
    
    private final PersonaRepository perRepo;
    
    @Autowired
    public PersonaService(PersonaRepository perRepo) {
        this.perRepo = perRepo;
    }

    @Override
    public List<Persona> verPersonas() {
        return perRepo.findAll();
    }    

    @Override
    public void borrarPersona(Long id) {
        perRepo.deleteById(id);
    }   

    @Override
    public Persona buscarPersona(Long id) {
        return perRepo.findById(id).orElseThrow(()->new UserNotFoundException("usuario no encontrado"));
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return perRepo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return perRepo.save(persona);
    }
   


    
    


    
}

