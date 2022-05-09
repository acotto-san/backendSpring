
package com.miportfolio.argProgramaBackend.Service;

import com.miportfolio.argProgramaBackend.Modelo.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> findAll();
    
    public void save(Persona per);
    
    public void deleteById(Long id);
    
    public Persona findById(Long id);
}