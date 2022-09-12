
package com.portafolio.back.service;

import com.portafolio.back.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public Persona crearPersona (Persona persona);
    
    public void borrarPersona (Long id);
        
    public Persona modificarPersona (Persona persona);
    
    public Persona buscarPersona(Long id);
    
}
