/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Modelo;
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
public class Curriculum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="cv")
    private Banner banner;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="cv")
    private List<ExperienciaLaboral> experiencias;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="cv")
    private List<ExperienciaEducativa> educacion;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="cv")
    private List<Skill> skills;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="cv")
    private List<Proyecto> proyectos;
}
