package co.edu.unbosque.view;

import java.awt.Color;


import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.model.persistence.FileHandler;
@SuppressWarnings("serial")
public class FrameHombre extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel labNombre;
	private JLabel labUser;
	private JLabel labFecha;
	private JLabel labEstatura;
	private JLabel labIngresos;
	private JLabel labCorreo;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtUser;
	private JTextField txtIngresos;
	private JTextField txtFecha;
	private JTextField txtEstatura;
	private JButton botonContinuar;
	
	public FrameHombre(ActionListener listener, FileHandler handler) {
		setLayout(null);
		setSize(480,300);
		FileHandler.loadProperties(1);
		labNombre = new JLabel("       Nombre");
		labNombre.setBounds(1, 10, 150, 25);
		labUser = new JLabel("       User");
		labUser.setBounds(1, 40, 150, 25);
		labFecha = new JLabel("       Fecha de nacimiento");
		labFecha.setBounds(1, 70, 150, 25);
		labEstatura = new JLabel("       Estatura");
		labEstatura.setBounds(1, 100, 150, 25);
		labIngresos = new JLabel("       Ingresos Mensuales");
		labIngresos.setBounds(1, 130, 150, 25);
		labCorreo = new JLabel("       Correo");
		labCorreo.setBounds(1, 160, 150, 25);
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBounds(280, 10, 150, 25);
		
		txtCorreo = new JTextField("");
		txtCorreo.setForeground(Color.BLACK);
		txtCorreo.setBackground(Color.WHITE);
		txtCorreo.setBounds(280, 40, 150, 25);
		
		txtUser = new JTextField("");
		txtUser.setForeground(Color.BLACK);
		txtUser.setBackground(Color.WHITE);
		txtUser.setBounds(280, 70, 150, 25);
		
		txtIngresos = new JTextField("");
		txtIngresos.setForeground(Color.BLACK);
		txtIngresos.setBackground(Color.WHITE);
		txtIngresos.setBounds(280, 100, 150, 25);
		
		txtFecha = new JTextField("");
		txtFecha.setForeground(Color.BLACK);
		txtFecha.setBackground(Color.WHITE);
		txtFecha.setBounds(280, 130, 150, 25);
		
		txtEstatura = new JTextField("");
		txtEstatura.setForeground(Color.BLACK);
		txtEstatura.setBackground(Color.WHITE);
		txtEstatura.setBounds(280, 160, 150, 25);
		
		botonContinuar= new JButton(handler.getProperties().getProperty("persistence.FrameHombre.botonContinuar"));
		botonContinuar.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		botonContinuar.setBackground(Color.WHITE);
		botonContinuar.setBounds(180, 200, 100, 30);
		botonContinuar.addActionListener(listener);

		add(labNombre);
		add(txtNombre);
		add(txtNombre);
		add(labUser);
		add(txtUser);
		add(txtUser);
		add(labFecha);
		add(txtFecha);
		add(txtFecha);
		add(labCorreo);
		add(txtCorreo);
		add(txtCorreo);
		add(labEstatura);
		add(txtEstatura);
		add(txtEstatura);
		add(labIngresos);
		add(txtIngresos);
		add(txtIngresos);
		add(botonContinuar);

	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JLabel getLabUser() {
		return labUser;
	}

	public void setLabUser(JLabel labUser) {
		this.labUser = labUser;
	}

	public JLabel getLabFecha() {
		return labFecha;
	}

	public void setLabFecha(JLabel labFecha) {
		this.labFecha = labFecha;
	}

	public JLabel getLabEstatura() {
		return labEstatura;
	}

	public void setLabEstatura(JLabel labEstatura) {
		this.labEstatura = labEstatura;
	}

	public JLabel getLabIngresos() {
		return labIngresos;
	}

	public void setLabIngresos(JLabel labIngresos) {
		this.labIngresos = labIngresos;
	}

	public JLabel getLabCorreo() {
		return labCorreo;
	}

	public void setLabCorreo(JLabel labCorreo) {
		this.labCorreo = labCorreo;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtIngresos() {
		return txtIngresos;
	}

	public void setTxtIngresos(JTextField txtIngresos) {
		this.txtIngresos = txtIngresos;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JTextField getTxtEstatura() {
		return txtEstatura;
	}

	public void setTxtEstatura(JTextField txtEstatura) {
		this.txtEstatura = txtEstatura;
	}

	public JButton getBotonContinuar() {
		return botonContinuar;
	}

	public void setBotonContinuar(JButton botonContinuar) {
		this.botonContinuar = botonContinuar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
