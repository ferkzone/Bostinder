package co.edu.unbosque.model;

import java.io.Serializable;

public class HombreDTO extends Usuario implements Serializable{
	private double salario;

	public HombreDTO(String pNom, int pEdad,double pEst, int pLikes, String pCor, double salario, String pAli) {
		super.nombre = pNom;

		super.edad = pEdad;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
		super.correo = pCor;

		
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	
	
	
}
