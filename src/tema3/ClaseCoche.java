package tema3;

public class ClaseCoche {
	//Toda clase java debe tener
	// 1-Atributo
	private String color;
	private int velocidad;
	private double size;
	//2-Constructor: Se tiene que llamr como la clase y el método debe se público
	public ClaseCoche(String color, int velocidad, double size) {
		this.color = color;
		this.velocidad = velocidad;
		this.size = size;
	}
	
	//3-Metodos
	public void avanzar() { } ;
	public void parar() { } ;
	public void girarlzquierda() { } ;
	public void girarDerecha() { } ;
	
	//Getter y setter
	public void setColor(String sNuevoColor) {
		this.color = sNuevoColor;
	}
	public String getColor() {
		return this.color;
	}
	
	//Imprimir objeto
	
	public String toString() {
		return "El coche es de "+color+", va a "+velocidad+" KM/h y mide "+size+" metros";
	}
}
