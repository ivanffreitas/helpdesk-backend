package com.ivanilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanilson.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
