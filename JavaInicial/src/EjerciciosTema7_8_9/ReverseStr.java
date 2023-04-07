package EjerciciosTema7_8_9;

public class ReverseStr {

    public static void main(String[] args) {

        String texto = "Esto es un ejercicio para OpenBootcamp";
        String textoReverso = reverse("Esto es un ejercicio para OpenBootcamp");

        System.out.print("Texto de entrada: ");
        System.out.println(texto);
        System.out.print("Texto reverso: ");
        System.out.print(textoReverso);

    }

    public static String reverse(String texto) {

        int largoTexto = texto.length();
        char[] textoReverso = new char[largoTexto];

        for (int i = 0; i < largoTexto; i++) {

            textoReverso[i] = texto.charAt(largoTexto -1 - i);

        }

        return new String(textoReverso);


    }


}
