package com.portafolio.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreEmpresa;
    private String actual;
    private String fechaIniExp;
    private String fechaFinExp;
    private String puesto;
    private String referencia;
    private String contacto;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nombreEmpresa, String actual, String fechaIniExp, String fechaFinExp, String puesto, String referencia, String contacto) {
        this.idExp = idExp;
        this.nombreEmpresa = nombreEmpresa;
        this.actual = actual;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.puesto = puesto;
        this.referencia = referencia;
        this.contacto = contacto;
    }
    
    


    
    
    
}
