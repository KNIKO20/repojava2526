package tema4;

public class Perro extends Mascotas {
	private String raza;
	private boolean tienePulgas;
	public Perro(String nombre, int anyoNacimiento, String raza, boolean tienePulgas) {
		super(nombre, anyoNacimiento);
		this.raza = raza;
		this.tienePulgas = tienePulgas;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isTienePulgas() {
		return tienePulgas;
	}
	public void setTienePulgas(boolean tienePulgas) {
		this.tienePulgas = tienePulgas;
	}
	public void tienePulgas() {
		String mensaje = "El perro ";
		mensaje += tienePulgas ? "SI" : "NO";
		mensaje += " tiene pulgas ";
		System.out.println(mensaje);
	}
	
	public void calcularVacuna(int anyo) {
		double precio;
		int edad = anyo - super.getAnyoNacimiento();
		if (edad <= 5) {
			precio = (20 + (edad * 0.3)) ;
			System.out.println("El precio de la vacuna es "+precio);
		} else if (edad > 5 && edad <= 10 ) {
			precio = (15 + (edad * 0.2)) ;
			System.out.println("El precio de la vacuna es "+precio);
		} else if (edad > 10) {
			precio = (12 + (edad * 0.1)) ;
			System.out.println("El precio de la vacuna es "+precio);
		} else {
			System.out.println("Edad no válida");
		}
	}
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tienePulgas=" + tienePulgas + "]" + super.toString() ;
	}
	
	
}
