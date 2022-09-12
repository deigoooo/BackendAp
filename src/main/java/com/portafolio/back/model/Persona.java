
package com.portafolio.back.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
/*@Table (name="persona")*/
public class Persona implements Serializable{
        
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String fechaNac;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String url_fondo;
    private String usuario;
    private String pass;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idSki")
    private List<Skills> skillList;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, String fechaNac, String telefono, String correo, String sobre_mi, String url_foto, String url_fondo, String usuario, String pass, List<Educacion> educacionList, List<Skills> skillList, List<Experiencia> experienciaList) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_fondo = url_fondo;
        this.usuario = usuario;
        this.pass = pass;
        this.educacionList = educacionList;
        this.skillList = skillList;
        this.experienciaList = experienciaList;
    }

 
    
    

    
    
    
    
    
}
