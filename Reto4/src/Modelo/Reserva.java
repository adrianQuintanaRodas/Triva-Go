package Modelo;

public class Reserva {
	private int Id_reserva;
	private String Dni;
	private Double Precio;
	private int id;
	private int Id_habitacion;
	private String fecha;

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

	public int getId_habitacion() {
		return Id_habitacion;
	}

	public void setId_habitacion(int id_habitacion) {
		Id_habitacion = id_habitacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String date) {
		this.fecha = date;
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

	public Reserva(int Id_reserva, String Dni, Double Precio, int id, String fecha, int Id_habitacion) {
		this.Id_reserva = Id_reserva;
		this.Dni = Dni;
		this.Id_habitacion = Id_habitacion;
		this.Precio = Precio;
		this.id = id;
		this.fecha = fecha;

	}

	public Reserva() {

	}
}