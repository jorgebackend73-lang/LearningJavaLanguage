package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//estos import vienen de la API de java
//biblioteca de clases y metodos

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona {
		
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Double salario;
	private Genero genero;
	private LocalDate fechaNacimiento;
		
}
