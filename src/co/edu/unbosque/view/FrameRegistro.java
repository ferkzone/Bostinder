package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import co.edu.unbosque.model.persistence.FileHandler;

public class FrameRegistro extends JFrame {
	private JPanel panel, botones, txt, txi1, txi2;
	private JButton volver, aceptar;
	private JTextField j1, j2;

	public FrameRegistro(ActionListener listener, FileHandler handler) {
		panel = new JPanel();
		FileHandler.loadProperties(1);
		volver = new JButton(handler.getProperties().getProperty("persistence.FrameRegistro.vol"));
		aceptar = new JButton(handler.getProperties().getProperty("persistence.FrameRegistro.acep"));
		volver.addActionListener(listener);
		aceptar.addActionListener(listener);
		j1 = new JTextField();
		j2 = new JTextField();
		botones = new JPanel();
		txt = new JPanel();
		txi1 = new JPanel();
		txi2 = new JPanel();
		botones.setLayout(new GridLayout(1, 2));
		volver.addActionListener(listener);
		volver.setBackground(Color.WHITE);
		volver.setBorder(new MatteBorder(3, 3, 3, 0, Color.BLACK));
		aceptar.addActionListener(listener);
		aceptar.setBackground(Color.WHITE);
		aceptar.setBorder(new MatteBorder(3, 3, 3, 3, Color.BLACK));
		botones.add(volver);
		botones.add(aceptar);

		txt.setLayout(new GridLayout(2, 1));
		txi1.setLayout(new BorderLayout());
		txi2.setLayout(new BorderLayout());
		txi1.add(j1, BorderLayout.CENTER);
		txi2.add(j2, BorderLayout.CENTER);
		j1.setBorder(new TitledBorder(handler.getProperties().getProperty("persistence.FrameRegistro.j1")));
		j2.setBorder(new TitledBorder(handler.getProperties().getProperty("persistence.FrameRegistro.j2")));
		txt.add(txi1);
		txt.add(txi2);
		panel.setLayout(new BorderLayout());
		panel.add(botones, BorderLayout.SOUTH);
		panel.add(txt, BorderLayout.CENTER);
		this.setSize(500, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(0);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
	}

	public JPanel getPanel() {
		return panel;
	}

	public JPanel getBotones() {
		return botones;
	}

	public JPanel getTxt() {
		return txt;
	}

	public JPanel getTxi1() {
		return txi1;
	}

	public JPanel getTxi2() {
		return txi2;
	}

	public JButton getVolver() {
		return volver;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public JTextField getJ1() {
		return j1;
	}

	public JTextField getJ2() {
		return j2;
	}
}
