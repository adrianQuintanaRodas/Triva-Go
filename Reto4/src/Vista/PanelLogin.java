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

	private JTextField tFLoginUsuario;
	private JPasswordField pFLoginPassword;
	private JButton btnLoginAceptar;
	private JLabel lblPanelError;
	private JButton btnRegistrarse;
	private JLabel lblLoginUsuario;
	private JLabel lblLoginPassword;
	private JLabel lblLogin;
	private JPanel panel;
	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		lblLoginUsuario = new JLabel("Usuario");
		lblLoginUsuario.setBounds(55, 94, 46, 14);
		add(lblLoginUsuario);
		
		lblLoginPassword = new JLabel("Password");
		lblLoginPassword.setBounds(51, 144, 102, 14);
		add(lblLoginPassword);
		
		tFLoginUsuario = new JTextField();
		tFLoginUsuario.setBounds(157, 91, 86, 20);
		add(tFLoginUsuario);
		tFLoginUsuario.setColumns(10);
		
		pFLoginPassword = new JPasswordField();
		pFLoginPassword.setBounds(157, 141, 86, 20);
		add(pFLoginPassword);
		
		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(223, 199, 100, 23);
		add(btnLoginAceptar);
		
		lblPanelError = new JLabel("");
		lblPanelError.setBounds(277, 94, 46, 14);
		add(lblPanelError);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(32, 198, 291, 25);
		add(btnRegistrarse);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(32, 46, 289, 141);
		add(panel);
		
		lblLogin = new JLabel("LOGIN");
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));

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
		
}