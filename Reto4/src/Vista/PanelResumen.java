package Vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JLabel;

public class PanelResumen extends JPanel {

	private JLabel Lblnombre;
	private JLabel Lblciudad;
	private JLabel LblfechaIni;
	private JLabel LblfechaFin;
	private JLabel LblEstrellas;
	private JLabel LblPrecio;
	private JLabel LblNnoches;
	
	private JButton BtnPagar;
	private JButton BtnAtras;
	public JTextField TextField_nombre;
	private JTextField TextField_ciudad;
	private JTextField TextField_fechaIni;
	private JTextField TextField_fechaFin;
	private JTextField TextField_Estrellas;
	private JTextField TextField_Precio;
	private JTextField TextField_Nnoches;
	
	private JPanel panel;
	private JLabel lblPrecioFinal;
	private JTextField textField_precioFinal;
	
	/**
	 * Create the panel.
	 */
	public PanelResumen() {
		setBackground(Color.WHITE);
		setLayout(null);
		
	
		
		panel = new JPanel();
		panel.setBounds(10, 0, 452, 365);
		panel.setBackground(SystemColor.scrollbar);
		add(panel);
		panel.setLayout(null);
		
		TextField_nombre = new JTextField();
		TextField_nombre.setBounds(166, 63, 116, 20);
		panel.add(TextField_nombre);
		TextField_nombre.setColumns(10);
		
		TextField_ciudad = new JTextField();
		TextField_ciudad.setBounds(310, 94, 86, 22);
		panel.add(TextField_ciudad);
		TextField_ciudad.setColumns(10);
		
		TextField_Estrellas = new JTextField();
		TextField_Estrellas.setBounds(166, 160, 116, 22);
		panel.add(TextField_Estrellas);
		TextField_Estrellas.setColumns(10);
		
		LblPrecio = new JLabel("Precio:");
		LblPrecio.setBounds(16, 229, 56, 16);
		panel.add(LblPrecio);
		
		LblNnoches = new JLabel("N\u00FAmero de noches:");
		LblNnoches.setBounds(16, 199, 134, 16);
		panel.add(LblNnoches);
		
		
		Lblnombre = new JLabel("Nombre Alojamiento:");
		Lblnombre.setBounds(16, 67, 134, 16);
		panel.add(Lblnombre);
		
		LblfechaIni = new JLabel("Fecha Inicio:");
		LblfechaIni.setBounds(16, 100, 90, 16);
		panel.add(LblfechaIni);
		
		LblfechaFin = new JLabel("Fecha Final:");
		LblfechaFin.setBounds(16, 136, 73, 16);
		panel.add(LblfechaFin);
		
		TextField_fechaIni = new JTextField();
		TextField_fechaIni.setBounds(166, 94, 116, 22);
		panel.add(TextField_fechaIni);
		TextField_fechaIni.setColumns(10);
		
		LblEstrellas = new JLabel("Estrellas:");
		LblEstrellas.setBounds(16, 166, 56, 16);
		panel.add(LblEstrellas);
		
		TextField_fechaFin = new JTextField();
		TextField_fechaFin.setBounds(166, 127, 116, 22);
		panel.add(TextField_fechaFin);
		TextField_fechaFin.setColumns(10);
		
		TextField_Nnoches = new JTextField();
		TextField_Nnoches.setBounds(166, 193, 116, 22);
		panel.add(TextField_Nnoches);
		TextField_Nnoches.setColumns(10);
		
		Lblciudad = new JLabel("Ciudad:");
		Lblciudad.setBounds(310, 61, 68, 24);
		panel.add(Lblciudad);
		
		TextField_Precio = new JTextField();
		TextField_Precio.setBounds(166, 226, 116, 22);
		panel.add(TextField_Precio);
		TextField_Precio.setColumns(10);
		
		BtnAtras = new JButton("Atras");
		BtnAtras.setBounds(10, 11, 73, 25);
		panel.add(BtnAtras);
		
		
		
		BtnPagar = new JButton("Pagar");
		BtnPagar.setBounds(292, 306, 97, 25);
		panel.add(BtnPagar);
		
		lblPrecioFinal = new JLabel("Precio Final:");
		lblPrecioFinal.setBounds(200, 264, 82, 16);
		panel.add(lblPrecioFinal);
		
		textField_precioFinal = new JTextField();
		textField_precioFinal.setColumns(10);
		textField_precioFinal.setBounds(292, 261, 86, 22);
		panel.add(textField_precioFinal);
		BtnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
	
	public JTextField getTextField_precioFinal() {
		return textField_precioFinal;
	}

	public void setTextField_precioFinal(JTextField textField_precioFinal) {
		this.textField_precioFinal = textField_precioFinal;
	}

	public JLabel getLblnombre() {
		return (this.Lblnombre);
	}
	public void setLblnombre() {
		this.Lblnombre.setText("Nombre Alojamiento");
	}
	public JLabel getLblciudad() {
		return (this.Lblciudad);
	}
	public void setLblciudad() {
		this.Lblciudad.setText("Ciudad");
	}
	public JLabel getLblfechaIni() {
		return (this.LblfechaIni);
	}
	public void setLblfechaIni() {
		this.LblfechaIni.setText("Fecha Inicio"); 
	}
	public JLabel getLblfechaFin() {
		return (this.LblfechaFin);
	}
	public void setfechaFin() {
		this.LblfechaFin.setText("Fecha Final");
	}
	public JLabel getLblEstrellas() {
		return (this.LblEstrellas);
	}
	public void setLblEstrellas() {
		this.LblEstrellas.setText("Estrellas");
	}
	public JLabel getLblNnoches() {
		return (this.LblNnoches);
	}
	public void LblNnoches() {
		this.LblPrecio.setText("Numero de noches");
	}
	public JLabel getLblPrecio() {
		return (this.LblPrecio);
	}
	public void setLblPrecio() {
		this.LblPrecio.setText("Precio");
	}
	
	public JButton getBtnPagar() {
		return (this.BtnPagar);
	}
	public void setBtnPagar() {
		this.BtnPagar.setText("Pagar");
	}
	public JButton getBtnAtras() {
		return (this.BtnAtras);
	}
	public void setBtnAtras() {
		this.BtnAtras.setText("Atras");
	}
	
	public JTextField getTextField_nombre() {
		return (this.TextField_nombre);
	}
	public void setTextField_nombre() {
		this.TextField_nombre.setText("");
	}
	public JTextField getTextField_ciudad() {
		return (this.TextField_ciudad);
	}
	public void setTextField_ciudad() {
		this.TextField_ciudad.setText("");
	}
	public JTextField getTextField_fechaIni() {
		return (this.TextField_fechaIni);
	}
	public void setTextField_fechaIni() {
		this.TextField_fechaIni.setText("");
	}
	public JTextField getTextField_fechaFin() {
		return (this.TextField_fechaFin);
	}
	public void setTextField_fechaFin() {
		this.TextField_fechaFin.setText("");
	}
	public JTextField getTextField_Estrellas() {
		return (this.TextField_Estrellas);
	}
	public void setTextField_Estrellas() {
		this.TextField_Estrellas.setText("");
	}
	public JTextField getTextField_Precio() {
		return (this.TextField_Precio);
	}
	public void setTextField_Precio() {
		this.TextField_Precio.setText("");
	}
	public JTextField getTextField_Nnoches() {
		return (this.TextField_Nnoches);
	}
	public void setTextField_Nnoches() {
		this.TextField_Nnoches.setText("");
	}
	
	
}