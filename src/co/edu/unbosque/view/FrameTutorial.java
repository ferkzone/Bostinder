package co.edu.unbosque.view;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.FileHandler;
@SuppressWarnings("serial")
public class FrameTutorial extends JFrame {
	private JPanel panel, botones;
	private JButton atras;

	public FrameTutorial(ActionListener listener, FileHandler handler) {
		panel = new JPanel();
		botones = new JPanel();
		handler.loadProperties(1);
		atras = new JButton(handler.getProperties().getProperty("persistence.FrameTutorial.atras"));
		botones.setLayout(new GridLayout(1, 3));
		botones.add(atras);
		atras.addActionListener(listener);
		botones.add(atras);
		atras.addActionListener(listener);
		panel.setLayout(new BorderLayout());
		panel.add(botones, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(panel);
	
	}




}