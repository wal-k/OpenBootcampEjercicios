package CursoIntroProgramacion;


public class EjerciciosTema3 {

    public static int sumaDeNumeros(int n1, int n2, int n3){

        return n1 + n2 + n3;

    }

        public static void main(String[] args) {

        System.out.println("Sumando 1 + 2 + 3 ...");  
        System.out.println((sumaDeNumeros(1,2,3)));    

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