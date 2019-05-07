package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelRegistro extends JPanel {
	/**
	 * 
	 */

	private JTextField tFNombreRegistro;
	private JTextField tfDNIRegistro;
	private JPasswordField pFContrasenaRegistro;
	private JPasswordField pFRegistroContrasena;
	private JButton btnSalir, btnLoginAceptar;

	/**
	 * Create the panel.
	 */
	public PanelRegistro() {
		setLayout(null);
		setBounds(100, 100, 395, 355);
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(66, 120, 44, 14);
		add(lblNewLabel);

		tFNombreRegistro = new JTextField();
		tFNombreRegistro.setBounds(195, 117, 86, 20);
		add(tFNombreRegistro);
		tFNombreRegistro.setColumns(10);

		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(83, 71, 31, 14);
		add(lblDni);

		tfDNIRegistro = new JTextField();
		tfDNIRegistro.setColumns(10);
		tfDNIRegistro.setBounds(195, 68, 86, 20);
		add(tfDNIRegistro);

		JLabel lblContrasea = new JLabel("Contraseña: ");
		lblContrasea.setBounds(53, 166, 86, 14);
		add(lblContrasea);

		pFContrasenaRegistro = new JPasswordField();
		pFContrasenaRegistro.setBounds(195, 163, 86, 20);
		add(pFContrasenaRegistro);

		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña: ");
		lblRepetirContrasea.setBounds(20, 217, 119, 14);
		add(lblRepetirContrasea);

		pFRegistroContrasena = new JPasswordField();
		pFRegistroContrasena.setBounds(195, 214, 86, 20);
		add(pFRegistroContrasena);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(20, 284, 89, 23);
		add(btnSalir);

		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(246, 284, 89, 23);
		add(btnLoginAceptar);

	}

	public JTextField gettFNombreRegistro() {
		return tFNombreRegistro;
	}

	public void settFNombreRegistro(JTextField tFNombreRegistro) {
		this.tFNombreRegistro = tFNombreRegistro;
	}

	public JTextField getTfDNIRegistro() {
		return tfDNIRegistro;
	}

	public void setTfDNIRegistro(JTextField tfDNIRegistro) {
		this.tfDNIRegistro = tfDNIRegistro;
	}

	public JPasswordField getpFContrasenaRegistro() {
		return pFContrasenaRegistro;
	}

	public void setpFContrasenaRegistro(JPasswordField pFContrasenaRegistro) {
		this.pFContrasenaRegistro = pFContrasenaRegistro;
	}

	public JPasswordField getpFRegistroContrasena() {
		return pFRegistroContrasena;
	}

	public void setpFRegistroContrasena(JPasswordField pFRegistroContrasena) {
		this.pFRegistroContrasena = pFRegistroContrasena;
	}

	public JButton getbtnSalir() {
		return btnSalir;
	}

	public void setbtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getbtnLoginAceptar() {
		return btnLoginAceptar;
	}

	public void setgetbtnLoginAceptar(JButton btnLoginAceptar) {
		this.btnLoginAceptar = btnLoginAceptar;
	}

}