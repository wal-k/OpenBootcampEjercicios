package EjerciciosTema7_8_9;

import java.io.*;
import java.util.*;


public class Quiz {

    public static void main(String[] args) {

        String pathQuizDefiniciones
                = System.getProperty("user.dir")
                + File.separator
                + "src"
                + File.separator
                + "EjerciciosTema7_8_9"
                + File.separator
                + "quizPreguntasRespuestas.txt";

        HashMap<String,Vector<String>> preguntasRespuestas =
                cargarPreguntasRespuestas(pathQuizDefiniciones);

        HashMap<String,String> preguntasRespuestasCorrectas =
                cargarPreguntasRespuestasCorrectas(pathQuizDefiniciones);

        Iterator<Map.Entry<String, Vector<String>>> preguntasRespuestasIterator =
                preguntasRespuestas.entrySet().iterator();

        int puntaje = 0;

        while (preguntasRespuestasIterator.hasNext()){

            System.out.print("-------------------------------------------------------------------------\n");

            int opcionSeleccionada ;
            Random rand = new Random();

            HashMap.Entry<String, Vector<String>> definicion = preguntasRespuestasIterator.next();
            String pregunta = definicion.getKey();
            Vector<String> respuestasPosibles = definicion.getValue();
            String[] rPosibles = new String[4];


            System.out.print("Puntaje: ");
            System.out.print(puntaje + "/" + preguntasRespuestas.size() +"\n");
            System.out.println();
            System.out.println(pregunta);


            for (int i = 0; i < 3 ; i++) {

                int rand1d4 = Math.abs( rand.nextInt() % respuestasPosibles.size());
                System.out.println( (i+1)+". "+respuestasPosibles.get(rand1d4));
                rPosibles[i] = respuestasPosibles.get(rand1d4);
                respuestasPosibles.remove(rand1d4);

            }

            System.out.println(4+". "+respuestasPosibles.get(0) + "\n");
            rPosibles[3] = respuestasPosibles.get(0);
            opcionSeleccionada = entradaValidada1a4();

            if (preguntasRespuestasCorrectas.get(pregunta).equals(rPosibles[opcionSeleccionada])) {

                puntaje += 1;
                System.out.println(rPosibles[opcionSeleccionada]);
                System.out.println("Correcto!");

            } else {

                System.out.println("Incorrecto :( ");

            }



        }
        System.out.print("\n-------------------------------------------------------------------------\n");
        System.out.print("Puntaje Final: ");
        System.out.print(puntaje + "/" + preguntasRespuestas.size());
        System.out.print("\n-------------------------------------------------------------------------\n");
    }

    public static HashMap<String, String> cargarPreguntasRespuestasCorrectas(String pathArchivoDefiniciones) {

        InputStream definiciones;

        try {
            definiciones = new FileInputStream(pathArchivoDefiniciones);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HashMap<String,String> mapaPregunta_RespuestaCorrecta = new HashMap<>();
        Scanner scanner = new Scanner(definiciones).useDelimiter("[=;\n]");


        while (scanner.hasNext()) {
            mapaPregunta_RespuestaCorrecta.put(scanner.next(),scanner.next());
            scanner.skip("[^¿].*[^?]");

        }

        scanner.close();

        return mapaPregunta_RespuestaCorrecta;


    }
    public static HashMap<String, Vector<String>> cargarPreguntasRespuestas(String pathArchivoDefiniciones) {

        InputStream definiciones;

        try {
            definiciones = new FileInputStream(pathArchivoDefiniciones);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HashMap<String,Vector<String>> mapaPregunta_Respuestas = new HashMap<>();
        Scanner scanner = new Scanner(definiciones).useDelimiter("[=;\n]");


        while (scanner.hasNext()) {

            String pregunta = scanner.next();
            Vector<String> vectorRespuestas =  new Vector<>(4);
            vectorRespuestas.add(scanner.next());
            vectorRespuestas.add(scanner.next());
            vectorRespuestas.add(scanner.next());
            vectorRespuestas.add(scanner.next());

            mapaPregunta_Respuestas.put(
                    pregunta,
                    vectorRespuestas);

        }

        scanner.close();
        return mapaPregunta_Respuestas;


    }

    public static int entradaValidada1a4(){

        System.out.print("Ingrese opcion 1-4 ");
        Scanner selectorOpcion = new Scanner(System.in);

        int salidaValidada;
        try {
            salidaValidada = Integer.parseInt(selectorOpcion.next()) - 1;
        } catch (NumberFormatException e) {
            salidaValidada = -1;
        }

        return salidaValidada >= 0 && salidaValidada < 4 ? salidaValidada : entradaValidada1a4();

    }
}






