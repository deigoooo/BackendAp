
package com.portafolio.back.service;

import com.portafolio.back.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public Experiencia crearExperiencia (Experiencia experiencia);
    
    public void borrarExperiencia (Long id);
        
    public Experiencia modificarExperiencia (Experiencia experiencia);
    
    public Experiencia buscarExperiencia(Long id);
}
