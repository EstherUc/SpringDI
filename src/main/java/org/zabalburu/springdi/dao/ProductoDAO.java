package org.zabalburu.springdi.dao;

import java.util.List;

import org.zabalburu.springdi.modelo.Categoria;
import org.zabalburu.springdi.modelo.Producto;

public interface ProductoDAO {
	List<Producto> getProductos();
	Producto nuevoProducto(Producto p);
	Producto getProducto(Integer id);
	void eliminarProducto(Integer id);
	List<Categoria> getCategorias();
	Categoria getCategoria(Integer id);
}
