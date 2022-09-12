package com.portafolio.back.Controller;

import com.portafolio.back.model.Experiencia;
import com.portafolio.back.service.IExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final IExperienciaService experienciaService;
    
    public ExperienciaController(IExperienciaService experienciaService){
        this.experienciaService=experienciaService;
    }
    
    @GetMapping("/todo")
    public ResponseEntity <List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencia=experienciaService.verExperiencia();
        return new ResponseEntity<>(experiencia,HttpStatus.OK);
    }
    
    @PutMapping("/modificar")
    public ResponseEntity<Experiencia> modificarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia experienciaModificada=experienciaService.modificarExperiencia(experiencia);
        return new ResponseEntity<>(experienciaModificada,HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia experienciaCreada=experienciaService.crearExperiencia(experiencia);
        return new ResponseEntity<>(experienciaCreada,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarExperiencia(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Experiencia> buscarExperiencia(@PathVariable("id") Long id){
        Experiencia experienciaBuscada=experienciaService.buscarExperiencia(id);
        return new ResponseEntity<>(experienciaBuscada,HttpStatus.OK);
    }
}
