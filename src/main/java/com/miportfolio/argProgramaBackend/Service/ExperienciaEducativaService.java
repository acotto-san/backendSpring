
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaEducativa;
import com.miportfolio.argProgramaBackend.Repository.ExperienciaEducativaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaEducativaService implements IService<ExperienciaEducativa>{
    
    @Autowired
    public ExperienciaEducativaRepository expEducativaRepo;
    
    @Override
    public List<ExperienciaEducativa> buscarObjetos(){
        return expEducativaRepo.findAll();
    };
    
    @Override
    public ExperienciaEducativa buscarObjetoById(Long id){
        return expEducativaRepo.findById(id).orElse(null);
    };
    
    @Override
    public ExperienciaEducativa crearObjeto(ExperienciaEducativa expEducativa){
        return expEducativaRepo.save(expEducativa);
    };
    
    @Override
    public ExperienciaEducativa editarObjeto(ExperienciaEducativa expEducativa){
        return expEducativaRepo.save(expEducativa);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        expEducativaRepo.deleteById(id);
    };
 
}