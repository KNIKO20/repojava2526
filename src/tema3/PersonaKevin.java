package tema3;
/**
 * La clase PersonaKevin representa una persona con nombre, edad y estatura. Permite saludar, crecer, cumplir años, consultar información de la persona.
 * @author Kevin
 * @since 05/11/2025
 */
public class PersonaKevin {

	private String nombre;
	private byte edad;
	private double estatura;
	
	public PersonaKevin(String paramNombre, byte paramEdad, double paramEstatura) {
		this.nombre = paramNombre;
		this.edad = paramEdad;
		this.estatura = paramEstatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public void crecer(double incremento) {
		if (incremento <= 0) {
			System.out.println("Valor inválido");
		} else {
			estatura+=incremento;
			//System.out.println(nombre+" ha crecido "+incremento+" m");
		}
	}
	public void cumplirAnyos() {
		edad+=1;
		//System.out.println(nombre+" ha cumplido "+edad+" años");
	}
	public void saludar() {
		System.out.println("Hola. Mi nombre es "+nombre+"\nEncantado de conocerte");
	}

	@Override
	public String toString() {
		return "PersonaKevin [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}
}
