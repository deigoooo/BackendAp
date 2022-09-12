package com.portafolio.back.Controller;

import com.portafolio.back.model.Skills;
import com.portafolio.back.service.ISkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    private final ISkillsService skillsService;
    
    public SkillsController(ISkillsService skillsService){
        this.skillsService=skillsService;
    }
    
    @GetMapping("/todo")
    public ResponseEntity <List<Skills>> obtenerSkills(){
        List<Skills> skills=skillsService.verSkills();
        return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @PutMapping("/modificar")
    public ResponseEntity<Skills> modificarSkills(@RequestBody Skills skills){
        Skills skillsModificada=skillsService.modificarSkills(skills);
        return new ResponseEntity<>(skillsModificada,HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills skillsCreada=skillsService.crearSkills(skills);
        return new ResponseEntity<>(skillsCreada,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarSkills(@PathVariable ("id") Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Skills> buscarSkills(@PathVariable("id") Long id){
        Skills skillsBuscada=skillsService.buscarSkills(id);
        return new ResponseEntity<>(skillsBuscada,HttpStatus.OK);
    }
}
