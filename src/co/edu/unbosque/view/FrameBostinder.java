package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.model.persistence.FileHandler;

public class FrameBostinder extends JFrame{
	private JButton likeBut;
	private JButton dislikeBut;
	private JButton perfadmBut;
	private JButton	topusersBut;
	private JButton cerrsesBut;
	private JLabel perfilLabel;
	
	public FrameBostinder(ActionListener listener, FileHandler handler, String perfil) {
		this.setLayout(null);
		this.setSize(800,550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		this.setTitle("Bostinder");
		handler.loadProperties(1);
		likeBut = new JButton(handler.getProperties().getProperty("persistence.FrameBostinder.likeBut"));
		dislikeBut = new JButton(handler.getProperties().getProperty("persistence.FrameBostinder.dislikeBut"));
		perfadmBut = new JButton(handler.getProperties().getProperty("persistence.FrameBostinder.perfadmBut"));
		topusersBut = new JButton(handler.getProperties().getProperty("persistence.FrameBostinder.topusersBut"));
		cerrsesBut= new JButton(handler.getProperties().getProperty("persistence.FrameBostinder.cerrsesBut"));
		perfilLabel = new JLabel(perfil);
		likeBut.setBounds(110, 400, 120, 80);
		dislikeBut.setBounds(290, 400, 120, 80);
		perfadmBut.setBounds(550,5,235,70);
		topusersBut.setBounds(550,90,235,70);
		cerrsesBut.setBounds(550,430,235,80);
		perfilLabel.setBounds(70, 50, 300, 200);
		likeBut.setFocusPainted(false);
		dislikeBut.setFocusPainted(false);
		topusersBut.setFocusPainted(false);
		cerrsesBut.setFocusPainted(false);
		perfadmBut.setFocusPainted(false);
		likeBut.addActionListener(listener);
		dislikeBut.addActionListener(listener);
		perfadmBut.addActionListener(listener);
		topusersBut.addActionListener(listener);
		cerrsesBut.addActionListener(listener);
		this.add(likeBut);
		this.add(dislikeBut);
		this.add(perfadmBut);
		this.add(topusersBut);
		this.add(cerrsesBut);	
		this.add(perfilLabel);
	}
}
