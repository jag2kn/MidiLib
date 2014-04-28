package edu.poli.midilib;

import java.util.ArrayList;

public class ListaInteligente {
	private String nombre;
	private ArrayList<Criterio> criterios;
	private ArrayList<Cancion> canciones;
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	ArrayList<Criterio> getCriterios() {
		return criterios;
	}
	void setCriterios(ArrayList<Criterio> criterios) {
		this.criterios = criterios;
	}
	ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
}
