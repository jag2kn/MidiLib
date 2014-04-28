package edu.poli.midilib;

import java.util.ArrayList;

public class Cancion {
	private Integer identificador;
	private String titulo;
	private String artista;
	private Integer anho;
	private String casaDiscografica;
	private String comentarios;
	private Long duracion;
	private String rutaArchivo;
	private ArrayList<Pista> pistas;
	
	public Escala calcularEscalaCancion(){
		return null;
	}
	
	Integer getIdentificador() {
		return identificador;
	}
	void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	String getTitulo() {
		return titulo;
	}
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	String getArtista() {
		return artista;
	}
	void setArtista(String artista) {
		this.artista = artista;
	}
	Integer getAnho() {
		return anho;
	}
	void setAnho(Integer anho) {
		this.anho = anho;
	}
	String getCasaDiscografica() {
		return casaDiscografica;
	}
	void setCasaDiscografica(String casaDiscografica) {
		this.casaDiscografica = casaDiscografica;
	}
	String getComentarios() {
		return comentarios;
	}
	void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	Long getDuracion() {
		return duracion;
	}
	void setDuracion(Long duracion) {
		this.duracion = duracion;
	}
	String getRutaArchivo() {
		return rutaArchivo;
	}
	void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	ArrayList<Pista> getPistas() {
		return pistas;
	}

	void setPistas(ArrayList<Pista> pistas) {
		this.pistas = pistas;
	}
	
}
