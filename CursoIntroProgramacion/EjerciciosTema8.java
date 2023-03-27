
/* 
Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre
 y telefono, por último muéstralas por consola.
*/


public class EjerciciosTema8 {

 
    public static void main(String[] args) {
    	
    Persona persona00 = new Persona(650,"55555555","Matusalen");
    
    System.out.println("Datos de la persona:");
    
    System.out.println("Edad:");
    System.out.println(persona00.getEdad());
   
    System.out.println("Nombre:");
    System.out.println(persona00.getNombre());
   
    System.out.println("Tel.:");
    System.out.println(persona00.getTelefono());
    
    }
    
}
    
class Persona {
	
	private int edad;
	private String telefono;
	private String nombre;
	
	public Persona(int edad, String telefono, String nombre) {
		
		this.edad = edad;
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
    



