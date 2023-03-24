package CursoIntroProgramacion;


public class EjerciciosTema3 {

    public static void main(String[] args) {

        System.out.println("Creando objeto: miCoche ...");
        Coche miCoche = new Coche();
       
        System.out.println("Añadiendo puerta al coche ...");
        miCoche.agregarPuertas(1);

        System.out.println("Cantidad total de puertas del coche:");
        System.out.println(miCoche.getPuertas());


    }

}

class Coche {

    private int puertas = 4;

    public void agregarPuertas(int nPuertas){

        puertas += nPuertas;

    }


    public int getPuertas() {
        return puertas;
    }

    public void mostrarPuertas() {
        System.out.println("Numero de puertas del coche");
        System.out.println( puertas);

    }

    


}