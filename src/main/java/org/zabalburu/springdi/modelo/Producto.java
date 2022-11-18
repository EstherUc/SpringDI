package org.zabalburu.springdi.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Producto {
	@EqualsAndHashCode.Include
	private Integer id;
	private String nombre;
	private Double precio;
	private Categoria categoria;
	
	public Producto() {
		System.out.println("En el constructor de Producto");
	}

	public Producto(Integer id, String nombre, Double precio, Categoria categoria) {
		super();
		
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		System.out.println("En el constructor de Producto");
	}
	
}
