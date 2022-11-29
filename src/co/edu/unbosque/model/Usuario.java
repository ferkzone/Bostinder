package co.edu.unbosque.model;

public abstract class Usuario {
	protected String nombre;
	protected int edad;
	protected double estatura;
	protected int nlikes;
	protected String alias;
	protected String correo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getNlikes() {
		return nlikes;
	}
	public void setNlikes(int nlikes) {
		this.nlikes = nlikes;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

	
}
