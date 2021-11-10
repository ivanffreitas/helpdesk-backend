package com.ivanilson.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanilson.helpdesk.domain.Chamado;
import com.ivanilson.helpdesk.domain.Cliente;
import com.ivanilson.helpdesk.domain.Tecnico;
import com.ivanilson.helpdesk.domain.enums.Perfil;
import com.ivanilson.helpdesk.domain.enums.Prioridade;
import com.ivanilson.helpdesk.domain.enums.Status;
import com.ivanilson.helpdesk.repositories.ChamadoRepository;
import com.ivanilson.helpdesk.repositories.ClienteRepository;
import com.ivanilson.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Ivanilson", "504.121.590-15", "ivan@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Igor", "102.804.840-89", "igor@gmail.com", "000");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
