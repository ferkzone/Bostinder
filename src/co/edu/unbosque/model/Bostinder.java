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
	
	
	public void cargarHombres() {
		usuarios.leerArchivoH();
		String[] data = usuarios.getDatos();
		for(int i=16;i<usuarios.getDatos().length;i++) {
			HombreDTO hombreaux = new HombreDTO(data[i*2],
					data[i*3],
					data[i*4],
					data[i*5],
					data[i*6],
					data[i*7],
					data[i*8],
					data[i*9]);
			hombre.getHombres().add(hombreaux);
		}
	}
	
	public void cargarMujeres() {
		usuarios.leerArchivoM();
		String[] data = usuarios.getDatos();
		for(int i=1;i<usuarios.getDatos().length;i++) {
			mujer.anadirMujeres(data[i*2], 
					data[i*3], 
					data[i*4],
					data[i*5], 
					data[i*6], 
					Integer.parseInt(data[i*7]), 
					data[i*8], 
					false, 
					data[i*10], 
					data[i*11]);
		}		
	}
	public UsuariosFile getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(UsuariosFile usuarios) {
		this.usuarios = usuarios;
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
