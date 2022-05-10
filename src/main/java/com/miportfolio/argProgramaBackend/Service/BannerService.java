
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Banner;
import com.miportfolio.argProgramaBackend.Repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IService<Banner>{
    
    @Autowired
    public BannerRepository proyectoRepo;
    
    @Override
    public List<Banner> buscarObjetos(){
        return proyectoRepo.findAll();
    };
    
    @Override
    public Banner buscarObjetoById(Long id){
        return proyectoRepo.findById(id).orElse(null);
    };
    
    @Override
    public Banner crearObjeto(Banner cv){
        return proyectoRepo.save(cv);
    };
    
    @Override
    public Banner editarObjeto(Banner cv){
        return proyectoRepo.save(cv);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        proyectoRepo.deleteById(id);
    };
 
}