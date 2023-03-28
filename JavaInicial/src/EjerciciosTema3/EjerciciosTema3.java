package EjerciciosTema3;

//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
//Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
//String[] nombres = {"", "", "", ""}

public class EjerciciosTema3 {

    static String[] cadenas = {"Texto 1","Texto 2","Texto 3","Texto 4"};

    public static void main(String[] args) {

        String output = "";

        for (  String cadena: cadenas
             ) {

            output += " ";
            output += cadena;

        }

        System.out.println(output);

    }

}
