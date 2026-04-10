package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	public static void main(String[] args) {
        
    // Solo hemos extendido Empleado a Persona y ya podemos crear instancias
	// Empleado empleado1 = new Empleado();
	
	Empleado empleado1 = Empleado.builder()
			.build();
	
//	Empleado empleado2 = new Empleado(3500.45, Departamento.RRHH, 
//			LocalDate.of(2000, Month.SEPTEMBER, 1));
	
	Empleado empleado2 = Empleado.builder()
			.salario(3500.45)
			.departamento(Departamento.RRHH)
			.fechaAlta(LocalDate.of(2000, Month.SEPTEMBER, 1))
			.build();
	
	System.out.println(empleado2.toString());
	
	
	/*
	 * Creamos un empleado que tenga todo lo de Persona y lo de Empleado.
	 * Tener en cuenta que los constructorres no se heredan.
	 * */
    	
	/* Empleado empleado3 = new Empleado("Juan", "Martinez", "Lopez", Genero.HOMBRE,
			LocalDate.of(1980, Month.JANUARY, 20), 5000.65, Departamento.FINANZAS,
			LocalDate.of(2000, Month.SEPTEMBER, 1)); */
	
	Empleado empleado3 = Empleado.builder()
	        
			// Metodos clase Persona
			.nombre("Juan")
	        .primerApellido("Martinez")
	        .segundoApellido("Lopez")
	        .genero(Genero.HOMBRE)
	        .fechaNacimiento(LocalDate.of(1980, Month.JANUARY, 20))
	        
	        // Metodos clase Empleado
	        .salario(5000.65)
	        .departamento(Departamento.FINANZAS)
	        .fechaAlta(LocalDate.of(2000, Month.SEPTEMBER, 1))
	        .ssn("289867544")
	        .build();
	
	System.out.println(empleado3);
	
	
	
      }
}
