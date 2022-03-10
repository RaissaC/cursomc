package com.raissac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raissac.cursomc.domain.Categoria;
import com.raissac.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Optional<Categoria> buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		
		return obj;
	}
}
