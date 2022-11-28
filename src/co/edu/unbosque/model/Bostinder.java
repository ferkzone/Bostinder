package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FileHandler;

public class Bostinder {
	private FileHandler handler;
	private MujerDAO mujer;
	private HombreDAO hombre;
	
	public Bostinder() {
		handler = new FileHandler();
		mujer = new MujerDAO();
		hombre = new HombreDAO();
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
	
}
