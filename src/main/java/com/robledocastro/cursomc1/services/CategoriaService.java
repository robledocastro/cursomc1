package com.robledocastro.cursomc1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robledocastro.cursomc1.domain.Categoria;
import com.robledocastro.cursomc1.repositories.CategoriaRepository;
import com.robledocastro.cursomc1.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}
