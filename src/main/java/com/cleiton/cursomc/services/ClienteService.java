package com.cleiton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleiton.cursomc.domain.Cliente;
import com.cleiton.cursomc.repositories.ClienteRepository;
import com.cleiton.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> objCliente = repository.findById(id);
		return objCliente.orElseThrow(() -> new ObjectNotFoundException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
