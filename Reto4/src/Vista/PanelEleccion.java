package Vista;

import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelEleccion extends JPanel {

	private static final long serialVersionUID = 8569197124012976731L;

	private JButton BtnAtras;

	private JComboBox<String> comboBox_1;
	private JLabel lblCiudad;
	private JLabel lblFechaEntrada;
	private JLabel lblFechaSalida;
	private JButton btnBuscar;
	private JDateChooser Dataida;
	private JDateChooser datavuelta;
	private JTextField textField_huespedes;
	private JTextField textField_Noches;

	public PanelEleccion() {
		setLayout(null);

		BtnAtras = new JButton("Atras");
		BtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BtnAtras.setBounds(10, 11, 74, 23);
		add(BtnAtras);

		comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(166, 78, 123, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Selecciona-"}));
		comboBox_1.setSelectedIndex(0);
		add(comboBox_1);
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCiudad.setBounds(42, 84, 74, 14);
		add(lblCiudad);

		lblFechaEntrada = new JLabel("Fecha Entrada:");
		lblFechaEntrada.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaEntrada.setBounds(42, 125, 109, 14);
		add(lblFechaEntrada);

		lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaSalida.setBounds(42, 163, 96, 14);
		add(lblFechaSalida);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\busqueda (1).png"));
		btnBuscar.setBounds(207, 279, 102, 23);
		add(btnBuscar);

		Dataida = new JDateChooser();
		Dataida.setBounds(167, 119, 142, 20);
		add(Dataida);

		datavuelta = new JDateChooser();
		datavuelta.setBounds(166, 157, 143, 20);
		add(datavuelta);

		JLabel lblNmeroDePersonas = new JLabel("Hu\u00E9spedes:");
		lblNmeroDePersonas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNmeroDePersonas.setBounds(42, 199, 96, 14);
		add(lblNmeroDePersonas);

		textField_huespedes = new JTextField();
		textField_huespedes.setBounds(167, 198, 51, 20);
		add(textField_huespedes);
		textField_huespedes.setColumns(10);

		JLabel lblNoches = new JLabel("Noches:");
		lblNoches.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNoches.setBounds(42, 234, 96, 14);
		add(lblNoches);

		textField_Noches = new JTextField();
		textField_Noches.setColumns(10);
		textField_Noches.setBounds(167, 233, 51, 20);
		add(textField_Noches);

	}

	public JTextField getTextField_huespedes() {
		return textField_huespedes;
	}

	public void setTextField_huespedes(JTextField textField_huespedes) {
		this.textField_huespedes = textField_huespedes;
	}

	public JTextField getTextField_Noches() {
		return textField_Noches;
	}

	public void setTextField_Noches(JTextField textField_Noches) {
		this.textField_Noches = textField_Noches;
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

	public JDateChooser getDataida() {
		return Dataida;
	}

	public void setDataida(JDateChooser dataida) {
		Dataida = dataida;
	}

	public JDateChooser getDatavuelta() {
		return datavuelta;
	}

	public void setDatavuelta(JDateChooser datavuelta) {
		this.datavuelta = datavuelta;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}
}
