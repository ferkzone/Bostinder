package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

import co.edu.unbosque.model.persistence.FileHandler;

public class FrameGenero extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel txtLabel;
	private String[] opcionGenero;
	private JComboBox generoLista;
	
	private JButton boton;
	
	public FrameGenero(ActionListener listener, FileHandler handler) {
		setLayout(null);
		setResizable(false);
		setSize(450,200);
		FileHandler.loadProperties(1);
		
		txtLabel = new JLabel("       Selecciona tú genero: ");
		txtLabel.setBounds(40, 50, 150, 25);
		
		opcionGenero = new String[2];
		opcionGenero[0] = "Hombre";
		opcionGenero[1] = "Mujer";
		
		generoLista = new JComboBox(opcionGenero);
		generoLista.setForeground(Color.BLACK);
		generoLista.setBackground(Color.WHITE);
		generoLista.setBounds(200, 50, 150, 25);
		
		boton = new JButton(handler.getProperties().getProperty("persistence.FrameGenero.boton"));
		boton.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		boton.setBackground(Color.WHITE);
		boton.setBounds(160, 115, 100, 30);
		boton.addActionListener(listener);
		
		add(txtLabel);
		add(generoLista);
		add(generoLista);
		add(boton);

	}

	public JLabel getTxtLabel() {
		return txtLabel;
	}



	public void setTxtLabel(JLabel txtLabel) {
		this.txtLabel = txtLabel;
	}



	public String[] getOpcionGenero() {
		return opcionGenero;
	}



	public void setOpcionGenero(String[] opcionGenero) {
		this.opcionGenero = opcionGenero;
	}



	public JComboBox getGeneroLista() {
		return generoLista;
	}



	public void setGeneroLista(JComboBox generoLista) {
		this.generoLista = generoLista;
	}



	public JButton getBoton() {
		return boton;
	}



	public void setBoton(JButton boton) {
		this.boton = boton;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
