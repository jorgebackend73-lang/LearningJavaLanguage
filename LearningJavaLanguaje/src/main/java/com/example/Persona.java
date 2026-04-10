/*
 * Herencia => mecanismo reutilización código hace que una clase pueda 
 * heredar todos los elementos públicos o protegidos de otra clase.
 * 
 * Java solo puede heredar de forma simple, de una sola clase.
 * 
 * Todas las clases heredan de la clase Object.
 * 
 * IMP
 * */

package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



//estos import vienen de la API de java
//biblioteca de clases y metodos

@NoArgsConstructor
@AllArgsConstructor
@Data
//SuperBuilder por traer herencias
@SuperBuilder
public class Persona {
	
	/*
	 * Los elementos miembros de una clase (propiedades, metodos, los constructores)
	 * Solamente pueden existir en el plano de las clases o en el plano
	 * de las instancias.
	 * 
	 * El elemento que vive en el plano de las clases, tiene que tener el 
	 * modificador static y no necesita de una instancia para poder existir.
	 * Además se accede al mismo, prefijandolo por el nombre de la clase. 
	 * */
	
	// Crear una constante: publica, estatic (vive en el plano de las clases) y final (es constante)
	public static final String PAIS = "España";
		
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	
}
