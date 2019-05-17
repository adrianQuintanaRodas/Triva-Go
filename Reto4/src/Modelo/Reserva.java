package Modelo;

public class Reserva {
	private int Id_reserva;
	private String Dni;
	private String Nombre;
	private String ubicacion;
	private String Estrellas;
	private Double Precio;
	private int id;
	private String tipo_cama;
	private int Noches;

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
	

	public String getTipo_cama() {
		return tipo_cama;
	}

	public void setTipo_cama(String tipo_cama) {
		this.tipo_cama = tipo_cama;
	}

	public int getNoches() {
		return Noches;
	}

	public void setNoches(int noches) {
		Noches = noches;
	}

	public Reserva(int Id_reserva, String Dni, String Nombre, String ubicacion, String Estrellas, Double Precio,
			int id, String tipo_cama, int noches) {
		this.Id_reserva = Id_reserva;
		this.Dni = Dni;
		this.Nombre = Nombre;
		this.ubicacion = ubicacion;
		this.Estrellas = Estrellas;
		this.Precio = Precio;
		this.id = id;
		this.tipo_cama = tipo_cama;
		this.Noches = noches;

	}

	public Reserva() {

	}
}