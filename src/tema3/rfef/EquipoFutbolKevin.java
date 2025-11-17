package tema3.rfef;

import java.time.LocalDate;

public class EquipoFutbolKevin {
	private String nombreEquipo;
	private String ciudad;
	private String nombreCampo;
	private LocalDate fechaFundacion;
	private EntrenadorKevin entrenador;
	private PorteroKevin porteroTitular;
	private DefensaKevin central1;
	private DefensaKevin central2;
	private DefensaKevin interiorIzq;
	private DefensaKevin interiorDcha;
	private CentrocampistaKevin centrocampista1;
	private CentrocampistaKevin centrocampista2;
	private CentrocampistaKevin centrocampista3;
	private DelanteroKevin extremoIzq;
	private DelanteroKevin extremoDcha;
	private DelanteroKevin delanteroCentro;
	private int puntos;
	public EquipoFutbolKevin(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
			EntrenadorKevin entrenador, PorteroKevin porteroTitular, DefensaKevin central1, DefensaKevin central2, DefensaKevin interiorIzq,
			DefensaKevin interiorDcha, CentrocampistaKevin centrocampista1, CentrocampistaKevin centrocampista2,
			CentrocampistaKevin centrocampista3, DelanteroKevin extremoIzq, DelanteroKevin extremoDcha, DelanteroKevin delanteroCentro,
			int puntos) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.ciudad = ciudad;
		this.nombreCampo = nombreCampo;
		this.fechaFundacion = fechaFundacion;
		this.entrenador = entrenador;
		this.porteroTitular = porteroTitular;
		this.central1 = central1;
		this.central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDcha = interiorDcha;
		this.centrocampista1 = centrocampista1;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.extremoIzq = extremoIzq;
		this.extremoDcha = extremoDcha;
		this.delanteroCentro = delanteroCentro;
		this.puntos = puntos;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public EntrenadorKevin getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(EntrenadorKevin entrenador) {
		this.entrenador = entrenador;
	}
	public PorteroKevin getPorteroTitular() {
		return porteroTitular;
	}
	public void setPorteroTitular(PorteroKevin porteroTitular) {
		this.porteroTitular = porteroTitular;
	}
	public DefensaKevin getCentral1() {
		return central1;
	}
	public void setCentral1(DefensaKevin central1) {
		this.central1 = central1;
	}
	public DefensaKevin getCentral2() {
		return central2;
	}
	public void setCentral2(DefensaKevin central2) {
		this.central2 = central2;
	}
	public DefensaKevin getInteriorIzq() {
		return interiorIzq;
	}
	public void setInteriorIzq(DefensaKevin interiorIzq) {
		this.interiorIzq = interiorIzq;
	}
	public DefensaKevin getInteriorDcha() {
		return interiorDcha;
	}
	public void setInteriorDcha(DefensaKevin interiorDcha) {
		this.interiorDcha = interiorDcha;
	}
	public CentrocampistaKevin getCentrocampista1() {
		return centrocampista1;
	}
	public void setCentrocampista1(CentrocampistaKevin centrocampista1) {
		this.centrocampista1 = centrocampista1;
	}
	public CentrocampistaKevin getCentrocampista2() {
		return centrocampista2;
	}
	public void setCentrocampista2(CentrocampistaKevin centrocampista2) {
		this.centrocampista2 = centrocampista2;
	}
	public CentrocampistaKevin getCentrocampista3() {
		return centrocampista3;
	}
	public void setCentrocampista3(CentrocampistaKevin centrocampista3) {
		this.centrocampista3 = centrocampista3;
	}
	public DelanteroKevin getExtremoIzq() {
		return extremoIzq;
	}
	public void setExtremoIzq(DelanteroKevin extremoIzq) {
		this.extremoIzq = extremoIzq;
	}
	public DelanteroKevin getExtremoDcha() {
		return extremoDcha;
	}
	public void setExtremoDcha(DelanteroKevin extremoDcha) {
		this.extremoDcha = extremoDcha;
	}
	public DelanteroKevin getDelanteroCentro() {
		return delanteroCentro;
	}
	public void setDelanteroCentro(DelanteroKevin delanteroCentro) {
		this.delanteroCentro = delanteroCentro;
	}
	public DelanteroKevin getPichichiEquipo() {
		if (extremoDcha.getGolesAnotados() > extremoIzq.getGolesAnotados()) {
			if (extremoDcha.getGolesAnotados() > delanteroCentro.getGolesAnotados()) {
				
				return extremoDcha;
			} else {
				return delanteroCentro;
			}
		} else if (extremoDcha.getGolesAnotados() < extremoIzq.getGolesAnotados()){
			if (extremoIzq.getGolesAnotados() > delanteroCentro.getGolesAnotados()) {			
				return extremoIzq;
			} else {
				return delanteroCentro;
			}
		} else {
			return delanteroCentro;
		}
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos += puntos;
	}
	@Override
	public String toString() {
		return "EquipoFutbol [nombreEquipo=" + nombreEquipo + ", ciudad=" + ciudad + ", nombreCampo=" + nombreCampo
				+ ", fechaFundacion=" + fechaFundacion + ", entrenador=" + entrenador + ", porteroTitular="
				+ porteroTitular + ", central1=" + central1 + ", central2=" + central2 + ", interiorIzq=" + interiorIzq
				+ ", interiorDcha=" + interiorDcha + ", centrocampista1=" + centrocampista1 + ", centrocampista2="
				+ centrocampista2 + ", centrocampista3=" + centrocampista3 + ", extremoIzq=" + extremoIzq
				+ ", extremoDcha=" + extremoDcha + ", delanteroCentro=" + delanteroCentro + ", puntos=" + puntos + "]";
	}
}
