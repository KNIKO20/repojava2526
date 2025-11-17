package tema3.rfef;

public class EntrenadorKevin {
	private String nombre;
	private int edad;	private int añosExperiencia;	private int títulos;
	public EntrenadorKevin(String nombre, int edad, int añosExperiencia, int títulos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.añosExperiencia = añosExperiencia;
		this.títulos = títulos;
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
	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	public int getTítulos() {
		return títulos;
	}
	public void setTítulos(int títulos) {
		this.títulos = títulos;
	}
	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", edad=" + edad + ", añosExperiencia=" + añosExperiencia + ", títulos="
				+ títulos + "]";
	}
	
	
}
