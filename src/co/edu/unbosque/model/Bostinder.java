package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.model.persistence.UsuariosFile;

public class Bostinder {
	private FileHandler handler;
	private MujerDAO mujer;
	private HombreDAO hombre;
	private SonidoDAO sound;
	private UsuariosFile usuarios;
	
	

	public Bostinder() {
		sound = new SonidoDAO();
		handler = new FileHandler();
		mujer = new MujerDAO();
		hombre = new HombreDAO();
		usuarios = new UsuariosFile();
	}
	
	
	public void cargarMujeres() {
		
	}
	
	public void cargarHombres() {
		ArrayList<String> datos = new ArrayList<String>();
		usuarios.leerArchivoH();
		for(int i=0;i<usuarios.getDatos().length;i++) {
		}
		
	}
	public MujerDAO getMujer() {
		return mujer;
	}

	public void setMujer(MujerDAO mujer) {
		this.mujer = mujer;
	}

	public FileHandler getHandler() {
		return handler;
	}

	public void setHandler(FileHandler handler) {
		this.handler = handler;
	}

	public HombreDAO getHombre() {
		return hombre;
	}

	public void setHombre(HombreDAO hombre) {
		this.hombre = hombre;
	}
	public SonidoDAO getSound() {
		return sound;
	}

	public void setSound(SonidoDAO sound) {
		this.sound = sound;
	}
	
}
