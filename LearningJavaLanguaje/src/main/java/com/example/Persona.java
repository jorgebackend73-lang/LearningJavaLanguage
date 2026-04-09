package com.example;

public class Persona extends Object {
	
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
	private Double salario;
	
	
	

	/*
	Constructores

	Una buena clase es aquella que tiene un modificador de acceso private
	y constructores para dar acceso público.
	Normalmente primero atributos y modificadores, después 
	constructores (getter and setter de momento).
	Constructor: método (función declarada dentro de la clase).
	Tiene el mismo nombre de la clase y se utiliza conjuntamente 
	con el operador new para construir e instanciar objetos.
	Por defecto una clase tiene disponible un constructor sin parámetros.
	Este constructor es capaz de construir un objeto a pesar de no tener
	código pues todas las clases heredan el código necesario de 
	la clase object (madre de todas las clases). 
	Por tanto invoca a la clase object para construir el objeto que 
	la clase no sabe como hacer.
	*/
	
	/*
	 * Constructor solo se usa una vez al crear instanciar el objeto.
	 * No puede haber dos constructores que reciban la misma cantidad de 
	 * parametros.
	 * */
	
public Persona(String nombre, String primerApellido, String segundoApellido) {
	super(); //invoca al constructor
	this.nombre = nombre;
	this.primerApellido = primerApellido;
	this.segundoApellido = segundoApellido;
	
}

public Persona(String nombre) {
	super();
	this.nombre = nombre;
}

/*
 * Invocamos de nuevo al constructor sin parametros pq al poner constructores
 * para o
 
 */
public Persona() {
	super();
	// TODO Auto-generated constructor stub
}
	
	/*
	 * Metodos Getter and Setter > metodos publicos a traves de los cuales se 
	 * pueden modificar las variables privadas de la clase.
	 * */
	
	


	public String getNombre() {
		return nombre;
	}

	public Persona(Double salario) {
		super();
		this.salario = salario;
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

	//para indicar que no queremos que imprima como clase padre Object
	//y nos imprima los parametros que tiene nuestro objeto.
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + "]";
	}
	
	
	
	

}
