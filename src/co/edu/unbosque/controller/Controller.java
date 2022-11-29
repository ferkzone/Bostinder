package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Bostinder;
import co.edu.unbosque.model.DatosIncompletosException;
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
		}else if (e.getActionCommand().equals(fm.getBotonRegis().getActionCommand())) {
			fm.abrirFrameGen();
		}else if(e.getActionCommand().equals(bos.getHandler().getProperties().getProperty("persistence.FrameGenero.boton"))) {
			fm.abrirFramesGeneros();
		}else if(e.getActionCommand().equals(bos.getHandler().getProperties().getProperty("persistence.FrameRegistro.vol"))){
			fm.getFrreg().setVisible(false);
			fm.setVisible(true);
		}else if(e.getActionCommand().equals(bos.getHandler().getProperties().getProperty("persistence.FrameTutorial.atras"))){
			fm.getFrtut().setVisible(false);
			fm.setVisible(true);
		}else if(e.getActionCommand().equals(bos.getHandler().getProperties().getProperty("persistence.FrameMujer.botonContinuar"))) {
			System.out.println("a");
			String nombre = fm.getFrmuj().getTxtNombre().getText();
			String usuario = fm.getFrmuj().getTxtUser().getText();
			String nacimiento = fm.getFrmuj().getCalendar().getDateFormatString();
			boolean divorcios = true;
			if(fm.getFrmuj().getSi().isSelected()) {
				 divorcios = true;
			}else if(fm.getFrmuj().getNo().isSelected()) {
				 divorcios = false;
			}
			String correo = fm.getFrmuj().getTxtCorreo().getText();
			try {
				double estatura = Double.parseDouble(fm.getFrmuj().getTxtEstatura().getText());
				bos.getMujer().añadirMujeres(nombre, "", 0, estatura, 0, divorcios, correo);
			} catch (DatosIncompletosException e1) {
				// TODO Auto-generated catch block
				fm.mostrarMensaje("No puede haber un dato en blanco!");
			}catch(NumberFormatException en) {
				fm.mostrarMensaje("Escribe un número en estatura!");
			}
		}
			
	}
	
	
	
	
	
	
}