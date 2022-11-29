package co.edu.unbosque.model;

import java.util.ArrayList;

public class HombreDAO {
	private ArrayList<HombreDTO> hombres;
	
	public HombreDAO(){
		hombres = new ArrayList<HombreDTO>();
	}
<<<<<<< HEAD
	public void añadirHombres(String pNom, int pEdad, double pEst, int pLikes, String pCor,int pSal, String pAli) throws DatosIncompletosException {	
		if(pNom == null ||pAli == null) {
=======
	public void aÃ±adirHombres(String pNom, String pApe, int pEdad, double pEst, int pLikes,int pSal, String pAli) throws DatosIncompletosException {	
		if(pNom == null || pApe==null||pAli == null) {
>>>>>>> branch 'master' of https://github.com/ferkzone/Bostinder
			throw new DatosIncompletosException();
		}
		HombreDTO hombre = new HombreDTO(pNom, pEdad, pEst, pLikes, pCor, pSal, pAli);
		hombres.add(hombre);
	}
}
