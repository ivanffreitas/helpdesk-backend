package com.ivanilson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanilson.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
