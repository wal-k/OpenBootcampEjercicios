package EjerciciosTema7_8_9;

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;


public class EjerciciosArrays {

    public static void main(String[] args) {


        // CONSIGNA 1 .....................................................................
        String[] arrayUnidimensional = new String[]{"UNO","DOS","TRES","CUATRO","CINCO"};

        System.out.println("Matriz unidimensional:");
        printArray(arrayUnidimensional);
        System.out.println(" ");


        // CONSIGNA 2 .....................................................................

        int[][] arrayBidimensional = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

                };


        System.out.println("Matriz bidimensional:");
        printArray(arrayBidimensional);
        System.out.println(" ");

        // CONSIGNA 3 .....................................................................

        Vector<String> vector = new Vector<String>();

        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        vector.remove(1);
        vector.remove(2);

        System.out.println("Vector 5 elementos:");
        System.out.println(vector.toString());
        System.out.println(" ");

        /** CONSIGNA 4 .....................................................................

         El problema de agregar 1000 elementos a un vector con capacidad por defecto, es la ineficiencia de
         incrementar el tamaño sucesivas veces, que se duplica por defecto.
         ( 10 -> 20 -> 40 -> 80 -> 160 -> 320 -> 640 -> 1280 = 7 veces)
         Cada vez que se incrementa la capacidad se copia enteramente el contenido del vector original,
         el cómputo esta operación es costoso. Esto se evita declarando la capacidad inicial, y configurando
         un incremento adecuado al dominio del problema.

        **/

        // CONSIGNA 5 .....................................................................

        ArrayList<String> arrayListStr = new ArrayList<String>();
        LinkedList<String> linkedListStr = new LinkedList<String>();

        arrayListStr.add("Elemento 1");
        arrayListStr.add("Elemento 2");
        arrayListStr.add("Elemento 3");
        arrayListStr.add("Elemento 4");

        for ( String e : arrayListStr
             ) {
            linkedListStr.add(e);
        }

        System.out.println("Copia de ArrayList a LinkedList");

        System.out.println("Mostrando contenido del ArrayList:");
        for ( String e : arrayListStr
        ) {
            System.out.println(e);
        }

        System.out.println("Mostrando contenido de la LinkedList (copiado del ArrayList):");
        for ( String e : linkedListStr
        ) {
            System.out.println(e);
        }

        System.out.println(" ");

        // CONSIGNA 6 .....................................................................

        ArrayList<Integer> arrayListImpares = new ArrayList<>();

        for (int i = 1; i <= 10  ; i++) {

            if (i % 2 != 0) {
                arrayListImpares.add(i);
            }

        }

        System.out.println("Relleno de ArrayList con enteros impares.");

        System.out.println("Mostrando contenido del ArrayList:");
        for ( int e : arrayListImpares
        ) {
            System.out.println(e);
        }



    }

    public static void printArray(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print( "(" + String.valueOf(i) + "," + String.valueOf(j) + ") ");
                System.out.print( array[i][j] + " ");

            }

            System.out.println(" ");

        }

    }

    public static void printArray(String[]array){

        for (int i = 0; i < array.length -1; i++) {

           System.out.print( "(" + String.valueOf(i) + ")" );
           System.out.print( array[i] + " ");

            }

            System.out.println(" ");

        }

    }






