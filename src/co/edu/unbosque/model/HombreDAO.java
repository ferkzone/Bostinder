package co.edu.unbosque.model;

import java.util.ArrayList;

public class HombreDAO {
	private ArrayList<HombreDTO> hombres;
	
	public HombreDAO(){
		hombres = new ArrayList<HombreDTO>();
	}

	public void anadirHombres(String pNom, String pApel1,String pApel2, String genero, String pCon, int pEdad, double pEst, int pLikes, String pCor, double pSal, String pNac, String pAli) {	
		HombreDTO hombre = new HombreDTO(pNom, pApel1,pApel2, genero, pCon, pEdad, pEst, pLikes, pCor, pSal, pNac, pAli);
		hombres.add(hombre);
	}
	public String listarHombres() {
		int i;
		String texto = "";
		for(i=0;i<hombres.size();i++) {
			texto+= 	   "Nombre: " + hombres.get(i).getNombre() +" "+ 
						   "Primer apellido: " + hombres.get(i).getApellido1() +" "+ 
						   "Segundo apellido: " + hombres.get(i).getApellido2() + " "+
 						   "Genero: " + hombres.get(i).getGenero() +" "+ 
						   "Username: " + hombres.get(i).getAlias() + " "+
						   "Correo: " + hombres.get(i).getCorreo() + " "+
						   "Contraseña: " + hombres.get(i).getContraseña()+ " "+
						   "Edad: " + hombres.get(i).getEdad()+" "+
						   "Estatura: " + hombres.get(i).getEstatura()+" "+
						   "Numero de likes: " + hombres.get(i).getNlikes()+" "+
						   "Divorcios: " + hombres.get(i).getDivorcio() +" "+ 
						   "Ingresos mensuales: " + hombres.get(i).getSalario();
		}
		return texto;
	}
	public void ordenarHombres() {
		boolean swapped = true;
		 int start = 0;
	        int end = hombres.size();
	        while (swapped == true) {	       
	            swapped = false;	       
	            for (int i = start; i < end - 1; ++i) {
	                if (hombres.get(i).getNlikes() > hombres.get(i + 1).getNlikes()) {
	                    HombreDTO temp = hombres.get(i);
	                    hombres.set(i, hombres.get(i+1));
	                    hombres.set(i+1, temp);
	                    swapped = true;
	                }
	            }
	            if (swapped == false) {
	                break;
	            }
	            swapped = false;
	            end = end - 1;
	            for (int i = end - 1; i >= start; i--) {
	                if (hombres.get(i).getNlikes() > hombres.get(i+1).getNlikes()) {
	                    HombreDTO temp = hombres.get(i);
	                    hombres.set(i, hombres.get(i+1));
	                    hombres.set(i+1, temp);
	                    swapped = true;
	                }
	            }
	            start = start + 1;
	        }
	}

	

	public ArrayList<HombreDTO> getHombres() {
		return hombres;
	}

	public void setHombres(ArrayList<HombreDTO> hombres) {
		this.hombres = hombres;
	}	
	
	
}
