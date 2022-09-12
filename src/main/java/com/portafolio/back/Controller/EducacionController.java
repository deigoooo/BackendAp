package com.portafolio.back.Controller;

import com.portafolio.back.model.Educacion;
import com.portafolio.back.service.IEducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
    private final IEducacionService educacionService;
    
    public EducacionController(IEducacionService educacionService){
        this.educacionService=educacionService;
    }

    @GetMapping("/todo")
    public ResponseEntity <List<Educacion>> verEducaciones(){
        List<Educacion> educaciones=educacionService.verEducacion();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    
    @PutMapping("/modificar")
    public ResponseEntity<Educacion> modificarEducacion(@RequestBody Educacion educacion){
        Educacion educacionModificada=educacionService.modificarEducacion(educacion);
        return new ResponseEntity<>(educacionModificada,HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion educacionCreada=educacionService.crearEducacion(educacion);
        return new ResponseEntity<>(educacionCreada,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Educacion> buscarEducacion(@PathVariable("id") Long id){
        Educacion educacionBuscada=educacionService.buscarEducacion(id);
        return new ResponseEntity<>(educacionBuscada,HttpStatus.OK);
    }
}
