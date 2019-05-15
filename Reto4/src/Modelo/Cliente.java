package Modelo;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;
	private String gmail;
	private String contrase�a;

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getgmail() {
		return gmail;
	}

	public String getcontrase�a() {
		return contrase�a;
	}

	public int gettelefono() {
		return telefono;
	}

	// SETTER
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setgmail(String gmail) {
		this.gmail = gmail;
	}

	public void setcontrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cliente(String dni, String nombre, String apellido, int telefono, String gmail, String contrase�a) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.gmail = gmail;
		this.contrase�a = contrase�a;
	}

	public Cliente(String dni, String contrase�a) {
		this.dni = dni;
		this.contrase�a = contrase�a;
	}

	public Cliente() {
	}

	@Override
	public String toString() {
		return "Cliente:" + "\n Dni: " + dni + "\n nombre: " + nombre + "\n apellido: " + apellido + "\n telefono: "
				+ telefono + "\n sexo: " + gmail + "\n contrase�a: " + contrase�a + "\n -----------------------------";
	}

}