package co.edu.unbosque.model;

import java.util.ArrayList;

public class HombreDAO {
	private ArrayList<HombreDTO> hombres;
	
	public HombreDAO(){
		hombres = new ArrayList<HombreDTO>();
	}

	public void aadirHombres(String pNom, String pApe, int pEdad, double pEst, int pLikes,int pSal, String pAli) throws DatosIncompletosException {	
		if(pNom == null || pApe==null||pAli == null) {
			throw new DatosIncompletosException();
		}
		HombreDTO hombre = new HombreDTO(pNom, pEdad, pEst, pLikes, pAli, pSal, pAli);
		hombres.add(hombre);
	}
}
