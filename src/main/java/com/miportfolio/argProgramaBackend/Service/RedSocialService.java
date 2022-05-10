
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.RedSocial;
import com.miportfolio.argProgramaBackend.Repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IService<RedSocial>{
    
    @Autowired
    public RedSocialRepository redSocialRepo;
    
    @Override
    public List<RedSocial> buscarObjetos(){
        return redSocialRepo.findAll();
    };
    
    @Override
    public RedSocial buscarObjetoById(Long id){
        return redSocialRepo.findById(id).orElse(null);
    };
    
    @Override
    public RedSocial crearObjeto(RedSocial rrss){
        return redSocialRepo.save(rrss);
    };
    
    @Override
    public RedSocial editarObjeto(RedSocial rrss){
        return redSocialRepo.save(rrss);
    };
    
    @Override
    public void borrarObjetoById(Long id){
        redSocialRepo.deleteById(id);
    };
 
}