package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import co.edu.unbosque.model.Bostinder;
import co.edu.unbosque.model.DatosIncompletosException;
import co.edu.unbosque.model.EdadInvalidaException;
import co.edu.unbosque.model.SonidoDAO;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.model.persistence.UsuariosFile;
import co.edu.unbosque.view.FrameConfiguracion;
import co.edu.unbosque.view.FrameMenu;
import co.edu.unbosque.view.FrameRegistro;

public class Controller implements ActionListener {
	private FrameMenu fm;
	private Bostinder bos;
	
	public Controller() {
	
		bos = new Bostinder();
        bos.cargarHombres();
		iniciar();
		
	}

	public void iniciar() {
		fm = new FrameMenu(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bos.getSound().click();
		if(e.getActionCommand().equals(fm.getBotonInicioS().getActionCommand())) {
			fm.abrirFrameRegistro();			
		}else if(e.getActionCommand().equals(fm.getBotonConfi().getActionCommand())) {
			fm.abrirFrameConfig();
		}else if (e.getActionCommand().equals(fm.getBotonComoFun().getActionCommand())) {
			fm.abrirFrameTut();
		} else {
			bos.getHandler();
			if (e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameMenu.botonRegis"))) {
				fm.abrirFrameGen();
			} else {
				bos.getHandler();
				if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameGenero.boton"))) {
					fm.abrirFramesGeneros();
				} else {
					bos.getHandler();
					if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameGenero.boton1"))) {
						fm.setVisible(true);
						fm.getFrg().setVisible(false);
					} else {
						bos.getHandler();
						if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameRegistro.vol"))){
							fm.getFrreg().setVisible(false);
							fm.setVisible(true);
						} else {
							bos.getHandler();
							if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameHombre.botonVolver"))){
								fm.getFrg().setVisible(true);
								fm.getFrhom().setVisible(false);
							} else {
								bos.getHandler();
								if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameTutorial.atras"))){
									fm.getFrtut().setVisible(false);
									fm.setVisible(true);
								} else {
									bos.getHandler();
									if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.listo"))){
										fm.getFrconfig().setVisible(false);
										fm.setVisible(true);
									} else {
										bos.getHandler();
										if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameMujer.botonContinuar"))) {
											String nombre = fm.getFrmuj().getTxtNombre().getText();
											String usuario = fm.getFrmuj().getTxtUser().getText();			
											boolean divorcios = true;
											if(fm.getFrmuj().getSi().isSelected()) {
												 divorcios = true;
											}else if(fm.getFrmuj().getNo().isSelected()) {
												 divorcios = false;
											}
											
											String correo = fm.getFrmuj().getTxtCorreo().getText();
											try {
												SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-yyyy");
												String fecha = dcn.format(fm.getFrmuj().getCalendar().getDate()); 
												int edad = fm.obtenerA??os(fecha);
												double estatura = Double.parseDouble(fm.getFrmuj().getTxtEstatura().getText());
												//bos.getMujer().anadirMujeres(nombre, "", "", 0, edad, estatura, 0, divorcios,correo, fecha, usuario);
											}catch(NumberFormatException en) {
												fm.mostrarMensaje("Escribe un numero en estatura!");
											}catch(EdadInvalidaException ei) {
												fm.mostrarMensaje("No puedes registrarte si eres menor de edad!");
											}catch(NullPointerException fe) {
												fm.mostrarMensaje("Selecciona una fecha!");
											}System.out.println(bos.getMujer().listarMujeres());
										} else {
											bos.getHandler();
											if(e.getActionCommand().equals(FileHandler.getProperties().getProperty("persistence.FrameHombre.botonContinuar"))) {
												System.out.println("a");
												String nombre = fm.getFrhom().getTxtNombre().getText();
												String usuario = fm.getFrhom().getTxtUser().getText(); 
												String correo = fm.getFrhom().getTxtCorreo().getText();
												try {
													SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-yyyy");
													String fecha = dcn.format(fm.getFrhom().getCalendar().getDate()); 
													int edad = fm.obtenerA??os(fecha);
													double estatura = Double.parseDouble(fm.getFrhom().getTxtEstatura().getText());
													int ingresos = Integer.parseInt(fm.getFrhom().getTxtIngresos().getText());
													//bos.getHombre().anadirHombres(nombre,"","",0, edad, estatura, 0,correo, ingresos,fecha, usuario);
												}catch(NumberFormatException en) {
													fm.mostrarMensaje("Escribe un numero en el campo correspondiente!");
												}catch(NullPointerException fe) {
													fm.mostrarMensaje("Selecciona una fecha!");
												}catch(EdadInvalidaException ei) {
													fm.mostrarMensaje("No puedes registrarte si eres menor de edad!");
												}
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
			
	}
		
}