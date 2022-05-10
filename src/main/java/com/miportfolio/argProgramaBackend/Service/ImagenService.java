
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Imagen;
import com.miportfolio.argProgramaBackend.Repository.ImagenRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenService implements IService<Imagen>{
    
    @Autowired
    public ImagenRepository imagenRepo;
    
    @Override
    public List<Imagen> buscarObjetos(){
        return imagenRepo.findAll();
    };
    
    @Override
    public Imagen buscarObjetoById(Long id){
        return imagenRepo.findById(id).orElse(null);
    };
    
    @Override
    public Imagen crearObjeto(Imagen img){
        return imagenRepo.save(img);
    };
    
    @Override
    public Imagen editarObjeto(Imagen img){
        return imagenRepo.save(img);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        imagenRepo.deleteById(id);
    };
 
}