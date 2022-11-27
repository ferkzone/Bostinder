package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Bostinder;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.FrameConfiguracion;
import co.edu.unbosque.view.FrameMenu;
import co.edu.unbosque.view.FrameRegistro;

public class Controller implements ActionListener {
	private FrameMenu fm;
	private Bostinder bos;
	
	public Controller() {
		bos = new Bostinder();
		iniciar();
	}

	public void iniciar() {
		fm = new FrameMenu(this,bos.getHandler());


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(fm.getBotonInicioS().getActionCommand())) {
			fm.abrirFrameRegistro();
		}else if(e.getActionCommand().equals(fm.getBotonConfi().getActionCommand())) {
			fm.abrirFrameConfig();
		}else if (e.getActionCommand().equals(fm.getBotonComoFun().getActionCommand())) {
			fm.abrirFrameTut();
		}
			
		

	}
}