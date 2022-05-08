/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Modelo;

import com.miportfolio.argProgramaBackend.Controller.Casa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true )
//    @JoinColumn(name="persona")
//    private Curriculum cv;
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
//    @JoinColumn(name="persona")
//    private List<RedSocial> redes;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="dueño_id")
    private List<Casa> casa;
    
    
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido
//    , Curriculum cv, List<RedSocial> redes
    ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
//        this.cv = cv;
//        this.redes = redes;
    }
    
    
}
