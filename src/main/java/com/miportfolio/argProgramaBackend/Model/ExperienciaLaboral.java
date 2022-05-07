/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author otto
 */
public class ExperienciaLaboral extends ExperienciaTemporal {
    private String nombreEmpresa;
    private String ubicacion;
    private List<ExperienciaPuesto> puestos;
    private Imagen logoEmpresa;
}
