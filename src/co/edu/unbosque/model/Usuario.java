package co.edu.unbosque.model;

public abstract class Usuario {
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected int edad;
	protected String genero;
	protected String contraseña;
	protected double estatura;
	protected int nlikes;
	protected String alias;
	protected String correo;
	protected String divorcio;
	protected String nacimiento;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDivorcio() {
		return divorcio;
	}
	public void setDivorcio(String divorcio) {
		this.divorcio = divorcio;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getContraseña() {
		return contraseña;
	}
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	

	
}
