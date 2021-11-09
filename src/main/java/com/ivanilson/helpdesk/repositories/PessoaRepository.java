package com.ivanilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanilson.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
