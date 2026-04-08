package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
       // Creación de objetos Persona, a partir de la clase persona.
    	
    	Persona persona1 = new Persona(); // new llama a un constructor que llama a un metodo que existe aunq no lo vea y crea el objeto. 
    	
    	persona1.nombre = "Dani"; // punto . es el metodo que da acceso al parametro nombre de la clase Persona.
    	
    	Persona persona2 = new Persona();
    	
    	persona2.nombre = "Dani";
    	
    	// persona1 y persona2 son iguales?
    	
    	if (persona1 == persona2)
    		System.out.println("persona1 y persona2 apuntan al mismo objeto");
    	else 
			System.out.println("persona1 y persona2 son variables de referencia " + 
    	"que apuntan a diferentes objetos en la memoria RAM");
			
		
    }
}
