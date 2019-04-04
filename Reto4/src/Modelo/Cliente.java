package Modelo;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;
	private String sexo;
	private String contraseña;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Cliente(String dni, String nombre, String apellido, int telefono, String sexo, String contraseña) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.sexo = sexo;
		this.dni = dni;
		this.contraseña = contraseña;
	}
	
	public Cliente(String dni, String contraseña) {
		this.dni = dni;
		this.contraseña = contraseña;
	}
	public Cliente() {
	}
	@Override
	public String toString() {
		return "Cliente:"+ "\n Dni: "+ dni + "\n nombre: " + nombre + "\n apellido: " + apellido + "\n telefono: " + telefono + 
				"\n sexo: " + sexo + "\n contraseña: " + contraseña + 
				"\n -----------------------------";
	}
	
}
