/*
 * Herencia => mecanismo reutilización código hace que una clase pueda 
 * heredar todos los elementos públicos o protegidos de otra clase.
 * 
 * Java solo puede heredar de forma simple, de una sola clase.
 * 
 * Todas las clases heredan de la clase Object.
 * 
 * IMPORTANTE !!! Los constructores no se heredan.
 * */

package com.example;

import java.time.LocalDate;



//estos import vienen de la API de java
//biblioteca de clases y metodos


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
	
	public Persona() {
		super(); //metodo que trae al constructor de la clase base object
		// TODO Auto-generated constructor stub
		
	
		
	}

	public Persona(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	
		
}
