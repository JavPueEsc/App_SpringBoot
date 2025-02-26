package es.studium.springBoot;

import java.util.HashSet;
import java.util.Set;

public class Viaje {

	private String nombreViaje;
	private String origen;
	private String destino;
	private Tren tren;
	private Set<Pasajero> pasajeros;
	
	public Viaje() {
		this.nombreViaje ="";
		this.origen ="";
		this.destino ="";
		this.tren = new Tren();
		this.pasajeros = new HashSet<>();
	}

	public Viaje(String nombreViaje, String origen, String destino, Tren tren, Set<Pasajero> pasajeros) {
		super();
		this.nombreViaje = nombreViaje;
		this.origen = origen;
		this.destino = destino;
		this.tren = tren;
		this.pasajeros = pasajeros;
	}

	public String getNombreViaje() {
		return nombreViaje;
	}

	public void setNombreViaje(String nombreViaje) {
		this.nombreViaje = nombreViaje;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Tren getTren() {
		return tren;
	}

	public void setTren(Tren tren) {
		this.tren = tren;
	}

	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Viaje [nombreViaje=" + nombreViaje + ", origen=" + origen + ", destino=" + destino + ", tren=" + tren
				+ ", pasajeros=" + pasajeros + "]";
	}

}
