package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class TrivaGo extends JFrame {

	private JPanel contentPane;
	private JPanel panelEleccion;
	private JPanel panelLogo;
	private JLabel LoGo;
	private JButton btnAtrs;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPanel panelResumen;
	private JPanel panelPago;
	private JPanel panelLogin;
	private JPanel panelRegistarse;
	private JTable table;
	private JScrollPane panelListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrivaGo frame = new TrivaGo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrivaGo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panelLogo = new JPanel();
		panelLogo.setBackground(Color.WHITE);
		contentPane.add(panelLogo, "name_3423802644026445");
		panelLogo.setLayout(null);
		
		LoGo = new JLabel("");
		LoGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelEleccion.setVisible(true);
				panelLogo.setVisible(false);
				
			}
		});
		LoGo.setBounds(113, 0, 326, 319);
		panelLogo.add(LoGo);
		LoGo.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\TrivaGO.png"));
		
		JLabel lblVyenbenydo = new JLabel("VyenBenyd\u00F3");
		lblVyenbenydo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVyenbenydo.setBounds(202, 330, 114, 30);
		panelLogo.add(lblVyenbenydo);
		
		panelEleccion = new JPanel();
		panelEleccion.setBackground(Color.WHITE);
		contentPane.add(panelEleccion, "name_3492475729881343");
		panelEleccion.setLayout(null);
		
		btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEleccion.setVisible(false);
				panelLogo.setVisible(true);
				
			}
		});
		btnAtrs.setBounds(0, 368, 89, 23);
		panelEleccion.add(btnAtrs);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Salamanca", "Barcelona", "Bizkaia", "Madrid", "Valencia", "Leon", "C\u00E1ceres"}));
		comboBox.setBounds(134, 76, 109, 20);
		panelEleccion.add(comboBox);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCiudad.setBounds(42, 79, 74, 14);
		panelEleccion.add(lblCiudad);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNombre.setBounds(42, 120, 63, 14);
		panelEleccion.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setBounds(134, 117, 337, 20);
		panelEleccion.add(textField);
		textField.setColumns(10);
		
		JLabel lblFechaEntrada = new JLabel("Fecha Entrada:");
		lblFechaEntrada.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaEntrada.setBounds(42, 157, 109, 14);
		panelEleccion.add(lblFechaEntrada);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFechaSalida.setBounds(42, 195, 96, 14);
		panelEleccion.add(lblFechaSalida);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\calendar (3).png"));
		label.setBounds(245, 148, 16, 23);
		panelEleccion.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\calendar (3).png"));
		label_1.setBounds(245, 186, 16, 23);
		panelEleccion.add(label_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelListado.setVisible(true);
				panelEleccion.setVisible(false);
			}
		});
		btnBuscar.setBounds(192, 273, 89, 23);
		panelEleccion.add(btnBuscar);
		
		panelResumen = new JPanel();
		panelResumen.setBackground(Color.WHITE);
		contentPane.add(panelResumen, "name_3495257717873768");
		panelResumen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ciudad:");
		lblNewLabel.setBounds(51, 79, 46, 14);
		panelResumen.add(lblNewLabel);
		
		JLabel lblNombreAlojamiento = new JLabel("Nombre Alojamiento:");
		lblNombreAlojamiento.setBounds(51, 39, 114, 14);
		panelResumen.add(lblNombreAlojamiento);
		
		JLabel lblFechaEntrada_1 = new JLabel("Fecha Entrada:");
		lblFechaEntrada_1.setBounds(51, 117, 83, 14);
		panelResumen.add(lblFechaEntrada_1);
		
		JLabel lblFechaSalida_1 = new JLabel("Fecha Salida:");
		lblFechaSalida_1.setBounds(51, 152, 76, 14);
		panelResumen.add(lblFechaSalida_1);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(51, 222, 46, 14);
		panelResumen.add(lblPrecio);
		
		JLabel lblNoches = new JLabel("Noches:");
		lblNoches.setBounds(51, 187, 46, 14);
		panelResumen.add(lblNoches);
		
		JButton btnAtrs_1 = new JButton("Atr\u00E1s");
		btnAtrs_1.setBounds(0, 368, 89, 23);
		panelResumen.add(btnAtrs_1);
		
		JButton btnAceptar_1 = new JButton("Pagar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogin.setVisible(true);
				panelResumen.setVisible(false);
			}
		});
		btnAceptar_1.setBounds(437, 368, 89, 23);
		panelResumen.add(btnAceptar_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(194, 36, 86, 20);
		panelResumen.add(textField_6);
		textField_6.setColumns(10);
		
		panelPago = new JPanel();
		panelPago.setBackground(Color.WHITE);
		contentPane.add(panelPago, "name_3495560659890136");
		panelPago.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Total a pagar:");
		lblNewLabel_1.setBounds(44, 83, 73, 14);
		panelPago.add(lblNewLabel_1);
		
		JLabel lblTotalAIntroducido = new JLabel("Total a Introducido:");
		lblTotalAIntroducido.setBounds(44, 125, 115, 14);
		panelPago.add(lblTotalAIntroducido);
		
		JLabel lblNewLabel_2 = new JLabel("A devolver:");
		lblNewLabel_2.setBounds(44, 177, 73, 14);
		panelPago.add(lblNewLabel_2);
		
		JButton btnAtrs_2 = new JButton("Atr\u00E1s");
		btnAtrs_2.setBounds(0, 368, 89, 23);
		panelPago.add(btnAtrs_2);
		
		JButton btnAceptar_2 = new JButton("Aceptar");
		btnAceptar_2.setBounds(437, 368, 89, 23);
		panelPago.add(btnAceptar_2);
		
		panelLogin = new JPanel();
		panelLogin.setBackground(Color.WHITE);
		contentPane.add(panelLogin, "name_3495820177435407");
		panelLogin.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setBounds(92, 194, 46, 14);
		panelLogin.add(lblNewLabel_3);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(92, 237, 78, 14);
		panelLogin.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 191, 86, 20);
		panelLogin.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 234, 86, 20);
		panelLogin.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRegistrate = new JLabel("Registrate");
		lblRegistrate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelRegistarse.setVisible(true);
				panelLogin.setVisible(false);
			}
		});
		lblRegistrate.setBounds(255, 278, 50, 14);
		panelLogin.add(lblRegistrate);
		
		JButton btnAtrs_3 = new JButton("Atr\u00E1s");
		btnAtrs_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panelResumen.setVisible(true);
			panelLogin.setVisible(false);
			}
		});
		btnAtrs_3.setBounds(0, 368, 89, 23);
		panelLogin.add(btnAtrs_3);
		
		JButton btnAceptar_3 = new JButton("Aceptar");
		btnAceptar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPago.setVisible(true);
				panelLogin.setVisible(false);
			}
		});
		btnAceptar_3.setBounds(437, 368, 89, 23);
		panelLogin.add(btnAceptar_3);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(202, 126, 46, 14);
		panelLogin.add(lblLogin);
		
		panelRegistarse = new JPanel();
		panelRegistarse.setBackground(Color.WHITE);
		contentPane.add(panelRegistarse, "name_3496109259480073");
		panelRegistarse.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Usuario:");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(46, 114, 58, 14);
		panelRegistarse.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_5.setBounds(46, 158, 70, 14);
		panelRegistarse.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Confrimar Contrase\u00F1a:");
		lblNewLabel_6.setBounds(46, 198, 131, 14);
		panelRegistarse.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 111, 145, 20);
		panelRegistarse.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 155, 145, 20);
		panelRegistarse.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(166, 195, 145, 20);
		panelRegistarse.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAtrs_4 = new JButton("Atr\u00E1s");
		btnAtrs_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRegistarse.setVisible(false);
				panelLogin.setVisible(true);
			}
		});
		btnAtrs_4.setBounds(0, 368, 89, 23);
		panelRegistarse.add(btnAtrs_4);
		
		JButton btnAceptar_4 = new JButton("Aceptar");
		btnAceptar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPago.setVisible(true);
				panelRegistarse.setVisible(false);
			}
		});
		btnAceptar_4.setBounds(437, 368, 89, 23);
		panelRegistarse.add(btnAceptar_4);
		
		JLabel lblRegistrtarse = new JLabel("REGISTRARSE");
		lblRegistrtarse.setBounds(200, 53, 111, 14);
		panelRegistarse.add(lblRegistrtarse);
		
		JButton btnPagar=new JButton("Pagar");
		
		panelListado = new JScrollPane();
		contentPane.add(panelListado, "name_3579441416644454");
		
		Object [][]datos=new Object [][] {
			
		};
		Object [] titulo=new String []{
				"hola","Hola2"
				
		};
		MModeloTabla modelTabla=new MModeloTabla(datos, titulo);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "hola", "Hola2"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(148);
		panelListado.setViewportView(table);
	}
}
