package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PanelRegistro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tFNombreRegistro;
	private JTextField tfDNIRegistro;
	private JPasswordField pFContrasenaRegistro;
	private JPasswordField pFRegistroContrasena;
	private JButton btnSalir, btnLoginAceptar;
	private JTextField textField_Apellido;
	private JTextField textField_Gmail;
	private JTextField textField_Telefono;
	private JLabel lblGmail;
	private JLabel lblTelefono;
	private JLabel lblApellido;
	private JTextField txt_con1;
	private JTextField txt_con2;

	/**
	 * Create the panel.
	 */
	public PanelRegistro() {
		setLayout(null);
		setBounds(100, 100, 395, 355);
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(92, 127, 69, 14);
		add(lblNewLabel);

		tFNombreRegistro = new JTextField();
		tFNombreRegistro.setBounds(195, 124, 86, 20);
		add(tFNombreRegistro);
		tFNombreRegistro.setColumns(10);

		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(103, 40, 31, 14);
		add(lblDni);

		tfDNIRegistro = new JTextField();
		tfDNIRegistro.setColumns(10);
		tfDNIRegistro.setBounds(195, 37, 86, 20);
		add(tfDNIRegistro);

		JLabel lblContrasea = new JLabel("Contraseña: ");
		lblContrasea.setBounds(65, 71, 86, 14);
		add(lblContrasea);

		pFContrasenaRegistro = new JPasswordField();
		pFContrasenaRegistro.setBounds(195, 68, 86, 20);
		add(pFContrasenaRegistro);

		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña: ");
		lblRepetirContrasea.setBounds(35, 102, 150, 14);
		add(lblRepetirContrasea);

		pFRegistroContrasena = new JPasswordField();
		pFRegistroContrasena.setBounds(195, 98, 86, 20);
		add(pFRegistroContrasena);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(20, 284, 89, 23);
		add(btnSalir);

		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(246, 284, 89, 23);
		add(btnLoginAceptar);

		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(92, 158, 73, 14);
		add(lblApellido);

		textField_Apellido = new JTextField();
		textField_Apellido.setBounds(195, 155, 86, 20);
		add(textField_Apellido);
		textField_Apellido.setColumns(10);

		textField_Gmail = new JTextField();
		textField_Gmail.setBounds(195, 186, 86, 20);
		add(textField_Gmail);
		textField_Gmail.setColumns(10);

		textField_Telefono = new JTextField();
		textField_Telefono.setBounds(195, 217, 86, 20);
		add(textField_Telefono);
		textField_Telefono.setColumns(10);

		lblGmail = new JLabel("Gmail:");
		lblGmail.setBounds(105, 189, 46, 14);
		add(lblGmail);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(82, 220, 69, 14);
		add(lblTelefono);
		
		txt_con1 = new JTextField();
		txt_con1.setBounds(291, 68, 86, 20);
		add(txt_con1);
		txt_con1.setColumns(10);
		
		txt_con2 = new JTextField();
		txt_con2.setBounds(291, 99, 86, 20);
		add(txt_con2);
		txt_con2.setColumns(10);

	}

	public JTextField getTxt_con1() {
		return txt_con1;
	}

	public void setTxt_con1(JTextField txt_con1) {
		this.txt_con1 = txt_con1;
	}

	public JTextField getTxt_con2() {
		return txt_con2;
	}

	public void setTxt_con2(JTextField txt_con2) {
		this.txt_con2 = txt_con2;
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

	public JTextField getTextField_Apellido() {
		return textField_Apellido;
	}

	public void setTextField_Apellido(JTextField textField_Apellido) {
		this.textField_Apellido = textField_Apellido;
	}

	public JTextField getTextField_Gmail() {
		return textField_Gmail;
	}

	public void setTextField_Gmail(JTextField textField_Gmail) {
		this.textField_Gmail = textField_Gmail;
	}

	public JTextField getTextField_Telefono() {
		return textField_Telefono;
	}

	public void setTextField_Telefono(JTextField textField_Telefono) {
		this.textField_Telefono = textField_Telefono;
	}
}