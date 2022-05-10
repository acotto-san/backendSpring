
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaPuesto;
import com.miportfolio.argProgramaBackend.Repository.ExperienciaPuestoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaPuestoService implements IService<ExperienciaPuesto>{
    
    @Autowired
    public ExperienciaPuestoRepository ExperienciaPuestoRepo;
    
    @Override
    public List<ExperienciaPuesto> buscarObjetos(){
        return ExperienciaPuestoRepo.findAll();
    };
    
    @Override
    public ExperienciaPuesto buscarObjetoById(Long id){
        return ExperienciaPuestoRepo.findById(id).orElse(null);
    };
    
    @Override
    public ExperienciaPuesto crearObjeto(ExperienciaPuesto expPuesto){
        return ExperienciaPuestoRepo.save(expPuesto);
    };
    
    @Override
    public ExperienciaPuesto editarObjeto(ExperienciaPuesto expPuesto){
        return ExperienciaPuestoRepo.save(expPuesto);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        ExperienciaPuestoRepo.deleteById(id);
    };
 
}