package edu.poli.midilib;

import java.util.ArrayList;

public class Pista {
	private Integer instrumento;
	private ArrayList<Nota> notas;
	public Integer getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(Integer instrumento) {
		this.instrumento = instrumento;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
}
