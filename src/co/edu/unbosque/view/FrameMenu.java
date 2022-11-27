package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import co.edu.unbosque.model.persistence.FileHandler;

public class FrameMenu extends JFrame {

	private JPanel panel;
	private JButton botonInicioS, botonRegis, botonComoFun, botonConfi;
	private FrameBostinder frbos;
	private FrameHombre frhom;
	private FrameConfiguracion frconfig;
	private FrameRegistro frreg;
	private FrameTutorial frtut;

	public FrameMenu(ActionListener listener, FileHandler handler) {
		frhom = new FrameHombre(listener,handler);
		frbos = new FrameBostinder(listener,handler,"");
		frconfig = new FrameConfiguracion(listener,handler);
		frreg = new FrameRegistro(listener,handler);
		frtut = new FrameTutorial(listener,handler);
		
		panel = new JPanel();
		FileHandler.loadProperties(1);
		botonInicioS = new JButton(handler.getProperties().getProperty("persistence.FrameMenu.botonInicioS"));
		botonRegis = new JButton(handler.getProperties().getProperty("persistence.FrameMenu.botonRegis"));
		botonComoFun = new JButton(handler.getProperties().getProperty("persistence.FrameMenu.botonComoFun"));
		 botonConfi = new JButton(handler.getProperties().getProperty("persistence.FrameMenu.botonConfi"));
		 this.setSize(350,505);
		 this.setResizable(false);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 botonInicioS.setBorder(new MatteBorder(0, 0, 3, 0, Color.BLACK));
		 botonRegis.setBorder(new MatteBorder(0, 0, 3, 0, Color.BLACK));
		 botonConfi.setBorder(new MatteBorder(0, 0,3,0, Color.BLACK));
		 botonComoFun.setBorder (new MatteBorder(0, 0, 3, 0, Color.BLACK));
		 botonInicioS.setBackground(Color.WHITE);
		botonRegis.setBackground(Color.WHITE);
		 botonConfi.setBackground(Color.WHITE);
		 botonComoFun.setBackground(Color.WHITE);
		 panel.setLayout(new GridLayout(4 , 1));
		 panel.add(botonInicioS);
		 panel.add(botonRegis);
		 panel.add(botonComoFun);
		 panel.add(botonConfi);
		 botonConfi.addActionListener(listener);
		 botonInicioS.addActionListener(listener);
		 botonRegis.addActionListener(listener);
		 botonComoFun.addActionListener(listener);
		 botonConfi.addActionListener(listener);
		 this.setVisible(true);
		
		 this.add(panel);

	}
	

	public void abrirFrameHombre() {
		this.setVisible(false);
		frhom.setVisible(true);
	}
	
	public void abrirFrameRegistro() {
		this.setVisible(false);
		frreg.setVisible(true);
	}
	public void abrirFrameConfig() {
		this.setVisible(false);
		frconfig.setVisible(true);
	}
	public JPanel getPanel() {
		return panel;
	}
	public JButton getBotonInicioS() {
		return botonInicioS;
	}
	public JButton getBotonRegis() {
		return botonRegis;
	}
	public JButton getBotonComoFun() {
		return botonComoFun;
	}
	public JButton getBotonConfi() {
		return botonConfi;
	}
	public FrameBostinder getFrbos() {
		return frbos;
	}
	public FrameHombre getFrhom() {
		return frhom;
	}
	public FrameConfiguracion getFrconfig() {
		return frconfig;
	}
	public FrameRegistro getFrreg() {
		return frreg;
	}
	
}
