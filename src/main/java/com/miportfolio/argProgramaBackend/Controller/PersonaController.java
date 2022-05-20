
package com.miportfolio.argProgramaBackend.Controller;

import com.miportfolio.argProgramaBackend.Modelo.Persona;
import com.miportfolio.argProgramaBackend.Service.IService;
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
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    private IService<Persona> persoServ;
    String[] crossURLs = {"http://localhost:4200","http://localhost:53277"};
    
    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<Persona>> buscarPersonas(){
        List<Persona> todasLasPersonas = persoServ.buscarObjetos();
        return new ResponseEntity<>(todasLasPersonas, HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Persona> buscarPersonaById(@PathVariable("id") Long id){
        Persona personaEncontrada = persoServ.buscarObjetoById(id);
        return new ResponseEntity<>(personaEncontrada, HttpStatus.OK);
    }
  
    @PostMapping("/create")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona pers){
        Persona nuevaPersona = persoServ.crearObjeto(pers);
        return new ResponseEntity<>(nuevaPersona, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona pers){
        Persona personaEditada = persoServ.editarObjeto(pers);
        return new ResponseEntity<>(personaEditada, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarPersona(@PathVariable("id") Long id){
        persoServ.borrarObjetoById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
