package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {

	// Declaración variables instancia:
	private String nombre; // valor por defecto null.
	private int total; // valor por defecto 0.

	// Constante (final) para nuestro array de 100 elementos, static para poder
	// usarla en main
	static final int TOTAL_ELEMENTOS = 100;

	public static void main(String[] args) {

		/*
		 * Variables:
		 * 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
		 * 
		 * Nombrar variable: primer caracter no pude ser un número. $ y _ se permiten
		 * pero tampoco deben usarse como primer caracter de un identificador o nombre
		 * de una variable.
		 * 
		 * Variables declaradas a nivel de la clase no necesitan tener asignado valor,
		 * tienen uno asignado por defecto. Variables a nivel local (declaradas dentro
		 * de un bloque delimitado por llaves de apertura y cierre {}) normalmete son
		 * declaradas dentro de un metodo.
		 * 
		 */

		int total2 = 0;

		/*
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * 
		 * Tipos de Datos: En Java a la izquierda del nombre de la variable simpre hay
		 * que especificar el tipo de dato:
		 * 
		 * string, int, double, float.
		 * 
		 * Primitivos integrados en el propio lenguaje, los que deberíamos usar de forma
		 * normal. Identificador todo en minusculas. No tienen propiedades ni metodos.
		 * Si agregamos el operador . no se va a desplegar ningún menú contextual en
		 * Eclipse.
		 * 
		 * Objetos o Referencias, envoltorio de un tipo de dato primitivo. Primera letra
		 * del identificador en mayuscula. Pj. Integer envoltorio con metodos y
		 * propiedes para mejorar el tipo de dato primitivo. Si usamos operador . nos
		 * mostrará menú contextual con esas propiedades y metodos agregados al tipo de
		 * dato primitivo.
		 *
		 */

		Integer total3 = 0;

		/*
		 * Podemos hacer commit y no generar nuevas ramas y con BDR en nobre del
		 * proyecto => teams => show in history y podemos ver todos los commits. Podemos
		 * acceder a ellos. Pero para modificarlos hay que crear una nueva rama temporal
		 * y esta una vez hechos los cambios ya se puede volver a hacer commit.
		 * 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html Array:
		 * es un identificador que hace referencia a zonas de la memoria consecutivas
		 * donde se almacenan elementos del mismo tipo.
		 *
		 * Necesita de un indice númerico que empieza en 0.
		 *
		 * Es un objeto que contiene un número fijado de valores de un mismo tipo. No se
		 * le pueden agregar más elementos una vez creado. Por tanto es de tamaño fijo.
		 * Se pueden modificar sus elementos, pero no se puede aumentar, ni disminuir la
		 * cantidad de ellos.
		 *
		 * Para acceder a los elementos de un Array se utiliza un indice, entre
		 * corchetes, que se inicia en el valor cero.
		 *
		 * Supongamos una aplicación que maneja nombres. Cada nombre una variable sería
		 * engorroso recorrerlos y darle mantenimiento.
		 * 
		 */

		// Sucesión de variables:
		String nombre1 = "Carolina";
		String nombre2 = "Jorge";
		String nombre3 = "Dani";

		// Array con lo mismo:
		String[] nombres = { "Carolina", "Jorge", "Dani" };

		// Array numeros enteros primitivo:
		int[] numeros = { 1, 2, 3, 4, 5 };

		// Mostrar por consolaa la cantidad de elementos del array numeros
		// length es propiedad, cuando Eclispse nos lo sugiere no lleva parentesis a
		// continuación.
		System.out.println("El array nmeros tiene: " + numeros.length + " elementos.");

		// Mostrar el primer elemento del array numeros:
		System.out.println("El primer elemto del array sería: " + numeros[0]);

		// Numeros y cualquier Array en Java es de tamaño fijo:

		// Modificar el primer elemento del array:
		numeros[0] = 100;

		System.out.println(numeros[0]);

		// Array reservando en memoria espacio suficiente para todos sus futuros
		// elementos.
		// En el siguiente caso reservamos espacio para 10 elementos de tipo integer:
		int[] numeros2 = new int[10];

		System.out.println("El array numeros2 tiene: " + numeros2.length + " elementos.");
		System.out.println("El primer elemento del array numeros2 es: " + numeros2[0]);

		/*
		 * Creando array de Persona, es decir un array donde cada elemento del array es
		 * de un tipo Persona
		 * 
		 */

		Persona[] personas = {

				Persona.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).salario(3500.50)
						.build(),

				Persona.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).salario(2450.70)
						.build(),

				Persona.builder().nombre("Alex Eduardo").primerApellido("Pilicita").segundoApellido("Changoluisa")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).salario(4800.46)
						.build(),

				Persona.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25)).salario(4500.50)
						.build(),

				Persona.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4)).salario(3746.40)
						.build()

		};

		/*
		 * Operadores:
		 * 
		 * Aritmeticos: +, -, *, /, %.
		 * 
		 * % util para saber si un número es par o no.
		 * 
		 * Vamos a implementar una sentencia de control de flujo, que no existe en SQL
		 * for se utiliza para recorrer los elementos de un array, donde se conoce la
		 * cantidad de elementos que componen ese array.
		 * 
		 * Primero for y luego for mejorado (mal llamado for each).
		 * 
		 * Ejemplo:
		 * 
		 * 1. Declarar Array de 100 elementos. 2. Agrgar valores al array. 3. Recorrer
		 * array y mostrar solo los valores pares.
		 * 
		 */

		int[] numerosEnteros = new int[TOTAL_ELEMENTOS];

		// Recorrer el array numerosEnteros y asinar a cada elemento un valor entre 1 y
		// 100

		// i nuestra variable de control que ponemos a 0
		// despues de ; la condición mientras i sea menor o igual a 100 (0 a 99)
		// La expresión i + 1 simpre la vamos a ver como i++ autoincremento en uno.
		/*
		 * for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i = i + 1) {
		 * 
		 * numerosEnteros[i] = i + 1;
		 * 
		 * Cuando el operador esta solo en una sentencia da igual i++ que ++i. En ambos
		 * casos el valor de i se incrementa en 1. Pero en int resultado = i++ * 5; sera
		 * 5 y en int resultado2 = ++i * 5; sera 15. En ++i primero incrementa el valor
		 * de i y luego multiplica por 5. En i++ primero multiplica el valor por 5 y
		 * luego incrementa.
		 */

		/*
		 * La clausula siguiente se usa cuando queremos o necesitamos interactuar con
		 * los indices y ver que valor corresponde a cada indice.
		 * 
		 * El for a continuación llenará el array numerosEnteros con números del 1 al
		 * 100.
		 */
		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {

			numerosEnteros[i] = i + 1;

		}

		// Mostrar los elementos del array original. Usamos sentencia for mejorada:
		// Array del que tomamos los elementos se coloca a la derecha de los dos puntos
		// a la izquierda de los dos puntos va el tipo de elemento que vamos a obtener
		// y el nombre de una variable que inventamos sobre la marcha pero que
		// es bien llamar como el array pero en singular.

		System.out.println("- - - - - - - Array Original  - - - - - - -");

		for (int numeroEntero : numerosEnteros)

			System.out.println(numeroEntero);

		System.out.println("- - - - - - - Elementos que son par del Array Original - - - - - - -");

		/*
		 * Ahora utilizando una sentencia for clasica recorrer el array numerosEnteros y
		 * mostrar solamente los pares.
		 * 
		 * Podemos seguir usando la variable i por ser local a cada for. Se pueden
		 * inicializar más de una variable separandolas con comas.
		 */
		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {
			if (numerosEnteros[i] % 2 == 0) {
				// si entramos en este bloque (en Java limitado por {})
				// quiere decir que el elemento del array numerosEnteros es par
				// y entonces lo imprimimos:
				System.out.println("El número " + numerosEnteros[i] + " es par.");
			}
			
		}
		
		/*
		 * Ejercicio # 3.

		Comitear cambios actuales del proyecto LearningJavaLanguage. Comentario “antes realizar el ejercicio # 3”.
		Utilizar bucle for mejorado para mostrar los elementos que son impares del array numerosEnteros y contar la cantidad de números impares encontrados. 

		 * */

		System.out.println("- - - - - - - Elementos que son impar del Array Original - - - - - - -");
				
				int contador = 0;
				for (int numeroEntero : numerosEnteros) {
					if (numeroEntero % 2 != 0) {
						// Esta vez hemos usado un for mejorado.
						// si entramos en este bloque (en Java limitado por {})
						// quiere decir que el elemento del array numerosEnteros es impar
						// y entonces lo imprimimos:
						contador++;
						// Usamos un contador. No hay que olvidar declararlo antes del bucle for^^.
						System.out.println("El número " + numeroEntero + " es impar.");
					
						
					}
				}
				// Imprimimos la cantidad guardada en contador:
				System.out.println("El número de impares encontrados es: " + contador);
		}
		

	}

