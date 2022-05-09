
package com.miportfolio.argProgramaBackend.Service;


import com.miportfolio.argProgramaBackend.Modelo.Curriculum;
import java.util.List;

public interface ICurriculumService {
    
    public List<Curriculum> buscarCurriculums();
    
    public Curriculum buscarCurriculumById(Long id);

    public Curriculum crearCurriculum(Curriculum cv);
    
    public Curriculum editarCurriculum(Curriculum cv);
    
    public void borrarCurriculumById(Long id);
    
    
}
