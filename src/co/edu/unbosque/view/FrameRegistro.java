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

public class FrameRegistro extends JFrame{

		private JPanel panel, botones, txt, txi1, txi2;
		private JButton volver, aceptar;
		private JTextField usuario, contra;
		private JLabel img1, img2;

		public FrameRegistro(ActionListener listener,FileHandler handler) {
			panel = new JPanel();
			FileHandler.loadProperties(1);
			volver = new JButton(handler.getProperties().getProperty("persistence.FrameRegistro.vol"));
			aceptar = new JButton(handler.getProperties().getProperty("persistence.FrameRegistro.acep"));
			img1 = new JLabel();
			img2 = new JLabel();
			usuario = new JTextField();
			contra= new JTextField();
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
			txi1.add(usuario, BorderLayout.CENTER);
			txi1.add(img1, BorderLayout.WEST);
			txi2.add(contra, BorderLayout.CENTER);
			txi2.add(img2, BorderLayout.WEST);
			usuario.setBorder(new TitledBorder(handler.getProperties().getProperty("persistence.FrameRegistro.usuario")));
			contra.setBorder(new TitledBorder(handler.getProperties().getProperty("persistence.FrameRegistro.contra")));
			txt.add(txi1);
			txt.add(txi2);
			panel.setLayout(new BorderLayout());
			panel.add(botones, BorderLayout.SOUTH);
			panel.add(txt, BorderLayout.CENTER);
			this.setSize(500, 200);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(0);
			this.add(panel);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	
		public String obtenerUsuario() {
			if(!usuario.getText().equals("")) {
				return usuario.getText();
			}
			else {
				return "Usuario";
			}
		}
	
		public String obtenerContraseña() {
			if(!contra.getText().equals("")) {
				return contra.getText();
			}
			else {
				return "Contraseña";
			}
		}
		
}	

