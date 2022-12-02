package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsuariosFile {

	private String linea;
	private BufferedReader lector;
	private String[] datos;
	
	

	public void leerArchivoH(){
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaHombres.csv"));
			while ((linea = lector.readLine()) != null ) {
				datos = linea.split(";");
				imprimirLinea();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void leerArchivoM(){
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaMujeres.csv"));
			while ((linea = lector.readLine()) != null ) {
				datos = linea.split(";");
				imprimirLinea();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}


	public void imprimirLinea(){
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
	}
	public String getLinea() {
		return linea;
	}
	public BufferedReader getLector() {
		return lector;
	}
	public String[] getDatos() {
		return datos;
	}
}
