package tema3.rfef;

public class CentrocampistaKevin {
	private String nombre;
	private int edad;
	int numAsistencias;
	public CentrocampistaKevin(String nombre, int edad, int numAsistencias) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numAsistencias = numAsistencias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumAsistencias() {
		return numAsistencias;
	}
	public void setNumAsistencias(int numAsistencias) {
		this.numAsistencias = numAsistencias;
	}
	@Override
	public String toString() {
		return "Centrocampista [nombre=" + nombre + ", edad=" + edad + ", numAsistencias=" + numAsistencias + "]";
	}
	
}
