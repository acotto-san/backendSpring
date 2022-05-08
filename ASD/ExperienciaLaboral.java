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
public class ExperienciaLaboral extends ExperienciaTemporal implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreEmpresa;
    
    private String ubicacion;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="exp_laboral")
    private List<ExperienciaPuesto> puestos;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="container_id")
    private Foto logoEmpresa;
}
