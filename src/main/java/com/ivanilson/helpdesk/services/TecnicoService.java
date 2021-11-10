package com.ivanilson.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanilson.helpdesk.domain.Tecnico;
import com.ivanilson.helpdesk.repositories.TecnicoRepository;
import com.ivanilson.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! id:" + id));
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}

}
