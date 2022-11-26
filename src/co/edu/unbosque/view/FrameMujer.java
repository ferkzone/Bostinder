package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import co.edu.unbosque.model.persistence.FileHandler;

public class FrameMujer extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel nombreLabel;
	private JLabel usuarioLabel;
	private JLabel fechaLabel;
	private JLabel estaturaLabel;
	private JLabel divorciosLabel;
	private JLabel correoLabel;
	
	private JTextField correoTxt;
	private JTextField nombreTxt;
	private JTextField usuarioTxt;
	private JTextField fechaTxt;
	private JTextField estaturaTxt;

	private JButton buttContinuar;
	
	private String[] opcionDivorcios;
	private JComboBox divorciosLista;
	
	public FrameMujer(ActionListener listener, FileHandler handler) {
		setLayout(null);
		setSize(480,300);
		FileHandler.loadProperties(1);
		nombreLabel = new JLabel("       Nombre");
		nombreLabel.setBounds(1, 10, 150, 25);
		usuarioLabel = new JLabel("       Usuario");
		usuarioLabel.setBounds(1, 40, 150, 25);
		fechaLabel = new JLabel("       Fecha de nacimiento");
		fechaLabel.setBounds(1, 70, 150, 25);
		correoLabel = new JLabel("       Correo");
		correoLabel.setBounds(1, 100, 150, 25);
		estaturaLabel = new JLabel("       Estatura");
		estaturaLabel.setBounds(1, 130, 150, 25);
		divorciosLabel = new JLabel("       Divorcios");
		divorciosLabel.setBounds(1, 160, 150, 25);
		
		nombreTxt = new JTextField("");
		nombreTxt.setForeground(Color.BLACK);
		nombreTxt.setBackground(Color.WHITE);
		nombreTxt.setBounds(280, 10, 150, 25);
		
		usuarioTxt = new JTextField("");
		usuarioTxt.setForeground(Color.BLACK);
		usuarioTxt.setBackground(Color.WHITE);
		usuarioTxt.setBounds(280, 40, 150, 25);
		
		fechaTxt = new JTextField("");
		fechaTxt.setForeground(Color.BLACK);
		fechaTxt.setBackground(Color.WHITE);
		fechaTxt.setBounds(280, 70, 150, 25);
		
		correoTxt = new JTextField("");
		correoTxt.setForeground(Color.BLACK);
		correoTxt.setBackground(Color.WHITE);
		correoTxt.setBounds(280, 130, 150, 25);
		
		estaturaTxt = new JTextField("");
		estaturaTxt.setForeground(Color.BLACK);
		estaturaTxt.setBackground(Color.WHITE);
		estaturaTxt.setBounds(280, 160, 150, 25);
		
		buttContinuar = new JButton(handler.getProperties().getProperty("persistence.FrameMujer.buttContinuar"));
		buttContinuar.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		buttContinuar.setBackground(Color.WHITE);
		buttContinuar.setBounds(180, 200, 100, 30);
		buttContinuar.addActionListener(listener);
		
		opcionDivorcios = new String[2];
		opcionDivorcios[0] = "Si";
		opcionDivorcios[1] = "No";
		
		divorciosLista = new JComboBox(opcionDivorcios);
		divorciosLista.setForeground(Color.BLACK);
		divorciosLista.setBackground(Color.WHITE);
		divorciosLista.setBounds(280, 160, 150, 25);
		
		add(nombreLabel);
		add(nombreTxt);
		add(nombreTxt);
		add(usuarioLabel);
		add(usuarioTxt);
		add(usuarioTxt);
		add(fechaLabel);
		add(fechaTxt);
		add(fechaTxt);
		add(correoLabel);
		add(correoTxt);
		add(correoTxt);
		add(estaturaLabel);
		add(estaturaTxt);
		add(estaturaTxt);
		add(divorciosLabel);
		add(divorciosLista);
		add(divorciosLista);
		add(buttContinuar);

	}

	public JLabel getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(JLabel nombreLabel) {
		this.nombreLabel = nombreLabel;
	}

	public JLabel getUsuarioLabel() {
		return usuarioLabel;
	}

	public void setUsuarioLabel(JLabel usuarioLabel) {
		this.usuarioLabel = usuarioLabel;
	}

	public JLabel getFechaLabel() {
		return fechaLabel;
	}

	public void setFechaLabel(JLabel fechaLabel) {
		this.fechaLabel = fechaLabel;
	}

	public JLabel getEstaturaLabel() {
		return estaturaLabel;
	}

	public void setEstaturaLabel(JLabel estaturaLabel) {
		this.estaturaLabel = estaturaLabel;
	}

	public JLabel getDivorciosLabel() {
		return divorciosLabel;
	}

	public void setDivorciosLabel(JLabel divorciosLabel) {
		this.divorciosLabel = divorciosLabel;
	}

	public JLabel getCorreoLabel() {
		return correoLabel;
	}

	public void setCorreoLabel(JLabel correoLabel) {
		this.correoLabel = correoLabel;
	}

	public JTextField getCorreoTxt() {
		return correoTxt;
	}

	public void setCorreoTxt(JTextField correoTxt) {
		this.correoTxt = correoTxt;
	}

	public JTextField getNombreTxt() {
		return nombreTxt;
	}

	public void setNombreTxt(JTextField nombreTxt) {
		this.nombreTxt = nombreTxt;
	}

	public JTextField getUsuarioTxt() {
		return usuarioTxt;
	}

	public void setUsuarioTxt(JTextField usuarioTxt) {
		this.usuarioTxt = usuarioTxt;
	}

	public String[] getOpcionDivorcios() {
		return opcionDivorcios;
	}

	public void setOpcionDivorcios(String[] opcionDivorcios) {
		this.opcionDivorcios = opcionDivorcios;
	}

	public JComboBox getDivorciosLista() {
		return divorciosLista;
	}

	public void setDivorciosLista(JComboBox divorciosLista) {
		this.divorciosLista = divorciosLista;
	}

	public JTextField getFechaTxt() {
		return fechaTxt;
	}

	public void setFechaTxt(JTextField fechaTxt) {
		this.fechaTxt = fechaTxt;
	}

	public JTextField getEstaturaTxt() {
		return estaturaTxt;
	}

	public void setEstaturaTxt(JTextField estaturaTxt) {
		this.estaturaTxt = estaturaTxt;
	}

	public JButton getButtContinuar() {
		return buttContinuar;
	}

	public void setButtContinuar(JButton buttContinuar) {
		this.buttContinuar = buttContinuar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
