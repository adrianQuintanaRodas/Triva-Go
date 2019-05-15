package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;

public class PanelLogin extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField tFLoginUsuario;
	private JPasswordField pFLoginPassword;
	private JButton btnLoginAceptar;
	private JLabel lblPanelError;
	private JButton btnRegistrarse;
	private JLabel lblLoginUsuario;
	private JLabel lblLoginPassword;
	private JLabel lblLogin;
	private JPanel panel;
	private JButton btnAtras;

	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setBackground(Color.WHITE);
		setLayout(null);

		tFLoginUsuario = new JTextField();
		tFLoginUsuario.setBounds(157, 91, 86, 20);
		add(tFLoginUsuario);
		tFLoginUsuario.setColumns(10);

		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(223, 199, 100, 23);
		add(btnLoginAceptar);

		lblPanelError = new JLabel("");
		lblPanelError.setBounds(277, 94, 46, 14);
		add(lblPanelError);

		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(32, 46, 289, 141);
		add(panel);
		panel.setLayout(null);

		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(119, 5, 51, 19);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(187, 122, 102, 19);
		panel.add(btnRegistrarse);

		lblLoginPassword = new JLabel("Password");
		lblLoginPassword.setBounds(10, 90, 102, 14);
		panel.add(lblLoginPassword);

		pFLoginPassword = new JPasswordField();
		pFLoginPassword.setBounds(122, 87, 86, 20);
		panel.add(pFLoginPassword);

		lblLoginUsuario = new JLabel("Usuario (Dni)");
		lblLoginUsuario.setBounds(10, 49, 92, 14);
		panel.add(lblLoginUsuario);

		btnAtras = new JButton("Atras");
		btnAtras.setBounds(42, 199, 89, 23);
		add(btnAtras);

	}

	public JTextField gettFLoginUsuario() {
		return (this.tFLoginUsuario);
	}

	public void settFLoginUsuario() {
		this.tFLoginUsuario.setText("");
	}

	public JPasswordField getpFLoginPassword() {
		return (this.pFLoginPassword);
	}

	public void setpFLoginPassword() {
		this.pFLoginPassword.setText("");
	}

	public JButton getbtnLoginAceptar() {
		return (this.btnLoginAceptar);
	}

	public void setbtnLoginAceptar() {
		this.btnLoginAceptar.setText("Aceptar");
	}

	public JLabel getlblPanelError() {
		return (this.lblPanelError);
	}

	public void setlblPanelError() {
		this.lblPanelError.setText("");
	}

	public JButton getbtnRegistrarse() {
		return (this.btnRegistrarse);
	}

	public void setbtnRegistrarse() {
		this.btnRegistrarse.setText("Registrarse");
	}

	public JLabel getlblLoginUsuario() {
		return (this.lblLoginUsuario);
	}

	public void setlblLoginUsuario() {
		this.lblLoginUsuario.setText("Usuario");
	}

	public JLabel getlblLoginPassword() {
		return (this.lblLoginPassword);
	}

	public void setlblLoginPassword() {
		this.lblLoginPassword.setText("Password");
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}

}