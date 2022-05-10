
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaLaboral;
import com.miportfolio.argProgramaBackend.Repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IService<ExperienciaLaboral>{
    
    @Autowired
    public ExperienciaLaboralRepository expLaboralRepo;
    
    @Override
    public List<ExperienciaLaboral> buscarObjetos(){
        return expLaboralRepo.findAll();
    };
    
    @Override
    public ExperienciaLaboral buscarObjetoById(Long id){
        return expLaboralRepo.findById(id).orElse(null);
    };
    
    @Override
    public ExperienciaLaboral crearObjeto(ExperienciaLaboral expLaboral){
        return expLaboralRepo.save(expLaboral);
    };
    
    @Override
    public ExperienciaLaboral editarObjeto(ExperienciaLaboral expLaboral){
        return expLaboralRepo.save(expLaboral);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        expLaboralRepo.deleteById(id);
    };
 
}