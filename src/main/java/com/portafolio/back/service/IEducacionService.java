
package com.portafolio.back.service;

import com.portafolio.back.model.Educacion;
import java.util.List;


public interface IEducacionService {
        
    public List<Educacion> verEducacion();
    
    public Educacion crearEducacion (Educacion educacion);
    
    public void borrarEducacion (Long id);
        
    public Educacion modificarEducacion (Educacion educacion);
    
    public Educacion buscarEducacion(Long id);
    
}
    

