package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.bind.DatatypeConverter;

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

	public String SacarNombreUsuario(String dni) {

		ResultSet rs;
		String nombre = null;

		String query;
		query = "Select nombre from usuario where Dni='" + dni + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				nombre = rs.getString("nombre");
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

	public int SacarId(String ubicacion) {

		ResultSet rs;
		int Id = 0;

		String query;
		query = "Select Id from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Id = rs.getInt("Id");
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
		return Id;

	}

	public Double CalcularPrecio(Double precio, String huespedes, String Nnoches) {

		Double preciofinal;
		preciofinal = precio * Integer.parseInt(huespedes) * Integer.parseInt(Nnoches);
		return preciofinal;

	}

	public int comprobarLog(String usuario, String pass) {
		ResultSet rs;
		int resultado = 0;

		String query;
		System.out.println(encripta(pass));
		query = "Select Dni,contrasenia from usuario where Dni='" + usuario + "' AND contrasenia='" + encripta(pass)
				+ "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				resultado = 1;
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
		return resultado;
	}

	public String encripta(String cadena) {
		String cadenaEncriptada = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(cadena.getBytes());
			cadenaEncriptada = DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return cadenaEncriptada;
	}

	public int insertarUsuario(Cliente A1) {
		int rs = 0;
		String sql = "INSERT INTO usuario(Dni,contrasenia,nombre,apellido,gmail,telefono) VALUES(?,?,?,?,?,?)";

		try {
			System.out.println("Entra en el prepared");
			ps = cn.prepareStatement(sql);

			// asignamos los atributos a la consulta
			ps.setString(1, A1.getDni());
			ps.setString(2, encripta(A1.getcontraseña()));
			ps.setString(3, A1.getNombre());
			ps.setString(4, A1.getApellido());
			ps.setString(5, A1.getgmail());
			ps.setInt(6, A1.gettelefono());

			rs = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert Erroneo");
		}
		return rs;
	}

	public int insertarReserva(Reserva v1) {
		int rs = 0;
		String sql = "INSERT INTO reserva(Id_reserva,Dni,Nombre,Ubicacion,Estrellas,Precio,Id) VALUES(?,?,?,?,?,?,?)";

		try {

			ps = cn.prepareStatement(sql);
			// asignamos los atributos a la consulta
			ps.setInt(1, v1.getId_reserva());
			ps.setString(2, v1.getDni());
			ps.setString(3, v1.getNombre());
			ps.setString(4, v1.getUbicacion());
			ps.setString(5, v1.getEstrellas());
			ps.setDouble(6, v1.getPrecio());
			ps.setInt(7, v1.getId());

			rs = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Insert Erroneo");
		}
		return rs;

	}
}