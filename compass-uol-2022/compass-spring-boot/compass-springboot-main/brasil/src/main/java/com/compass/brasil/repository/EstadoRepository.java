package com.compass.brasil.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.brasil.modelo.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
		List<Estado> findByRegiao(String regiao);

	
	
}

