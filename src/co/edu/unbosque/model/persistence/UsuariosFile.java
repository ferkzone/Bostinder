package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.HombreDTO;
import co.edu.unbosque.model.MujerDTO;

public class UsuariosFile {

	private static String linea;
	private static BufferedReader lector;
	private static String datos[];
	
	public UsuariosFile() {
		
	}

	public static void leerArchivoH(){
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaHombres.csv"));
			while ((linea = lector.readLine()) != null ) {				
				 String datos[] = linea.split(";");
				 linea = lector.readLine();
				 System.out.println(Arrays.toString(datos));
			}			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				lector.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public static void leerArchivoM(){
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaMujeres.csv"));
			while ((linea = lector.readLine()) != null ) {
				 String datos[] = linea.split(";");				 
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void writeCSV(ArrayList<HombreDTO> a) {
		File f = new File("src/co/edu/unbosque/model/persistence/datos.csv");
		try(FileWriter fw = new FileWriter(f)){
			fw.write(a.get(a.size()-1).getNombre()+";"+a.get(a.size()-1).getApellido1()+";"+a.get(a.size()-1).getApellido2()+";"+a.get(a.size()-1).getGenero()
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
			fw.write(a.get(a.size()-1).getNombre()+";"+a.get(a.size()-1).getApellido1()+";"+a.get(a.size()-1).getApellido2()+";"+a.get(a.size()-1).getGenero()
					+a.get(a.size()-1).getAlias()+a.get(a.size()-1).getContraseña()+a.get(a.size()-1).getCorreo()
					+a.get(a.size()-1).getNacimiento()+a.get(a.size()-1).getDivorcio()+a.get(a.size()-1).getNlikes())
					;
		}catch (Exception e){
			e.printStackTrace();
	}
}
	
	public String getLinea() {
		return linea;
	}
	public BufferedReader getLector() {
		return lector;
	}
	
}
