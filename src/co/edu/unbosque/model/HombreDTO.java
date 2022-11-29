package co.edu.unbosque.model;

import java.io.Serializable;

public class HombreDTO extends Usuario implements Serializable{
	private int salario;

	public HombreDTO(String pNom, String pApe, int pEdad,double pEst, int pLikes, int salario, String pAli) {
		super.nombre = pNom;
		super.apellido = pApe;
		super.edad = pEdad;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
		
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	
	
	
}
