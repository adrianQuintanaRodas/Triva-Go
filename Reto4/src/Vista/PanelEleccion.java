package Vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;



import javax.swing.JLabel;

public class PanelEleccion extends JPanel {

	
	private JButton BtnAtras;
	public static JComboBox cmbCiudad;
	private JLabel lblCiudad;
	private JLabel lblFechaEntrada;
	private JLabel lblFechaSalida;
	private JLabel label;
	private JLabel label_1;
	private JButton btnBuscar;
	
	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public PanelEleccion() {
		setLayout(null);
		
		BtnAtras = new JButton("Atras");
		BtnAtras.setBounds(32, 239, 59, 23);
		add(BtnAtras);
		
		cmbCiudad = new JComboBox();
		cmbCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		new DefaultComboBoxModel(new String[] { "Salamanca", "Barcelona", "Bilbao", "Madrid", "Sevilla" });
		cmbCiudad.setBounds(134, 76, 109, 20);
		add(cmbCiudad);
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCiudad.setBounds(42, 79, 74, 14);
		add(lblCiudad);
	
		lblFechaEntrada = new JLabel("Fecha Entrada:");
		lblFechaEntrada.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaEntrada.setBounds(42, 157, 109, 14);
		add(lblFechaEntrada);
	
		lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaSalida.setBounds(42, 195, 96, 14);
		add(lblFechaSalida);
	
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\calendar (3).png"));
		label.setBounds(245, 148, 16, 23);
		add(label);
	
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\calendar (3).png"));
		label_1.setBounds(245, 186, 16, 23);
		add(label_1);
	
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(192, 273, 89, 23);
		add(btnBuscar);

}
	public JButton getbtnBuscar() {
		return (this.btnBuscar);
	}
	public void setbtnBuscar() {
		this.btnBuscar.setText("Buscar");
	}
	public JButton getBtnAtras() {
		return (this.BtnAtras);
	}
	public void setBtnAtras() {
		this.BtnAtras.setText("Atras");
	}
}
