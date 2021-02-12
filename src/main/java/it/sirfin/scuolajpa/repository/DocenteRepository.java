package it.sirfin.scuolajpa.repository;

import it.sirfin.scuolajpa.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long>{
}
