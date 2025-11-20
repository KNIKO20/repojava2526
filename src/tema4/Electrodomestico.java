package tema4;

public class Electrodomestico {
	private String marca;
	private String modelo;
	private int precio;
	private String color;
	private double potenciaWatios;
	private int horasXDia;
	private int diasXAnyo;
	private double precioEnergia; // €/kWh
	
	//Constructores
	public Electrodomestico(String marca, String modelo, int precio, String color, double potenciaWatios, int horasXDia,
			int diasXAnyo, double precioEnergia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.potenciaWatios = potenciaWatios;
		this.horasXDia = horasXDia;
		this.diasXAnyo = diasXAnyo;
		this.precioEnergia = precioEnergia;
	}

	public Electrodomestico(String marca, String modelo, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = "gris";
		this.potenciaWatios = 2300;
		this.horasXDia = 1;
		this.diasXAnyo = 144;
		this.precioEnergia = 0.40397;
	}

	public Electrodomestico() {
		super();
		this.marca = "bosch";
		this.modelo = "7200";
		this.precio = 400;
		this.color = "gris";
		this.potenciaWatios = 2300;
		this.horasXDia = 1;
		this.diasXAnyo = 144;
		this.precioEnergia = 0.40397;
	}
	public Electrodomestico(double potenciaWatios, int horasXDia, int diasXAnyo) {
		super();
		this.marca = "bosch";
		this.modelo = "7200";
		this.precio = 400;
		this.color = "gris";
		this.potenciaWatios = potenciaWatios;
		this.horasXDia = horasXDia;
		this.diasXAnyo = diasXAnyo;
		this.precioEnergia = 0.40397;
	}
	// Fin constructores
	
	// Getters And Setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPotenciaWatios() {
		return potenciaWatios;
	}

	public void setPotenciaWatios(double potenciaWatios) {
		this.potenciaWatios = potenciaWatios;
	}

	public int getHorasXDia() {
		return horasXDia;
	}

	public void setHorasXDia(int horasXDia) {
		this.horasXDia = horasXDia;
	}

	public int getDiasXAnyo() {
		return diasXAnyo;
	}

	public void setDiasXAnyo(int diasXAnyo) {
		this.diasXAnyo = diasXAnyo;
	}

	public double getPrecioEnergia() {
		return precioEnergia;
	}

	public void setPrecioEnergia(double precioEnergia) {
		this.precioEnergia = precioEnergia;
	}
	// Fin getters and setters
	
	//Metodos
	public double consumoAnual() {
		double consumoXAnyo = (((this.potenciaWatios * this.horasXDia * diasXAnyo) / 1000)*precioEnergia);
		return consumoXAnyo;
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", potenciaWatios=" + potenciaWatios + ", horasXDia=" + horasXDia + ", diasXAnyo=" + diasXAnyo
				+ ", precioEnergia=" + precioEnergia + "]";
	}
	
	
	
}
