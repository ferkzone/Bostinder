package co.edu.unbosque.model;

import java.io.Serializable;

public class HombreDTO extends Usuario implements Serializable{
	private int salario;

	public HombreDTO(String pNom, String pApel1,String pApel2, String genero, String pCon, int pEdad,double pEst, int pLikes, String pCor, int pSal, String pNac, String pAli) {
		super.nombre = pNom;
		super.apellido1 = pApel1;
		super.apellido2 = pApel2;
		super.edad = pEdad;
		super.genero = "M";
		super.contraseña = pCon;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
		super.correo = pCor;
		super.divorcio = "No Aplica";
		super.nacimiento = pNac;
		this.salario = pSal;
	}
	public String toCSV() {
		return this.nombre+","+this.edad+this.estatura+this.correo;
	}
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
