package co.edu.unbosque.model;

import java.util.ArrayList;

public class MujerDAO {
	private ArrayList<MujerDTO> mujeres;
	
	
	public MujerDAO() {
		mujeres = new ArrayList<MujerDTO>();
	}
	
	public void añadirMujeres() {
		MujerDTO mujer = new MujerDTO(null, null, 0, 0, 0, false);
		mujeres.add(mujer);
		System.out.println(mujer.apellido);
	}
}
