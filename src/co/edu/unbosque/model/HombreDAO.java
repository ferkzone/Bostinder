package co.edu.unbosque.model;

import java.util.ArrayList;

public class HombreDAO {
	private ArrayList<HombreDTO> hombres;
	
	public HombreDAO(){
		hombres = new ArrayList<HombreDTO>();
	}

	public void anadirHombres(String pNom,String pCor, int pEdad, double pEst, int pLikes,double pSal, String pAli) {	
		
		HombreDTO hombre = new HombreDTO(pNom, pEdad, pEst, pLikes, pCor, pSal, pAli);
		hombres.add(hombre);
	}
	public String listarHombres() {
		int i;
		String texto = "";
		for(i=0;i<hombres.size();i++) {
			texto+= 	   "Nombre: " + hombres.get(i).getNombre() +" "+ 
						   "Username: " + hombres.get(i).getAlias() + " "+
						   "Edad: " + hombres.get(i).getEdad()+" "+
						   "Estatura: " + hombres.get(i).getEstatura()+" "+
						   "Número de likes: " + hombres.get(i).getNlikes()+" "+
						   "Ingresos mensuales: " + hombres.get(i).getSalario();
		}
		return texto;
	}
	public void ordenarHombres() {
		int i,j;
		HombreDTO aux;
		for(i=0;i<hombres.size()-1;i++) {
			for(j=i+1;j<hombres.size();j++) {
				if(hombres.get(i).getNlikes()<hombres.get(j).getNlikes()) {
					aux = hombres.get(j);
					hombres.set(j, hombres.get(i));
					hombres.set(i, aux);
				}
			}
		}
	}

	public ArrayList<HombreDTO> getHombres() {
		return hombres;
	}	
	
	
}
