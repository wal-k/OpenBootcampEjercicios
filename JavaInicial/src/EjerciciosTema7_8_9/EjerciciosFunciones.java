package EjerciciosTema7_8_9;

import java.io.*;

@SuppressWarnings("all")
public class EjerciciosFunciones {

    public static void main(String[] args) {

        // Consigna 7

        try {
            dividePorCero(1);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

        // Consigna 8

        String testFileInPath
                = System.getProperty("user.dir")
                + File.separator
                + "src"
                + File.separator
                + "EjerciciosTema7_8_9"
                + File.separator
                + "TestFileIn.txt";

        String testFileOutPath
                = System.getProperty("user.dir")
                + File.separator
                + "src"
                + File.separator
                + "EjerciciosTema7_8_9"
                + File.separator
                + "TestFileOut.txt";

        copiarFichero(testFileInPath,testFileOutPath);

    }


    public static int dividePorCero(int num) throws ArithmeticException {

        return num / 0;

    }

    public static void copiarFichero(String fileInPath, String fileOutPath) {

        InputStream ficheroEntrada;
        OutputStream ficheroSalida;

        try {

            ficheroEntrada = new FileInputStream(fileInPath);
            ficheroSalida = new FileOutputStream(fileOutPath);

            System.out.println("Copiando fichero origen: " + fileInPath);
            System.out.println("A fichero destino: " + fileOutPath);

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
            throw new RuntimeException(e);

        }

        try {

            byte[] buffer = ficheroEntrada.readAllBytes();
            ficheroSalida.write(buffer);
            ficheroSalida.close();

        } catch (IOException e) {
            System.out.println("Error escribiendo archivo: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
