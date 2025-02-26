package es.studium.springBoot;

public class Pasajero {

	private String nombrePasajero;
	private int asientoPasajero;
	
	public Pasajero() {
		this.nombrePasajero="";
		this.asientoPasajero=0;
	}
	
	public Pasajero(String nombrePasajero, int asientoPasajero) {
		super();
		this.nombrePasajero = nombrePasajero;
		this.asientoPasajero = asientoPasajero;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public void setNombrePasajero(String nombrePasajero) {
		this.nombrePasajero = nombrePasajero;
	}

	public int getAsientoPasajero() {
		return asientoPasajero;
	}

	public void setAsientoPasajero(int asientoPasajero) {
		this.asientoPasajero = asientoPasajero;
	}

	@Override
	public String toString() {
		return "Pasajero [nombrePasajero=" + nombrePasajero + ", asientoPasajero=" + asientoPasajero + "]";
	}	
}
