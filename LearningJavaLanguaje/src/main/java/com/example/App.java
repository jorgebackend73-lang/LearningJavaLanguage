package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	public static void main(String[] args) {
        
    //Solo hemos extendido Empleado a Persona y ya podemos crear instancias
	Empleado empleado1 = new Empleado();
	
	Empleado empleado2 = new Empleado(3500.45, Departamento.RRHH, 
			LocalDate.of(2000, Month.SEPTEMBER, 1));
	
	System.out.println(empleado2.toString());
	
	
	/*
	 * Creamos un empleado que tenga todo lo de Persona y lo de Empleado.
	 * Tener en cuenta que los constructorres no se heredan.
	 * */
    	
	Empleado empleado3 = new Empleado("Juan", "Martinez", "Lopez", Genero.HOMBRE,
			LocalDate.of(1980, Month.JANUARY, 20), 5000.65, Departamento.FINANZAS,
			LocalDate.of(2000, Month.SEPTEMBER, 1));
	
	System.out.println(empleado3);
	
	
	
      }
}
