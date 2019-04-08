package Modelo;

public class Hotel {
	private int id;
	private String nombre;
	private String ubicacion;
	private double precio;
	public Hotel(int id, String nombre, String ubicacion, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.precio = precio;
	}
	
	public Hotel( String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", precio=" + precio + "]";
	}
	

}
