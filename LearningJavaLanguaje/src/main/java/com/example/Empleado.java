package com.example;

import java.time.LocalDate;

/*
 * Empleado hereda de Persona. Es una subclase de Persona. 
 * Persona es la Super Clase de Empleado. 
 * Empleado es tb un Subtipo de Persona.
 * */

public class Empleado extends Persona {

	/*
	 * double en minuscula dato primitivo, con D mayuscula dato objeto, para que
	 * tenga acceso a datos y metodos. Siempre mejor primitivo que objeto.
	 */

	private double salario;
	private Departamento departamento;
	private LocalDate fechaAlta;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Tenemos hasta el constructor por defecto al que ni vemos.
	// Lo mostramos ahí arriba, el super.
	// Con Source => Generate Constructors from Superclass

	public Empleado(Double salario, Departamento departamento, LocalDate fechaAlta) {
		super();
		this.salario = salario;
		this.departamento = departamento;
		this.fechaAlta = fechaAlta;
	}
	// constructor de empleado normal que no hereda los constrcutores de Persona

	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento, Double salario, Departamento departamento, LocalDate fechaAlta) {
		super(nombre, primerApellido, segundoApellido, genero, fechaNacimiento);
		this.salario = salario;
		this.departamento = departamento;
		this.fechaAlta = fechaAlta;
	}
	// constructor de empleado que invoca a los constructores de Persona

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", departamento=" + departamento + ", fechaAlta=" + fechaAlta
				+ ", getNombre()=" + getNombre() + ", getPrimerApellido()=" + getPrimerApellido()
				+ ", getSegundoApellido()=" + getSegundoApellido() + ", getGenero()=" + getGenero()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
