package co.edu.unbosque.model;

import java.io.Serializable;

public class MujerDTO extends Usuario implements Serializable{
	private boolean divorcios;
	
	
	public MujerDTO(String pNom, String pCor, int pEdad, double pEst, int pLikes,boolean pDiv, String pAli) {
		super.nombre = pNom;
		super.edad = pEdad;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
		super.correo = pCor;
		this.divorcios = pDiv;
	}


	public boolean isDivorcios() {
		return divorcios;
	}


	public void setDivorcios(boolean divorcios) {
		this.divorcios = divorcios;
	}




	
}
