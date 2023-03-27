
/* 
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
 sea inferior a 3, el bloque de código que tendrá el bucle deberá:

	Incrementar el valor de la variable en uno cada vez que se ejecute.

	Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo 
se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición 
será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez 
que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las 
cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un 
mensaje por consola informando de la estación en la que está. También habrá que poner un default 
para cuando el valor de la variable no sea una estación.
*/


public class EjerciciosTema4 {

 
    public static void main(String[] args) {
    	
    	
    	// Ejercicio IF
    	
    	System.out.println("Ejercicio IF...");
    	int numeroIf = 0;
    
    
    	if (numeroIf > 0) { 
    		System.out.println("El numero es positivo");
    	} else if (numeroIf < 0 ) { 
    		System.out.println("El numero es negativo");
    	} else { 
    		System.out.println("El numero es cero");
    	} 

    	// Ejercicio WHILE
    	
    	System.out.println("Ejercicio WHILE...");
    	int numeroWhile = 0;
    	
    	while (numeroWhile < 3) { 
    		System.out.println(numeroWhile);
    		numeroWhile += 1;
    	}
    	
    	// Ejercicio DOWHILE
    	
    	System.out.println("Ejercicio DOWHILE...");
    	int numeroDoWhile = 3;
    	
    	do {
    		System.out.println(numeroDoWhile);
    		numeroDoWhile += 1;
    	} while (numeroDoWhile < 3);
    		
    	// Ejercicio FOR
    	
    	System.out.println("Ejercicio FOR...");
    	
    	
    	for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
    		System.out.println(numeroFor);		
		}
    	
    	// Ejercicio SWITCH
    	
    	System.out.println("Ejercicio SWITCH...");
    	
    	String estacion = "invierno";
    	
    	switch (estacion) {
    	
    		case "primeavera":
    			System.out.println("Estamos en primavera.");
    			break;
    		
    		case "verano":
    			System.out.println("Estamos en verano.");
    			break;
    			
    		case "otoño":
    			System.out.println("Estamos en otoño.");
    			break;
    			
    		case "invierno":
    			System.out.println("Estamos en invierno.");
    			break;
    		
    		default: 
    			System.out.println("No es una estacion.");
    			break;
    	}
    	
    }

}


