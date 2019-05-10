package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.ConsultasBBDD;
import Modelo.Hotel;

public class SentenciasBBDD {
	static java.sql.Statement stmt = null;
	static java.sql.Connection cn;
	static ArrayList<Hotel> lista;

	public  ArrayList<Hotel> visualizarCiudad(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		lista = new ArrayList<Hotel>();

		String query;
		query = "Select Nombre,Precio from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombre = rs.getString("Nombre");
				double precio = rs.getDouble("Precio");

				Hotel h = new Hotel(nombre, precio);
				lista.add(h);
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return lista;

	}

	public String SacarNombre(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		String nombre = null;

		String query;
		query = "Select Nombre from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				nombre = rs.getString("Nombre");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return nombre;

	}

	public String SacarEstrellas(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		String estrellas = null;

		String query;
		query = "Select Estrellas from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				estrellas = rs.getString("Estrellas");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return estrellas;

	}

	public Double SacarPrecio(String ubicacion) {

		ConsultasBBDD mysql = new ConsultasBBDD();
		cn = mysql.conectarmySQL();
		ResultSet rs;
		Double precio = null;

		String query;
		query = "Select Precio from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				precio = rs.getDouble("Precio");
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return precio;

	}

	public Double CalcularPrecio(Double precio, String huespedes, String Nnoches) {

		Double preciofinal;
		System.out.println("----------------------------------------"+Integer.parseInt(huespedes));
		System.out.println(Integer.parseInt(Nnoches));
		preciofinal = precio * Integer.parseInt(huespedes) * Integer.parseInt(Nnoches);
		return preciofinal;

	}
	

}