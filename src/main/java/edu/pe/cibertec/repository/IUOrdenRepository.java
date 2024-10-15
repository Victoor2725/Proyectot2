package edu.pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.cibertec.model.Ordenes;

@Repository
public interface IUOrdenRepository extends JpaRepository<Ordenes, Integer> {

}
