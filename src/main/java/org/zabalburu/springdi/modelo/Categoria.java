package org.zabalburu.springdi.modelo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Categoria {
	@EqualsAndHashCode.Include
	private Integer id;
	private String nombre;
	
	public Categoria() {
		System.out.println("En el constructor de Categoría");
	}
	
	public Categoria(Integer id, String nombre) {
		this();
		this.id = id;
		this.nombre = nombre;
	}
}
