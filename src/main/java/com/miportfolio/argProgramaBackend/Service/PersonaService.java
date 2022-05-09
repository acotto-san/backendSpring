/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Persona;
import com.miportfolio.argProgramaBackend.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> findAll() {
      return persoRepo.findAll();
    }

    @Override
    public void save(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void deleteById(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findById(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
