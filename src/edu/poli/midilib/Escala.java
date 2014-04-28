package edu.poli.midilib;

import java.util.ArrayList;

public class Escala {
	private String nombre;
	private ArrayList<Nota> notasEscala; 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Nota> getNotasEscala() {
		return notasEscala;
	}

	public void setNotasEscala(ArrayList<Nota> notasEscala) {
		this.notasEscala = notasEscala;
	}
}
