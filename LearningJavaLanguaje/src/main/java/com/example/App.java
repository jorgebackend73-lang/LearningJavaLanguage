package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	public  String texto = "vivo en el plano de las instancias";
	
    public static void main(String[] args) {
        
    /*
     * Creación o instanciación objetos con patron Builder de Lombok
     * Mejorado por Lombok.
     * 
     * Builder es un patron de diseño o Factory =
     * patron de diseño para la creación de objetos.
     * 
     * Nos permite crear objetos sin constructor esplicitamente implementado.
     * También al crear un objeto el orden en que utilicemos
     * las propiedades  o campos de la clase es indiferente.
     * 
     * */	
    	
    Persona p1 = Persona.builder()
    		.salario(3500.25)
    		.nombre("Carolina")
    		.build();
    Persona persona2 = Persona.builder()
    		.nombre("Sebastian")
    		.primerApellido("Sanjuanelo")
    		.segundoApellido("Arrieta")
    		.genero(Genero.HOMBRE)
    		.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 20))
    		.salario(2456.67)
    		.build();
    
    System.out.println(persona2);
    
    System.out.println("El pais de las personas es: " + Persona.PAIS); 
    
    //mostrar el valor de la variable texto
    
    //App app = new App(); no hace falta crear una variable en este caso
    System.out.println(new App().texto);
    //creamos un objeto de la clase App que es donde esta nuestra variable texto
    
    	
      }
}
