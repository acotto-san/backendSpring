
package com.miportfolio.argProgramaBackend.Repository;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaEducativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaEducativaRepository extends JpaRepository <ExperienciaEducativa,Long>{
    
}
