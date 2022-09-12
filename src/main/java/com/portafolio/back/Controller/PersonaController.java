package com.portafolio.back.Controller;

import com.portafolio.back.model.Persona;
import com.portafolio.back.service.IPersonaService;
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
@RequestMapping("/persona")

public class PersonaController {

    private final IPersonaService personaService;
    
    public PersonaController(IPersonaService personaService){
        this.personaService=personaService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona=personaService.buscarPersona(id);
        return new ResponseEntity<>(persona,HttpStatus.OK);
    }
    
    @PutMapping("/modificar")
    public ResponseEntity<Persona> modificarPersona(@RequestBody Persona persona){
        Persona personaModificada= personaService.modificarPersona(persona);
        return new ResponseEntity<>(personaModificada,HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona){
        Persona personaCreada= personaService.crearPersona(persona);
        return new ResponseEntity<>(personaCreada,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Persona> buscarPersona(@PathVariable("id") Long id){
        Persona personaBuscada=personaService.buscarPersona(id);
        return new ResponseEntity<>(personaBuscada,HttpStatus.OK);
    }
}
    

