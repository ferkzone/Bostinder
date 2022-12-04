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

	public static void leerArchivoH(ArrayList<HombreDTO> h){
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaHombres.csv"));
			while ((linea = lector.readLine()) != null ) {				
				 String datos[] = linea.split(";");
				 h.add(new HombreDTO (datos[1], 
					datos[2], 
					datos[3],
					datos[4], 				 
					datos[6],				 			
					Integer.parseInt(datos[11]), 
					Double.parseDouble(datos[10]),
					Integer.parseInt(datos[9]),	
					datos[7],
					Double.parseDouble(datos[12]),
					datos[8],
					datos[5]));
				 
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				lector.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public static void leerArchivoM(ArrayList<MujerDTO> m){
		boolean divorcio = false;
		try {
			lector = new BufferedReader(new FileReader("src/co/edu/unbosque/model/persistence/TablaMujeres.csv"));
			while ((linea = lector.readLine()) != null ) {
				String datos[] = linea.split(";");	
				if(datos[9].equals("SI")) {
					divorcio = true;
				}				
				 m.add(new MujerDTO((datos[1]), 
							datos[2], 
							datos[3],
							datos[4], 
							datos[6], 
							Integer.parseInt(datos[12]),
							Double.parseDouble(datos[11]),
							Integer.parseInt(datos[10]),
							divorcio, 
							datos[7], 
							datos[8], 
							datos[5]));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			lector.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
