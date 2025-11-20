package tema4;

public class Mascotas {
	private String nombre;
	private int anyoNacimiento;
	public Mascotas(String nombre, int anyoNacimiento) {
		super();
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", anyoNacimiento=" + anyoNacimiento + "]";
	}
	
	public void habla(String paramMsg) {
		if (this instanceof Perro) {
			System.out.println("El perro ha dicho "+paramMsg);
		} else if (this instanceof Loro) {
			System.out.println("El loro ha dicho "+paramMsg);
		}
		
	}
}
