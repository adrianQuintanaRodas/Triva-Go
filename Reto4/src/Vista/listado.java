package Vista;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class listado extends JPanel {

	/**
	 * Create the panel.
	 */
	public listado() {
		setLayout(null);
		
		JLabel lblNombreAlojamiento = new JLabel("Nombre Alojamiento");
		lblNombreAlojamiento.setBounds(10, 11, 102, 14);
		add(lblNombreAlojamiento);
		
		JLabel lblNombre = new JLabel(".................");
		lblNombre.setBounds(10, 31, 46, 14);
		add(lblNombre);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(333, 22, 89, 23);
		add(btnPagar);

	}
}
