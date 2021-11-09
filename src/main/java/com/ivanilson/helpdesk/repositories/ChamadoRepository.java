package com.ivanilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanilson.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
