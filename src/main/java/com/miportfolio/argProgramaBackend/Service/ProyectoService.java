
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Proyecto;
import com.miportfolio.argProgramaBackend.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IService<Proyecto>{
    
    @Autowired
    public ProyectoRepository proyectoRepo;
    
    @Override
    public List<Proyecto> buscarObjetos(){
        return proyectoRepo.findAll();
    };
    
    @Override
    public Proyecto buscarObjetoById(Long id){
        return proyectoRepo.findById(id).orElse(null);
    };
    
    @Override
    public Proyecto crearObjeto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    };
    
    @Override
    public Proyecto editarObjeto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        proyectoRepo.deleteById(id);
    };
 
}