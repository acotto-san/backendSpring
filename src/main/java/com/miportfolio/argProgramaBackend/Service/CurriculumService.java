/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Curriculum;
import com.miportfolio.argProgramaBackend.Repository.CurriculumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculumService implements IService<Curriculum>{
    
    @Autowired
    public CurriculumRepository cvRepo;
    
    @Override
    public List<Curriculum> buscarObjetos(){
        return cvRepo.findAll();
    };
    
    @Override
    public Curriculum buscarObjetoById(Long id){
        return cvRepo.findById(id).orElse(null);
    };
    
    @Override
    public Curriculum crearObjeto(Curriculum cv){
        return cvRepo.save(cv);
    };
    
    @Override
    public Curriculum editarObjeto(Curriculum cv){
        return cvRepo.save(cv);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        cvRepo.deleteById(id);
    };
 
}
