package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.model.persistence.FileHandler;

@SuppressWarnings("serial")
public class FrameConfiguracion extends JFrame {
	private JPanel panel, combo;
	private JComboBox<String> temas;
	private JComboBox<String> idioma;
	private JButton listo;

	public FrameConfiguracion(ActionListener listener) {
		panel = new JPanel();
		combo = new JPanel();
		FileHandler.loadProperties(1);
		temas = new JComboBox<String>();
		idioma = new JComboBox<String>();
		listo = new JButton(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.listo"));
		temas.setBorder(
				new TitledBorder(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.them")));
		idioma.setBorder(
				new TitledBorder(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.leng")));
		temas.addItem("Claro");
		temas.addItem("Oscuro");
		idioma.addItem(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.esp"));
		idioma.addItem(FileHandler.getProperties().getProperty("persitence.FrameConfiguracion.ing"));
		combo.setLayout(new GridLayout(1, 2));
		combo.add(temas);
		combo.add(idioma);
		listo.addActionListener(listener);
		listo.setBackground(Color.WHITE);
		listo.setBorder(new MatteBorder(3, 3, 3, 3, Color.BLACK));
		panel.setLayout(new BorderLayout());
		panel.add(listo, BorderLayout.SOUTH);
		panel.add(combo, BorderLayout.CENTER);
		this.setSize(500, 150);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(0);
		this.add(panel);

	}

}
