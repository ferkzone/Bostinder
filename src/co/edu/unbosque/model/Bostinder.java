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
	private String[] datah;
	private String[] datam;
	

	public Bostinder() {
		
		sound = new SonidoDAO();
		handler = new FileHandler();
		mujer = new MujerDAO();
		hombre = new HombreDAO();
		usuarios = new UsuariosFile();
	}
	
	
	public void cargarHombres() {
		usuarios.leerArchivoH();
		datah = usuarios.getDatos();
		for(int i=1;i<usuarios.getDatos().length;i++) {
			hombre.anadirHombres(datah[i*1], 
					datah[i*2], 
					datah[i*3],
					datah[i*4], 				 
					datah[i*6],				 			
					Integer.parseInt(datam[i*11]), 
					Double.parseDouble(datam[i*10]),
					Integer.parseInt(datam[i*9]),	
					datah[i*7],
					Double.parseDouble(datam[i*12]),
					datah[i*8],
					datah[i*5]);
					
		}
	}
	
	public void cargarMujeres() {
		usuarios.leerArchivoM();
		boolean divorcio = false;
		datam = usuarios.getDatos();
		for(int i=1;i<usuarios.getDatos().length;i++) {
			if(datam[i*9].equals("SI")) {
				divorcio = true;
			}
			mujer.anadirMujeres(datam[i*1], 
					datam[i*2], 
					datam[i*3],
					datam[i*4], 
					datam[i*5], 
					Integer.parseInt(datam[i*12]), 
					Double.parseDouble(datam[i*11]),
					Integer.parseInt(datam[i*10]),
					divorcio, 
					datam[i*7], 
					datam[i*8], 
					datam[i*6]);
		}		
		System.out.println(mujer.listarMujeres());
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
