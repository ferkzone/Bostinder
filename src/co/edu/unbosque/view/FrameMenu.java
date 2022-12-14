package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import co.edu.unbosque.model.EdadInvalidaException;
import co.edu.unbosque.model.persistence.FileHandler;

public class FrameMenu extends JFrame {

	private JPanel panel;
	private JButton botonInicioS, botonRegis, botonComoFun, botonConfi;
	private FrameBostinder frbos;
	private FrameGenero frg;
	private FrameHombre frhom;
	private FrameMujer frmuj;
	private FrameConfiguracion frconfig;
	private FrameRegistro frreg;
	private FrameTutorial frtut;

	public FrameMenu(ActionListener listener) {
		frhom = new FrameHombre(listener);
		frmuj = new FrameMujer(listener);
		frbos = new FrameBostinder(listener,"");
		frconfig = new FrameConfiguracion(listener);
		frreg = new FrameRegistro(listener);
		frtut = new FrameTutorial(listener);
		frg = new FrameGenero(listener);
		
		panel = new JPanel();
		FileHandler.loadProperties(1);
		botonInicioS = new JButton(FileHandler.getProperties().getProperty("persistence.FrameMenu.botonInicioS"));
		botonRegis = new JButton(FileHandler.getProperties().getProperty("persistence.FrameMenu.botonRegis"));
		botonComoFun = new JButton(FileHandler.getProperties().getProperty("persistence.FrameMenu.botonComoFun"));
		 botonConfi = new JButton(FileHandler.getProperties().getProperty("persistence.FrameMenu.botonConfi"));
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
	public int obtenerA??os(String fecha) throws EdadInvalidaException {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fecha, fmt);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		int a??os = periodo.getYears();
		if(a??os < 18) {
			throw new EdadInvalidaException();
		}else {
			return a??os;
		}	
	}
	
	public void mostrarMensaje(String pMen) {
		JOptionPane.showMessageDialog(null, pMen);
	}
	

	public FrameGenero getFrg() {
		return frg;
	}


	public void setFrg(FrameGenero frg) {
		this.frg = frg;
	}
	public void abrirFramesGeneros() {
		String opcion = frg.getGeneroLista().getSelectedItem().toString();
		if(opcion.equals("Hombre")) {
			abrirFrameHombre();
		}else if(opcion.equals("Mujer")) {
			abrirFrameMujer();
		}
	}


	public FrameMujer getFrmuj() {
		return frmuj;
	}


	public void abrirFrameHombre() {
		frg.setVisible(false);
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
	public void abrirFrameTut() {
		this.setVisible(false);
		frtut.setVisible(true);
	}
	public void abrirFrameGen() {
		this.setVisible(false);
		frg.setVisible(true);
	}
	public void abrirFrameMujer() {
		frg.setVisible(false);
		frmuj.setVisible(true);
	}
	public FrameTutorial getFrtut() {
		return frtut;
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
