package edu.pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.cibertec.model.Libros;

@Repository
public interface IULibrosRepository extends JpaRepository <Libros, Integer> {

}
