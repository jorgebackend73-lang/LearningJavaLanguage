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
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
}
