package co.edu.unbosque.model;

import java.io.Serializable;

public class HombreDTO extends Usuario implements Serializable{
	private int salario;

	public HombreDTO(String pNom, int pEdad,double pEst, int pLikes, String pCor, int salario, String pAli) {
		super.nombre = pNom;

		super.edad = pEdad;
		super.estatura = pEst;
		super.nlikes = pLikes;
		super.alias = pAli;
<<<<<<< HEAD
		super.correo = pCor;
=======
		
>>>>>>> branch 'master' of https://github.com/ferkzone/Bostinder
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	
	
	
}
