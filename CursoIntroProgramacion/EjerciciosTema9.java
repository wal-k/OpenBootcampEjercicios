
/* 
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas 
por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 y con una variable salario que solo tenga la clase Trabajado
*/


public class EjerciciosTema9 {

 
    public static void main(String[] args) {
    	
    Cliente cliente00 = new Cliente(650,"55555555","Matusalen",500.00);
    
    System.out.println("Datos del cliente:");
    
    System.out.println("Edad:");
    System.out.println(cliente00.getEdad());
   
    System.out.println("Nombre:");
    System.out.println(cliente00.getNombre());
   
    System.out.println("Tel.:");
    System.out.println(cliente00.getTelefono());
    
    System.out.println("Credito:");
    System.out.println(cliente00.getCredito());
    
    }
}
    

class Person {
	
	protected int edad;
	protected String telefono;
	protected String nombre;
	
	public Person(){}
	
	public Person(int edad, String telefono, String nombre) {
		
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
    
class Cliente extends Person {
	
	double credito;
	
	public Cliente(int edad, String nombre, String telefono, double credito){
		
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
		this.credito = credito;
		
	}
	
	
	
	public double getCredito() {
		return this.credito;
	}
	
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
	
	
	
	
}


