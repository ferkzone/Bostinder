package co.edu.unbosque.model;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class SonidoDAO {

		JFileChooser chooser;
		FileNameExtensionFilter filter;
		SonidoDTO sound;
	
		public SonidoDAO() {
			sound = new SonidoDTO();
		}
		
		public void click() {
			sound.reproducir("/Bostinder/src/co/edu/unbosque/util/sounds/juan.wav");
		}
	
	
}
