package com.cleiton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleiton.cursomc.domain.Categoria;
import com.cleiton.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> objCategoria = repository.findById(id);
		return objCategoria.orElse(null);
	}
	
}
