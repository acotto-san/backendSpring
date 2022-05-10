
package com.miportfolio.argProgramaBackend.Controller;

import com.miportfolio.argProgramaBackend.Service.IService;
import com.miportfolio.argProgramaBackend.Modelo.ExperienciaLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp-laborales")
public class ExperienciaLaboralController {
    
    @Autowired
    private IService<ExperienciaLaboral> expLaboralServ;
    
    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<ExperienciaLaboral>> buscarExperienciasLaborales(){
        List<ExperienciaLaboral> todasLasExperienciasLaborales = expLaboralServ.buscarObjetos();
        return new ResponseEntity<>(todasLasExperienciasLaborales, HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<ExperienciaLaboral> buscarExperienciaLaboralByID(@PathVariable("id") Long id){
        ExperienciaLaboral experienciaLaboralEncontrada = expLaboralServ.buscarObjetoById(id);
        return new ResponseEntity<>(experienciaLaboralEncontrada, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<ExperienciaLaboral> crearExperienciaLaboral(@RequestBody ExperienciaLaboral expLaboral){
        ExperienciaLaboral nuevaExperienciaLaboral = expLaboralServ.crearObjeto(expLaboral);
        return new ResponseEntity<>(nuevaExperienciaLaboral, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<ExperienciaLaboral> editarExperienciaLaboral(@RequestBody ExperienciaLaboral expLaboral){
        ExperienciaLaboral curriculumEditado = expLaboralServ.editarObjeto(expLaboral);
        return new ResponseEntity<>(curriculumEditado, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarExperienciaLaboral(@PathVariable("id") Long id){
        expLaboralServ.borrarObjetoById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
