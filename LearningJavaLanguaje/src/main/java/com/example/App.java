package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	// como lo de abajo es estatic puede vivir en esta zona de la clase.
	// cambiamos void por String y nos sobran los println: tenemos que
	// sustituirlos por return.
	/*
	 * Así nos devuelve directamente el metodo, pero además del los return
	 * necesitamos printlns para imprimir los returns. Además tenemos que
	 * declarar la variable resultado que es la que imprimimos 
	 * */
	
	static String printObject(Object object) {
		
		/*
		 * Rcibe como parametro un object y en dependencia del tipo de
		 * dato imprimira el salario si se trata de un empleado o el 
		 * total de asignaturas si se trata de un estudiante.
		 * 
		 * Con instanceof sabemos si el objeto es instancia de Empleado
		 * y entoces lo asignamos a una variable empleado a la que asignamos
		 * el objeto recibido y además lo casteamos a tipo Empleado. 
		 * 
		 * Con else if hacemos parecido y casteamos a tipo Estudiante.
		 * 
		 * Else cuando no es ni una cosa ni otra.		
		 * 
		 * */
		
		/*
		 * Utilizando los beneficios de Pattern Matching
		 * */
		
		if (obj instanceof Empleado empleado) {
			
			// Empleado empleado = (Empleado) object; Nos sobra por la declaración de la línea anterior.
			// Con lo de arriba podemos usar empleado directamente, sin tener que castear y
			// creando la variable directamente.
			
			return "Salario del empleado " + empleado.getSalario();
			
		} else if (obj instanceof Estudiante estudiante) {
			
			// Estudiante estudiante = (Estudiante) object; <= esto que declara y castea sobra.
			
			return "Total de asignaturas del estudiante " + estudiante.getTotalAsignaturas() + ".";
			
		} else {
			
			return "no es, ni estudiante, ni empleado.";
			
		}
		
	}

	public static void main(String[] args) {
		
	
	
		Persona[] personas = {

				Persona.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).build(),

				Persona.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).build(),

				Persona.builder().nombre("Alex Eduardo").primerApellido("Pilicita").segundoApellido("Changoluisa")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).build(),

				Persona.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25)).build(),

				Persona.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4)).build()

		};

		/*
		 * Operador instanceof se utiliza para saber si variable de referencia 
		 * u objeto es una instancia de un tipo, es decir de una clase
		 * concreta.
		 * */
		
		Persona p1 = new Persona();
		
		Estudiante e1 = new Estudiante();
		e1.setTotalAsignaturas(10);
		
		Empleado emp1 = new Empleado();
		emp1.setSalario(3450.25);
		
		// hemos creado tres instancias q contienen los respectivos objetos.
		
		/*
		 * Invocar metodo printObject:
		 * 
		 * Lo hacemos así pq lo que devuelve el metodo String lo podemos
		 * concatenar con el resultado.
		 * 
		 * */
		
		
		
		System.out.println("El resultado " + printObject(p1));
		
		System.out.println(printObject(e1));
		
		System.out.println(printObject(emp1));
		
		}
	
}


