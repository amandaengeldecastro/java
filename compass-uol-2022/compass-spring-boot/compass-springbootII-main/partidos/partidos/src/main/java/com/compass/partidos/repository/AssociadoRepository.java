package com.compass.partidos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.partidos.modelo.Associado;

public interface AssociadoRepository extends JpaRepository<Associado,Long>{

	List<Associado> findByCargoPolitico(String cargoPolitico);

	Optional<Associado> findById(Long id);


}
