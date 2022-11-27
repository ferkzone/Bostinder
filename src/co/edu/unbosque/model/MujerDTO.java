package co.edu.unbosque.model;

import java.io.Serializable;

public class MujerDTO extends Usuario implements Serializable{
	private boolean divorcios;
	
	
	public MujerDTO(String pNom, String pApe, int pEdad, double pEst, int pLikes,boolean pDiv) {
		super.nombre = pNom;
		super.apellido = pApe;
		super.edad = pEdad;
		super.estatura = pEst;
		super.nlikes = pLikes;
		this.divorcios = pDiv;
	}


	public boolean isDivorcios() {
		return divorcios;
	}


	public void setDivorcios(boolean divorcios) {
		this.divorcios = divorcios;
	}


	
}
