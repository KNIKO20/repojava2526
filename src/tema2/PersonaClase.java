package tema2;

class Persona{
	private String nombre;
	private int edad;
	private String dni;
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dniUser) {
		dni = dniUser;
		
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("DNI: "+dni);
	}
}
public class PersonaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Kev",19,"1234322X");
		persona.mostrarInfo();
		persona.setDni("3289201H");
		persona.setEdad(20);
		System.out.println("DNI actualizado: "+persona.getDni());
	}

}
