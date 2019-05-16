package Modelo;

public class Reserva {
	private int Id_reserva;
	private String Dni;
	private String Nombre;
	private String ubicacion;
	private String Estrellas;
	private Double Precio;
	private int id;

	public int getId_reserva() {
		return Id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		Id_reserva = id_reserva;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getEstrellas() {
		return Estrellas;
	}

	public void setEstrellas(String estrellas) {
		Estrellas = estrellas;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Reserva(int Id_reserva, String Dni, String Nombre, String ubicacion, String Estrellas, Double Precio,
			int id) {
		this.Id_reserva = Id_reserva;
		this.Dni = Dni;
		this.Nombre = Nombre;
		this.ubicacion = ubicacion;
		this.Estrellas = Estrellas;
		this.Precio = Precio;
		this.id = id;

	}

	public Reserva() {

	}
}
