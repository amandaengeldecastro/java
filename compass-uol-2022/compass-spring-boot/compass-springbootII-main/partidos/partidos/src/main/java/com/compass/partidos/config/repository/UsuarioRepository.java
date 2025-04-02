package com.compass.partidos.config.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.partidos.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByEmail(String email);
}
