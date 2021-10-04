package com.empresa.service;

import java.util.List;

import com.empresa.entity.Producto;

public interface ProductoService {

	public Producto insertaActualizaProducto(Producto obj);
	public List<Producto> listaProducto();
}
