package com.example;

public class Persona {
	
	/*
	 * A continuación las variables miembros de la clase: propiedades, campos
	 * y atributos.
	 * */
	
	/*Modificadores de acceso:
	 * 
	 * 1- private del package > es el valor por defecto.
	 * 2- public > es accesible en todos los paquetes.
	 * 3- private > solo accesible por los elementos de la misma clase, dentro de
	 * la misma clase.
	 * 4- protected > herencia
	 * 
	 * Importante una clase bien diseñada tiene todos sus propiedades o campos, 
	 * privados y solamente se relaciona con el mundo exterior a traves de 
	 * metodos públicos que acceden a dichas variables privadas.
	 * */
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	
	/*
	 * Metodos Getter and Setter > metodos publicos a traves de los cuales se 
	 * pueden modificar las variables privadas de la clase.
	 * */
	
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
	
	
	
	

}
