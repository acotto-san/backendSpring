
package com.miportfolio.argProgramaBackend.Repository;

import com.miportfolio.argProgramaBackend.Modelo.ExperienciaPuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaPuestoRepository extends JpaRepository <ExperienciaPuesto,Long>{
    
}
