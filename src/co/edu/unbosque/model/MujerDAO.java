package co.edu.unbosque.model;

import java.util.ArrayList;

public class MujerDAO {
	private ArrayList<MujerDTO> mujeres;
	
	
	public MujerDAO() {
		mujeres = new ArrayList<MujerDTO>();
	}

	public void anadirMujeres(String pNom,String pCor,int pEdad, double pEst, int pLikes,boolean pDiv, String pAli) {			
		MujerDTO mujer = new MujerDTO(pNom,pCor,pEdad, pEst, pLikes, pDiv, pAli);
		mujeres.add(mujer);
	}
	public String listarMujeres() {
		int i;
		String texto = "";
		String divorciada = "";
		for(i=0;i<mujeres.size();i++) {
			if(mujeres.get(i).isDivorcios()==true) {
				 divorciada = "Si";
			}else {
				divorciada = "No";
			}
			texto+= 	   "Nombre: " + mujeres.get(i).getNombre() +" "+ 
						   "Username: " + mujeres.get(i).getAlias() + " "+
						   "Edad: " + mujeres.get(i).getEdad()+" "+
						   "Estatura: " + mujeres.get(i).getEstatura()+" "+
						   "Número de likes: " + mujeres.get(i).getNlikes()+" "+
						   "¿Divorciada?: " + divorciada + "\n" ;   
		}
		return texto;
	}

	public ArrayList<MujerDTO> getMujeres() {
		return mujeres;
	}

	public void setMujeres(ArrayList<MujerDTO> mujeres) {
		this.mujeres = mujeres;
	}
}
