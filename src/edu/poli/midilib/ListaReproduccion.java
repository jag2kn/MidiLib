package edu.poli.midilib;

import java.util.ArrayList;

public class ListaReproduccion {
	private String nombre;
	private ArrayList<Cancion> canciones;
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
}
