package com.compass.partidos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.partidos.modelo.Partido;

public interface PartidoRepository  extends JpaRepository<Partido, Long>{

	List<Partido> findByIdeologia(String ideologia);

	Optional<Partido> findById(Long id);


}
