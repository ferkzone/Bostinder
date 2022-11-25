package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.FileHandler;

public class Bostinder {
	private FileHandler handler;
	
	public Bostinder() {
		handler = new FileHandler();
	}

	public FileHandler getHandler() {
		return handler;
	}

	public void setHandler(FileHandler handler) {
		this.handler = handler;
	}
	
}
