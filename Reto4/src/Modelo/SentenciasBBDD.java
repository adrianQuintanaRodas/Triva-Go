package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modelo.ConsultasBBDD;
import Modelo.Hotel;

public class SentenciasBBDD {
	static java.sql.Statement stmt = null;

	static ArrayList<Hotel> lista;
	static ConsultasBBDD mysql = new ConsultasBBDD();
	static java.sql.Connection cn = mysql.conectarmySQL();
	static java.sql.PreparedStatement ps = null;

	public ArrayList<Hotel> visualizarCiudad(String ubicacion) {

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
		preciofinal = precio * Integer.parseInt(huespedes) * Integer.parseInt(Nnoches);
		return preciofinal;

	}

	public boolean comprobarLogin(String dni, String password) {

		ResultSet rs;
		boolean correcto = true;

		String query;
		query = "Select Dni,contrasenia from usuario";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String dniC = rs.getString("Dni");
				String passC = rs.getString("contrasenia");
				if (dniC.equals(dni) && passC.equals(password)) {
					correcto = true;
				} else {
					correcto = false;
				}
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
		return correcto;
	}

	public int insertarUsuario(Cliente A1) {
		int rs = 0;
		String sql = "INSERT INTO usuario(Dni,contrasenia,nombre,apellido,gmail,telefono) VALUES(?,?,?,?,?,?)";

		try {
			System.out.println("Entra en el prepared");
			ps = cn.prepareStatement(sql);

			// asignamos los atributos a la consulta
			ps.setString(1,   A1.getDni() );
			System.out.println(A1.getDni());
			ps.setString(2, A1.getcontraseña());
			System.out.println(A1.getcontraseña());
			ps.setString(3, A1.getNombre());
			ps.setString(4, A1.getApellido() );
			ps.setString(5,  A1.getgmail() );
			ps.setInt(6, A1.gettelefono());

			rs = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert Erroneo");
		}
		return rs;
	}

}