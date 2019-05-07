package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Senten {

	private static String sentenciaSQL = "Select nombre,precio from hotel where ubicacion='";
	private static String sentenciaSQLEnd = "'";

	private static String COL_NAME_NOMBRE = "nombre";
	private static String COL_NAME_PRECIO = "precio";
	private Statement stmt = null;

	public ArrayList<Hotel> getHoteles(String ubicacion) {
		ArrayList<Hotel> ret = new ArrayList<Hotel>();
		
		try {
			
			ret = getHotelesFromBBDD(ubicacion);
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	private ArrayList<Hotel> getHotelesFromBBDD(String ubicacion) throws SQLException {

		ArrayList<Hotel> ret = new ArrayList<Hotel>();

		ConsultasBBDD mysql = new ConsultasBBDD();
		Connection cn = mysql.conectarmySQL();
		ResultSet rs = null;
		

		stmt = cn.createStatement();
		rs = stmt.executeQuery(sentenciaSQL + ubicacion + sentenciaSQLEnd);
		while (rs.next()) {
			String nombre = rs.getString(COL_NAME_NOMBRE);
			double precio = rs.getDouble(COL_NAME_PRECIO);

			Hotel h = new Hotel(nombre, precio);
			ret.add(h);
		}

		stmt.close();
		return ret;
	}
	
}