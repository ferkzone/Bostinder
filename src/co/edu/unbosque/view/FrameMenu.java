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

	public FrameMenu(ActionListener listener) {
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
}
