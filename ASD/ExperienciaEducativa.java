/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaEducativa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String titulo;
    private String codigoCredencial;
    private String linkValidacionCredencial;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="container_id")
    private Foto certificado;

    public ExperienciaEducativa() {
    }

    public ExperienciaEducativa(Long id, String institucion, String titulo, String codigoCredencial, String linkValidacionCredencial, Foto certificado) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.codigoCredencial = codigoCredencial;
        this.linkValidacionCredencial = linkValidacionCredencial;
        this.certificado = certificado;
    }
    
    
}
