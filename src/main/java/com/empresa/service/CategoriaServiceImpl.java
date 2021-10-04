package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Categoria;
import com.empresa.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repositorio;

	@Override
	public List<Categoria> listaCategoria() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
	
}
