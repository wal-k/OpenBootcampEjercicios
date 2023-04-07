package EjerciciosTema7_8_9;

import java.io.InputStream;
import java.io.PrintStream;

public class EjerciciosFunciones {

    public static void main(String[] args) {

        try {
            dividePorCero(1);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }


    }


    public static int dividePorCero(int num) throws ArithmeticException {

        return num / 0;

    }

    public static void copiarFichero(InputStream ficheroOrigen, PrintStream ficheroDestino){



    }

}
