/*
 * Una interface es un conjunto de metodos abstractos, en principio.
 * Es decir, no tienen implementación, ni cuerpo. 
 * Relacionados entre ellos.
 * 
 * En Java se permite a una clase implementar una o varias
 * interfaces. Esto complementa que Java no permita la herencia
 * multiple de clases.
 * 
 * Las interfaces son incluso más importantes que las propias clases,
 * pues el Framework de colecciones e interfaces desacoplan el código
 * mediante la inyección de dependencias en Spring a traves de ellas. 
 * */

/*
 * Consideramos una empresa de fabricación de bicicletas.
 * 
 * Existen varios departamentos dedicados a la fabricación.
 * El jefe de producción quiere que al decir frenar, embragar o acelerar
 * el nombre del metodo que realiza la acción sea el mismo y lo único 
 * que cambie sea la implementación del metodo según el tipo de bicicleta.
 * Por ejemplo la bicicleta de carreras cuando acelera tiene que aumentar 
 * más la velocidad que otro tipo de bicicleta, pero el metodo se tiene
 * que llamar acelerar igualmente.
 * 
 * Tecnicamente: una interfaz es un contrato mediante el cual una clase
 * concreta que implementa una interfaz se compromete a implementar todos 
 * los metodos abstractos de la interfaz aunq solamente vaya a utilizar
 * uno de ellos.
 * 
 * IMPORTANTE !! 
 * Cuando se implementa una interfaz, la firma del metodo no se puede
 * violar.
 * 
 * La firma (signature) del metodo comprende el nombre y los parametros
 * que recibe.
 * 
 * Una clase implementa los metodos abstractos >> MountainByke
 * 
 * */

package com.example.bicicletas;

public interface Bici {
	
	
	public abstract void acelerar(double velocidad);
	public abstract void frenar(double velocidad);
	public abstract void engranar(int engrane);
		
	}

