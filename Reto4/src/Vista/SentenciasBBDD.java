package Vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import Modelo.ConexionBBDD;
import Modelo.Hotel;

public class SentenciasBBDD {
	static PreparedStatement stmt = null;

	public static void visualizarCiudad() {
		ResultSet rs;
		ArrayList<Hotel> lista=new ArrayList<Hotel>();
		//DefaultTableModel modelo = new DefaultTableModel();
		String ubicacion = null;
		ubicacion = (String) TrivaGo.cmbCiudad.getSelectedItem();
		String query;
		query = "Select nombre,precio from hotel where ubicacion='" + ubicacion + "'";
		try {
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				double precio=rs.getDouble("precio");
				Hotel h=new Hotel(nombre,precio);
				lista.add(h);
			}
			
			
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
	//	return nombre;

	}
}
