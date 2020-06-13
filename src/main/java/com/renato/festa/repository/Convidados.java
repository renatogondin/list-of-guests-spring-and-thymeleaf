package com.renato.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{
		
}
