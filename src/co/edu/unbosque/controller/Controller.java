package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Bostinder;
import co.edu.unbosque.view.FrameConfiguracion;
import co.edu.unbosque.view.FrameMenu;
import co.edu.unbosque.view.FrameRegistro;

public class Controller  implements ActionListener{
	private FrameMenu fm;
	private Bostinder bos;
	private FrameConfiguracion fg;
	private FrameRegistro fr;
	
	
	public Controller() {
	
		bos = new Bostinder();
		iniciar();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
	
	public void iniciar() {
		fm = new FrameMenu(this, bos.getHandler());
	}


	
}
