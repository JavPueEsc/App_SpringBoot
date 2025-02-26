package es.studium.springBoot;

public class Tripulacion {

	private String nombreTripulacion;
	private String cargo;
	
	public Tripulacion() {
		this.nombreTripulacion = "";
		this.cargo ="";
	}

	public Tripulacion(String nombreTripulacion, String cargo) {
		super();
		this.nombreTripulacion = nombreTripulacion;
		this.cargo = cargo;
	}
	
	public String getNombreTripulacion() {
		return nombreTripulacion;
	}

	public void setNombreTripulacion(String nombreTripulacion) {
		this.nombreTripulacion = nombreTripulacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Tripulacion [nombreTripulacion=" + nombreTripulacion + ", cargo=" + cargo + "]";
	}
}
