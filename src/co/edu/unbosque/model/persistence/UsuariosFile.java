package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.HombreDTO;
import co.edu.unbosque.model.MujerDTO;

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
	public void writeCSV(ArrayList<HombreDTO> a) {
		File f = new File("src/co/edu/unbosque/model/persistence/datos.csv");
		try(FileWriter fw = new FileWriter(f)){
			fw.write(a.get(a.size()-1).getNombre()+";"+a.get(a.size()-1).getApellido()+";"+a.get(a.size()-1).getGenero()
					+a.get(a.size()-1).getAlias()+a.get(a.size()-1).getContraseña()+a.get(a.size()-1).getCorreo()
					+a.get(a.size()-1).getNacimiento()+a.get(a.size()-1).getDivorcio()+a.get(a.size()-1).getNlikes())
					;
		}catch (Exception e){
			e.printStackTrace();
	}
}	
	public void writeCSVM(ArrayList<MujerDTO> a) {
		File f = new File("src/co/edu/unbosque/model/persistence/datos.csv");
		try(FileWriter fw = new FileWriter(f)){
			fw.write(a.get(a.size()-1).getNombre()+";"+a.get(a.size()-1).getApellido()+";"+a.get(a.size()-1).getGenero()
					+a.get(a.size()-1).getAlias()+a.get(a.size()-1).getContraseña()+a.get(a.size()-1).getCorreo()
					+a.get(a.size()-1).getNacimiento()+a.get(a.size()-1).getDivorcio()+a.get(a.size()-1).getNlikes())
					;
		}catch (Exception e){
			e.printStackTrace();
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
