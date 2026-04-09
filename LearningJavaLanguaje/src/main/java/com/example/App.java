package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
      Persona persona1 = new Persona();
      persona1.setNombre("Jorge");
      System.out.println(persona1.getNombre());
      
      var persona3 = new Persona("Duglas", "González", "Villamisar");
      
      var persona4 = new Persona("Carolina");
      
      var persona5 = new Persona(3500.50);
      
      //para imprimir persona3: 
      
      System.out.println(persona3.toString());
    }
}
