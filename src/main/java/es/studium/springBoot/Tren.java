package es.studium.springBoot;

import java.util.ArrayList;
import java.util.List;

public class Tren {

	private String modelo;
	private int numeroAsientosTren;
	private List<Tripulacion> tripulacion;
	
	public Tren() {
		this.modelo ="";
		this.numeroAsientosTren =0;
		this.tripulacion = new ArrayList();
	}

	public Tren(String modelo, int numeroAsientosTren, List<Tripulacion> tripulacion) {
		super();
		this.modelo = modelo;
		this.numeroAsientosTren = numeroAsientosTren;
		this.tripulacion = tripulacion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroAsientosTren() {
		return numeroAsientosTren;
	}

	public void setNumeroAsientosTren(int numeroAsientosTren) {
		this.numeroAsientosTren = numeroAsientosTren;
	}

	public List<Tripulacion> getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(List<Tripulacion> tripulacion) {
		this.tripulacion = tripulacion;
	}

	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", numeroAsientosTren=" + numeroAsientosTren + ", tripulacion=" + tripulacion
				+ "]";
	}
}
