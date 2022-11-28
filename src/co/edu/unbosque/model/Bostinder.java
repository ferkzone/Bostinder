package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FileHandler;

public class Bostinder {
	private FileHandler handler;
	private MujerDAO mujer;
	
	
	public Bostinder() {
		handler = new FileHandler();
		mujer = new MujerDAO();
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
	
}
