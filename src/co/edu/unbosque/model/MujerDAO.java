package co.edu.unbosque.model;

import java.util.ArrayList;

public class MujerDAO {
	private ArrayList<MujerDTO> mujeres;
	
	
	public MujerDAO() {
		mujeres = new ArrayList<MujerDTO>();
	}

	public void añadirMujeres(String pNom, String pApe, int pEdad, double pEst, int pLikes,boolean pDiv, String pAli) throws DatosIncompletosException {			
		if(pNom == "" | pApe == "" | pAli == "") {
			throw new DatosIncompletosException();
		}
		MujerDTO mujer = new MujerDTO(pNom, pEdad, pEst, pLikes, pDiv, pAli);
		mujeres.add(mujer);
	}

	public ArrayList<MujerDTO> getMujeres() {
		return mujeres;
	}

	public void setMujeres(ArrayList<MujerDTO> mujeres) {
		this.mujeres = mujeres;
	}
}
