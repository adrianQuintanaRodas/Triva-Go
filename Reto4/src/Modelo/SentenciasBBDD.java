package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

import com.mysql.jdbc.PreparedStatement;

import Modelo.ConsultasBBDD;
import Modelo.Hotel;

public class SentenciasBBDD {
	static java.sql.Statement stmt = null;

	static ArrayList<Hotel> lista;

	static ConsultasBBDD mysql = new ConsultasBBDD();
	static java.sql.Connection cn = mysql.conectarmySQL();
	static java.sql.PreparedStatement ps = null;

	public void cogerUbicacion(JComboBox<String> ubicaciones) {
		ResultSet rs;
		String query;
		query = "Select distinct Ubicación from hotel";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombreUbi = rs.getString("Ubicación");
				ubicaciones.addItem(nombreUbi);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void cargarCmbTipoCamas(JComboBox<String> camas) {
		ResultSet rs;
		String query;
		query = "Select distinct Tipo_cama from tipohabitacion";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombreUbi = rs.getString("Tipo_cama");
				camas.addItem(nombreUbi);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int cogerIdTipocamas(String tipo) {
		ResultSet rs;
		String query;
		int idTipoHabitacion = 0;
		query = "Select Id_habitacion from tipohabitacion where Tipo_cama='" + tipo + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				idTipoHabitacion = rs.getInt("Id_habitacion");

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return idTipoHabitacion;

	}

	public ArrayList<Hotel> visualizarCiudad(String ubicacion) {

		ResultSet rs;
		lista = new ArrayList<Hotel>();

		String query;
		query = "Select Id,Nombre,Precio from hotel where Ubicación='" + ubicacion + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {

				int id = rs.getInt("Id");
				String nombre = rs.getString("Nombre");
				double precio = rs.getDouble("Precio");

				Hotel h = new Hotel(id, nombre, precio);
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

	public String SacarNombre(String id) {

		ResultSet rs;
		String nombre = null;

		String query;
		query = "Select Nombre from hotel where Id='" + id + "'";
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

	public String SacarEstrellas(String id) {

		ResultSet rs;
		String estrellas = null;

		String query;
		query = "Select Estrellas from hotel where Id='" + id + "'";
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

	public Double SacarPrecio(String id) {

		ResultSet rs;
		Double precio = null;

		String query;
		query = "Select Precio from hotel where Id='" + id + "'";
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

	public int sacarIdreserva(int id) {
		ResultSet rs;
		int Id = 0;

		String query;
		query = "Select Id_reserva from reserva where Id_reserva='" + id + "'";
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Id = rs.getInt("Id_reserva");
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

	public int insertarReserva(Reserva v1, int sacarID) {
		java.sql.PreparedStatement ps2 = null;
		Hotel h1 = sacarHotel(sacarID);
		int rs = 0;
		int rs2;
		if (h1.getCapacidad() == 0) {
			JOptionPane.showMessageDialog(null, "No se puede hacer reserva para este hotel");
			rs = 0;
		} else {

			String sql = "INSERT INTO reserva(Precio,Id,Dni,Id_habitacion,Fecha) VALUES(?,?,?,?,?)";
			String sqlQuitarCapacidad = " UPDATE hotel SET Capacidad=" + (h1.getCapacidad() - 1) + " WHERE id="
					+ h1.getId();

			try {

				ps2 = cn.prepareStatement(sqlQuitarCapacidad);
				ps = cn.prepareStatement(sql);
				// ps2.executeQuery();
				// asignamos los atributos a la consulta
				ps.setDouble(1, v1.getPrecio());
				ps.setInt(2, v1.getId());
				ps.setString(3, v1.getDni());
				ps.setInt(4, v1.getId_habitacion());
				ps.setString(5, v1.getFecha());

				rs = ps.executeUpdate();
				rs2 = ps2.executeUpdate();
			} catch (Exception e) {
				System.out.println("Insert Erroneo");
			}
		}
		return rs;

	}

	public ArrayList<Reserva> datosReserva(String dni) {
		String dniReserva;
		int idReserva, idAlojamiento, tipoCama;
		double precio;
		String fecha;
		ResultSet rs;
		String sql = "SELECT * FROM reserva where Dni='" + dni + "'";
		ArrayList<Reserva> r1Array = new ArrayList<Reserva>();
		Reserva v1;
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				idReserva = rs.getInt(1);
				precio = rs.getDouble(2);
				idAlojamiento = rs.getInt(3);
				dniReserva = rs.getString(4);
				tipoCama = rs.getInt(5);
				fecha = rs.getString(6);
				v1 = new Reserva(idReserva, dniReserva, precio, idAlojamiento, fecha, tipoCama);
				r1Array.add(v1);
			}

			stmt.close();
		} catch (Exception e) {
			e.getMessage();
		}
		return r1Array;

	}

	public Hotel sacarHotel(int idHotel) {
		ResultSet rs;
		int id = 0, capacidad = 0;
		Hotel h1 = null;
		String query;
		query = "Select Id, Capacidad from hotel where Id=" + idHotel;
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				id = rs.getInt("Id");

				capacidad = rs.getInt("Capacidad");

				h1 = new Hotel(id, capacidad);

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
		return h1;

	}

}