
package com.miportfolio.argProgramaBackend.Repository;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral,Long>{
    
}
