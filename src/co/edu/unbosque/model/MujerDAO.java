package co.edu.unbosque.model;

import java.util.ArrayList;

public class MujerDAO {
	private ArrayList<MujerDTO> mujeres;
	
	
	public MujerDAO() {
		mujeres = new ArrayList<MujerDTO>();
	}

	public void anadirMujeres(String pNom, String pApel1,String pApel2, String genero,String pCon, int pEdad, double pEst, int pLikes,boolean pDiv, String pCor, String pNac,  String pAli) {			
		MujerDTO mujer = new MujerDTO(pNom, 
				pApel1,pApel2,genero, pCon, pEdad, pEst, pLikes,pDiv,pCor,pNac,pAli);
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
					       "Primer apellido: " + mujeres.get(i).getApellido1() +" "+ 
					       "Segundo apellido: " + mujeres.get(i).getApellido2() + " "+
						   "Genero: " + mujeres.get(i).getGenero() +" "+ 
						   "Username: " + mujeres.get(i).getAlias() + " "+
						   "Correo: " + mujeres.get(i).getCorreo() + " "+
						   "Contraseña: " + mujeres.get(i).getContraseña()+ " "+
						   "Edad: " + mujeres.get(i).getEdad()+" "+
						   "Estatura: " + mujeres.get(i).getEstatura()+" "+
						   "NÃºmero de likes: " + mujeres.get(i).getNlikes()+" "+
						   "¿Divorciada?: " + divorciada + "\n";   
		}
		return texto;
	}
	public void ordenarMujeres() {
		int i,j;
		MujerDTO aux;
		for(i=0;i<mujeres.size()-1;i++) {
			for(j=i+1;j<mujeres.size();j++) {
				if(mujeres.get(i).getNlikes()<mujeres.get(j).getNlikes()) {
					aux = mujeres.get(j);
					mujeres.set(j, mujeres.get(i));
					mujeres.set(i, aux);
				}
			}
		}
	}
	

	public ArrayList<MujerDTO> getMujeres() {
		return mujeres;
	}

	public void setMujeres(ArrayList<MujerDTO> mujeres) {
		this.mujeres = mujeres;
	}
}
