package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Producto;
import com.empresa.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repositorio;

	@Override
	public Producto insertaActualizaProducto(Producto obj) {
		// TODO Auto-generated method stub
		return repositorio.save(obj);
	}

	@Override
	public List<Producto> listaProducto() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
	
	
	
}
