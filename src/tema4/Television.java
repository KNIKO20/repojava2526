package tema4;

public class Television extends Electrodomestico {
	private int resolucion;

	public Television(int resolucion) {
		this.resolucion = resolucion;
	}
	public Television() {
		this.resolucion = 1024;
	}
	
	
	//Methods
	@Override
	public double consumoAnual() {
		if (this.resolucion > 50) {
			return super.consumoAnual() + 30;
		}
		 return super.consumoAnual();
		
	}
	
	// Getters y setters
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + super.toString() +"]";
	}
	
	
}
