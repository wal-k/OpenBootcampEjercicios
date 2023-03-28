package EjerciciosTema2;

public class EjerciciosTema2 {

    static float precioIvaIncluido(float precio) {
        float tasaIVA = 0.21f;
        return precio * (1.0f + tasaIVA);

    }
    public static void main(String[] args) {

        System.out.println(precioIvaIncluido(350.0f));

    }
}

