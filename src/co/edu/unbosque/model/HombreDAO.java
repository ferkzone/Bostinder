package co.edu.unbosque.model;

import java.util.ArrayList;

public class HombreDAO {
	private ArrayList<HombreDTO> hombres;
	
	public HombreDAO(){
		hombres = new ArrayList<HombreDTO>();
	}

	public void anadirHombres(String pNom,String pCor, int pEdad, double pEst, int pLikes,int pSal, String pAli) {	
		
		HombreDTO hombre = new HombreDTO(pNom, pEdad, pEst, pLikes, pCor, pSal, pAli);
		hombres.add(hombre);
	}
	
	
}
