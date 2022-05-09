
package com.miportfolio.argProgramaBackend.Service;


import com.miportfolio.argProgramaBackend.Modelo.Curriculum;
import java.util.List;

public interface ICurriculumService {
    public List<Curriculum> findAll();
    
    public void save(Curriculum cv);
    
    public void deleteById(Long id);
    
    public Curriculum findById(Long id);
    
}
