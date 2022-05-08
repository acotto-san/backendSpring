
package com.miportfolio.argProgramaBackend.Repository;

import com.miportfolio.argProgramaBackend.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Long>{
    
}
