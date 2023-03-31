package EjerciciosTema4;
import java.util.Random;

/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

 */

public class EjerciciosTema4 {
    public static void main(String[] args) {


        SmartPhone aPhone = new SmartPhone(
                "E-phone",
                "Machinetosh",
                new int[] {2796,1290},
                new float[] {78.1f,7.4f,160.8f},
                40
        );

        SmartWatch aWatch = new SmartWatch(
                "E-watch",
                "Machinetosh",
                new int[] {640,480},
                new float[] {25.0f,5.5f,25.0f}
        );

        System.out.println("--- Instancia Smartphone ---");
        System.out.print("Nro. de serie: ");
        System.out.println(Math.abs(aPhone.numeroSerie));
        System.out.print("Marca: ");
        System.out.println(aPhone.marca);
        System.out.print("Modelo: ");
        System.out.println(aPhone.modelo);
        System.out.print("Tamaño bateria (Wh): ");
        System.out.println(aPhone.bateriaWh);
        System.out.print("Resolucion de la camara en Megapixels: ");
        System.out.println(aPhone.resolucionCamara);
        System.out.print("Resolucion pantalla: ");
        System.out.print(aPhone.resolucionPantalla[0]);
        System.out.print(" X ");
        System.out.println(aPhone.resolucionPantalla[1]);
        System.out.print("Tipo pantalla: ");
        System.out.println(aPhone.tipoPantalla);
        System.out.print("Version de Android: ");
        System.out.println(aPhone.versionAndroid);
        System.out.print("Tiene GPS: ");
        System.out.println(aPhone.tieneGPS);
        System.out.print("Tiene teclas fisicas: ");
        System.out.println(aPhone.tieneTeclasFisicas);
        System.out.println(" ");

        System.out.println("--- Instancia Smartwatch ---");

        System.out.print("Nro. de serie: ");
        System.out.println(Math.abs(aWatch.numeroSerie));
        System.out.print("Marca: ");
        System.out.println(aWatch.marca);
        System.out.print("Modelo: ");
        System.out.println(aWatch.modelo);
        System.out.print("Tamaño bateria (Wh): ");
        System.out.println(aWatch.bateriaWh);
        System.out.print("Material de la malla: ");
        System.out.println(aWatch.materialMalla);
        System.out.print("Resolucion pantalla: ");
        System.out.print(aWatch.resolucionPantalla[0]);
        System.out.print(" X ");
        System.out.println(aWatch.resolucionPantalla[1]);
        System.out.print("Tipo pantalla: ");
        System.out.println(aWatch.tipoPantalla);
        System.out.print("Version de Android: ");
        System.out.println(aWatch.versionAndroid);
        System.out.print("Tiene GPS: ");
        System.out.println(aWatch.tieneGPS);
        System.out.print("Tiene sensor pulso: ");
        System.out.println(aWatch.tieneSensorPulso);
        System.out.println(" ");

    }
}

abstract class SmartDevice {
    int numeroSerie;
    String marca;
    String modelo;
    float peso;                             //peso en gramos
    float[] dimensiones = new float[3];     //array de dimensiones en mm (ancho,alto,profundidad)
    int[] resolucionPantalla = new int[2];
    float bateriaWh;
    String versionAndroid;
    String tipoPantalla;
    boolean tieneAcelerometro;
    boolean tieneGPS;


    public SmartDevice(){

        this.numeroSerie = new Random().nextInt();
        this.versionAndroid = "13.0 Triramisu";
        this.tipoPantalla = "OLED";
        this.tieneAcelerometro = true;
        }



}

class SmartWatch extends SmartDevice {

    boolean tieneSensorPulso;
    String materialMalla;

    public SmartWatch(
        String modelo,
        String marca,
        int[] resolucionPantalla,
        float[] dimensiones
        )
        {
        this.tieneSensorPulso = true;
        this.materialMalla = "plastico";
        this.modelo = modelo;
        this.marca = marca;
        this.resolucionPantalla = resolucionPantalla;
        this.dimensiones = dimensiones;
        this.bateriaWh = 1.0f;
        }

}

class SmartPhone extends SmartDevice {

    boolean tieneTeclasFisicas;
    int resolucionCamara;

    public SmartPhone(
            String modelo,
            String marca,
            int[] resolucionPantalla,
            float[] dimensiones,
            int resolucionCamara
            )
            {
            this.tieneTeclasFisicas = true;
            this.modelo = modelo;
            this.marca = marca;
            this.resolucionPantalla = resolucionPantalla;
            this.dimensiones = dimensiones;
            this.resolucionCamara = resolucionCamara;
            this.bateriaWh = 5.2f;
            }

}