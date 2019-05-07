package Vista;

import javax.swing.JPanel;

import Modelo.Hotel;
import Modelo.SentenciasBBDD;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PanelEleccion extends JPanel {

	private static final long serialVersionUID = 8569197124012976731L;

	private JButton BtnAtras;

	private JComboBox<String> comboBox_1;
	private JLabel lblCiudad;
	private JLabel lblFechaEntrada;
	private JLabel lblFechaSalida;
	private JLabel label;
	private JLabel label_1;
	private JButton btnBuscar;

	public PanelEleccion() {
		setLayout(null);

		BtnAtras = new JButton("Atras");
		BtnAtras.setBounds(32, 239, 59, 23);
		add(BtnAtras);

		comboBox_1 = new JComboBox<>();
	
		comboBox_1.setModel(
				new DefaultComboBoxModel(new String[] { "Salamanca", "Barcelona", "Bilbao", "Madrid", "Sevilla" }));
		comboBox_1.setBounds(153, 78, 109, 20);
		comboBox_1.setSelectedIndex(0);
		add(comboBox_1);

		
		// -- MOVIDAS DE BORJA 
		

		
		// -- MOVIDAS DE BORJA
		
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

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}
	
}
