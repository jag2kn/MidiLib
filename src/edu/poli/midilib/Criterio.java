package edu.poli.midilib;

public class Criterio {
	private String campo;
	private Integer valor;
	private Boolean incluido;
	String getCampo() {
		return campo;
	}
	void setCampo(String campo) {
		this.campo = campo;
	}
	Integer getValor() {
		return valor;
	}
	void setValor(Integer valor) {
		this.valor = valor;
	}
	Boolean getIncluido() {
		return incluido;
	}
	void setIncluido(Boolean incluido) {
		this.incluido = incluido;
	}
}
