
package com.portafolio.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String institucion;
    private String estado;
    private String fechaIniEdu;
    private String fechaFinEdu;
    private String titulo;

    public Educacion() {
    }

    public Educacion(Long idEdu, String institucion, String estado, String fechaIniEdu, String fechaFinEdu, String titulo) {
        this.idEdu = idEdu;
        this.institucion = institucion;
        this.estado = estado;
        this.fechaIniEdu = fechaIniEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.titulo = titulo;
    }
    
    
    
}
