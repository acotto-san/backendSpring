/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Controller;

import com.miportfolio.argProgramaBackend.Modelo.Curriculum;
import com.miportfolio.argProgramaBackend.Modelo.Persona;
import com.miportfolio.argProgramaBackend.Service.ICurriculumService;
import com.miportfolio.argProgramaBackend.Service.IPersonaService;
import com.miportfolio.argProgramaBackend.Service.PersonaService;
import java.util.List;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @GetMapping("/a")
    public String hola(){
        return "Hola mundo";
    }
    private static final String objetoDelController = "persona";
            
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/"+objetoDelController)
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.save(pers);
    }
    
    @GetMapping("/ver/"+objetoDelController)
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.findAll();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.deleteById(id);
    }
    @CrossOrigin
    @GetMapping("/persona/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.findById(id);
    }
    
    @PostMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                               @RequestBody Persona persona){
        persoServ.save(persona);
        return persona;
    }
    
    @Autowired
    private ICurriculumService cvServ;
    
    @GetMapping("/ver/curriculums")
    @ResponseBody
    public List<Curriculum> verCurriculums(){
        return cvServ.findAll();
    }
    
    @PostMapping("/new/curriculum")
    public void agregarPersona(@RequestBody Curriculum cv){
        cvServ.save(cv);
    }
}
