package co.edu.unbosque.model;

import java.io.Serializable;

public class MujerDTO extends Usuario implements Serializable{
	private boolean divorcios;
	
	
	public MujerDTO(String pNom, 
			String pApel1,
			String pApel2,
			String genero, 
			String pCon, 
			int pEdad,
			double pEst, 
			int pLikes, 
			boolean pDiv, 
			String pCor, 
			String pNac,
			String pAli) {
		
		super.nombre = pNom;
		super.apellido1 = pApel1;
		super.apellido2 = pApel2;
		super.edad = pEdad;
		super.genero = genero;
		super.contraseña = pCon;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
		super.correo = pCor;
		this.divorcios = pDiv;
		super.nacimiento = pNac;
	}


	public boolean isDivorcios() {
		return divorcios;
	}


	public void setDivorcios(boolean divorcios) {
		this.divorcios = divorcios;
	}


	
}
