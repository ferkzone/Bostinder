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
	private JButton boton, boton1;

	public FrameGenero(ActionListener listener, FileHandler handler) {
		setLayout(null);
		setResizable(false);
		setSize(450, 200);
		setLocationRelativeTo(null);
		handler.loadProperties(1);

		txtLabel = new JLabel("      Selecciona tú genero: ");
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
		boton.setBounds(250, 115, 100, 30);
		boton.addActionListener(listener);

		boton1 = new JButton(handler.getProperties().getProperty("persistence.FrameGenero.boton1"));
		boton1.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		boton1.setBackground(Color.WHITE);
		boton1.setBounds(100, 115, 100, 30);
		boton1.addActionListener(listener);

		add(txtLabel);
		add(generoLista);
		add(generoLista);
		add(boton);
		add(boton1);
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

	public JButton getBoton1() {
		return boton1;
	}

	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
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
