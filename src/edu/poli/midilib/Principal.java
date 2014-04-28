package edu.poli.midilib;

public class Principal {
	public static void main(String[] args) {
		LibreriaMusical lm = new LibreriaMusical();
		//Archivos descargados de http://midi-archive.com/
		lm.agregarArchivos("files/data/midis/");
		lm.reproducirCancion(90);
	}
}
