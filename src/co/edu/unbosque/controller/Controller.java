package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.FrameConfiguracion;
import co.edu.unbosque.view.FrameMenu;
import co.edu.unbosque.view.FrameRegistro;

public class Controller implements ActionListener {
	private FrameMenu fm;
	private FrameConfiguracion fcg;
	private FrameRegistro fr;

	public Controller() {
		iniciar();
		
	}

	public void iniciar() {
		fm = null;
		fm = new FrameMenu(this);
		fcg = null;
		fcg = new FrameConfiguracion(this, null);
		fr = null;
		fr = new FrameRegistro(this);
		FrameRegistro newframe = new FrameRegistro(this);
		newframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		

	}
}