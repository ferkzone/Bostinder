package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JDateChooser;

import co.edu.unbosque.model.EdadInvalidaException;
import co.edu.unbosque.model.persistence.FileHandler;

public class FrameHombre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel labNombre, labUser, labFecha, labEstatura, labIngresos, labCorreo;
	private JTextField txtCorreo, txtNombre, txtUser, txtIngresos;
	private JDateChooser calendar;
	private JTextField txtEstatura;
	private JButton botonContinuar, botonVolver;

	public FrameHombre(ActionListener listener) {
		setLayout(null);
		setSize(480, 300);
		FileHandler.loadProperties(1);
		setLocationRelativeTo(null);
		calendar = new JDateChooser();
		labNombre = new JLabel("       Nombre");
		labNombre.setBounds(1, 10, 150, 25);
		labUser = new JLabel("       Usuario");
		labUser.setBounds(1, 40, 150, 25);
		labFecha = new JLabel("       Fecha de nacimiento");
		labFecha.setBounds(1, 70, 150, 25);
		labCorreo = new JLabel("       Correo");
		labCorreo.setBounds(1, 100, 150, 25);
		labEstatura = new JLabel("       Estatura");
		labEstatura.setBounds(1, 130, 150, 25);
		labIngresos = new JLabel("       Ingresos Mensuales");
		labIngresos.setBounds(1, 160, 150, 25);

		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBounds(280, 10, 150, 25);

		txtUser = new JTextField("");
		txtUser.setForeground(Color.BLACK);
		txtUser.setBackground(Color.WHITE);
		txtUser.setBounds(280, 40, 150, 25);

		calendar.setBounds(280, 70, 150, 25);
		calendar.setDateFormatString("dd/MM/yyyy");

		txtCorreo = new JTextField("");
		txtCorreo.setForeground(Color.BLACK);
		txtCorreo.setBackground(Color.WHITE);
		txtCorreo.setBounds(280, 100, 150, 25);

		txtIngresos = new JTextField("");
		txtIngresos.setForeground(Color.BLACK);
		txtIngresos.setBackground(Color.WHITE);
		txtIngresos.setBounds(280, 160, 150, 25);

		txtEstatura = new JTextField("");
		txtEstatura.setForeground(Color.BLACK);
		txtEstatura.setBackground(Color.WHITE);
		txtEstatura.setBounds(280, 130, 150, 25);

		botonContinuar = new JButton(FileHandler.getProperties().getProperty("persistence.FrameHombre.botonContinuar"));
		botonContinuar.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		botonContinuar.setBackground(Color.WHITE);
		botonContinuar.setBounds(300, 200, 100, 30);
		botonContinuar.addActionListener(listener);

		botonVolver = new JButton(FileHandler.getProperties().getProperty("persistence.FrameHombre.botonVolver"));
		botonVolver.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		botonVolver.setBackground(Color.WHITE);
		botonVolver.setBounds(100, 200, 100, 30);
		botonVolver.addActionListener(listener);

		add(labNombre);
		add(txtNombre);
		add(txtNombre);
		add(labUser);
		add(txtUser);
		add(txtUser);
		add(labFecha);
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
		add(calendar);
		add(botonVolver);
	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
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

	public JDateChooser getCalendar() {
		return calendar;
	}

	public void setCalendar(JDateChooser calendar) {
		this.calendar = calendar;
	}

}
