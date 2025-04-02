package com.task4.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.task4.modelo.Dados;

public interface DadoRepository extends JpaRepository<Dados, Long> {

	Page<Dados> findByGenderContainingIgnoreCase(String gender, Pageable paginacao);

}

