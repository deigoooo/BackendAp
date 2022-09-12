
package com.portafolio.back.service;

import com.portafolio.back.model.Skills;
import java.util.List;


public interface ISkillsService {
  
    public List<Skills> verSkills();
    
    public Skills crearSkills (Skills skills);
    
    public void borrarSkills (Long id);
        
    public Skills modificarSkills (Skills skills);
    
    public Skills buscarSkills(Long id);
}
