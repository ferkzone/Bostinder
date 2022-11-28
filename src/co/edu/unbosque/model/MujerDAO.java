package co.edu.unbosque.model;

import java.util.ArrayList;

public class MujerDAO {
	private ArrayList<MujerDTO> mujeres;
	
	
	public MujerDAO() {
		mujeres = new ArrayList<MujerDTO>();
	}
	
	public void añadirMujeres(String pNom, String pApe, int pEdad, double pEst, int pLikes,boolean pDiv, String pAli) {		
		MujerDTO mujer = new MujerDTO(pNom, pApe, pEdad, pEst, pLikes, pDiv, pAli);
		mujeres.add(mujer);
	}
}
