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
public class CurriculumService implements ICurriculumService{
    
    @Autowired
    public CurriculumRepository cvRepo;
    
    @Override
    public List<Curriculum> findAll(){
        return cvRepo.findAll();
    };
    
    @Override
    public void save(Curriculum cv){
        cvRepo.save(cv);
    };
    
    @Override
    public void deleteById(Long id){
        cvRepo.deleteById(id);
    };
    
    @Override
    public Curriculum findById(Long id){
        return cvRepo.findById(id).orElse(null);
    };
}
