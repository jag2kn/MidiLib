package edu.poli.midilib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class LibreriaMusical {
	private ArrayList<Escala> escalas;
	private ArrayList<Cancion> canciones;
	private ArrayList<ListaReproduccion> listasReproduccion;
	private ArrayList<ListaInteligente> listasInteligentes;
	ArrayList<Escala> getEscalas() {
		return escalas;
	}
	void setEscalas(ArrayList<Escala> escalas) {
		this.escalas = escalas;
	}
	ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	ArrayList<ListaReproduccion> getListasReproduccion() {
		return listasReproduccion;
	}
	void setListasReproduccion(ArrayList<ListaReproduccion> listasReproduccion) {
		this.listasReproduccion = listasReproduccion;
	}
	ArrayList<ListaInteligente> getListasInteligentes() {
		return listasInteligentes;
	}
	void setListasInteligentes(ArrayList<ListaInteligente> listasInteligentes) {
		this.listasInteligentes = listasInteligentes;
	}
	
	public void inicializar(){
		
	}
	public void agregarArchivos(String carpeta){
	    System.out.println("Agregando archivos");
	    File dir = new File(carpeta);
	    String[] children = dir.list();
	    
	    canciones = new ArrayList<>();
	    Cancion c;
	    
	    if (children == null) {
	        // Either dir does not exist or is not a directory
	    } else {
	        for (int i=0; i < children.length; i++) {
	            // Get filename of file or directory
	            String filename = children[i];
	            System.out.println(i+" "+filename);
	            c= new Cancion();
	            c.setRutaArchivo(carpeta+filename);
	            
	            canciones.add(c);
	        }
	    }
		
		
	}
	public Boolean crearListaReproduccion(String nombre, ArrayList<Cancion> canciones){
		return null;
	}
	public Boolean crearListaInteligente(String nombre, ArrayList<Cancion> canciones){
		return null;
	}
	public ArrayList<Cancion> ordenarCancionesPor(String parametro, Boolean ascendente){
		return null;
	}
	public ArrayList<Cancion> filtrarCancionesPor(ArrayList<Criterio>criterios){
		return null;
	}
	public Boolean eliminarLista(String nombre){
		return null;
	}
	public Boolean editarMetadatos(Integer xx, String nombre){
		return null;
	}
	public ListaReproduccion darMezclaArmonizada(String xx){
		return null;
	}
	public void reproducirCancion(int i) {
		if(canciones.size()>i){
			Sequence mySeq;
			Sequencer sequencer;
			String ruta = canciones.get(i).getRutaArchivo();
			
			try {
				sequencer = MidiSystem.getSequencer();
				if (sequencer != null){
					sequencer.open();
					FileInputStream is = new FileInputStream(ruta);
					mySeq = MidiSystem.getSequence(is);
					sequencer.setSequence(mySeq);
					System.out.println("Reproducción de "+ruta);
					sequencer.start();
				}
			} catch (MidiUnavailableException | InvalidMidiDataException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	
	

}
