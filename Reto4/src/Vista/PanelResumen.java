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
	
	/**
	 * Create the panel.
	 */
	public PanelResumen() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		
		
		BtnPagar = new JButton("Pagar");
		BtnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BtnPagar.setBounds(309, 226, 97, 25);
		add(BtnPagar);
		
		BtnAtras = new JButton("Atras");
		BtnAtras.setBounds(33, 226, 97, 25);
		add(BtnAtras);
		
	
		
		panel = new JPanel();
		panel.setBounds(10, 48, 411, 167);
		panel.setBackground(SystemColor.scrollbar);
		add(panel);
		panel.setLayout(null);
		
		TextField_nombre = new JTextField();
		TextField_nombre.setBounds(299, 62, 86, 20);
		panel.add(TextField_nombre);
		TextField_nombre.setColumns(10);
		
		TextField_ciudad = new JTextField();
		TextField_ciudad.setBounds(173, 36, 116, 22);
		panel.add(TextField_ciudad);
		TextField_ciudad.setColumns(10);
		
		TextField_Estrellas = new JTextField();
		TextField_Estrellas.setBounds(173, 8, 116, 22);
		panel.add(TextField_Estrellas);
		TextField_Estrellas.setColumns(10);
		
		LblPrecio = new JLabel("Precio");
		LblPrecio.setBounds(23, 140, 56, 16);
		panel.add(LblPrecio);
		
		LblNnoches = new JLabel("Numero de noches");
		LblNnoches.setBounds(23, 118, 134, 16);
		panel.add(LblNnoches);
		
		
		Lblnombre = new JLabel("Nombre Alojamiento");
		Lblnombre.setBounds(23, 11, 108, 16);
		panel.add(Lblnombre);
		
		LblfechaIni = new JLabel("Fecha Inicio");
		LblfechaIni.setBounds(23, 39, 90, 16);
		panel.add(LblfechaIni);
		
		LblfechaFin = new JLabel("Fecha Final");
		LblfechaFin.setBounds(23, 64, 56, 16);
		panel.add(LblfechaFin);
		
		TextField_fechaIni = new JTextField();
		TextField_fechaIni.setBounds(173, 61, 116, 22);
		panel.add(TextField_fechaIni);
		TextField_fechaIni.setColumns(10);
		
		LblEstrellas = new JLabel("Estrellas");
		LblEstrellas.setBounds(23, 91, 56, 16);
		panel.add(LblEstrellas);
		
		TextField_fechaFin = new JTextField();
		TextField_fechaFin.setBounds(173, 88, 116, 22);
		panel.add(TextField_fechaFin);
		TextField_fechaFin.setColumns(10);
		
		TextField_Precio = new JTextField();
		TextField_Precio.setBounds(173, 115, 116, 22);
		panel.add(TextField_Precio);
		TextField_Precio.setColumns(10);
		
		TextField_Nnoches = new JTextField();
		TextField_Nnoches.setBounds(173, 137, 116, 22);
		panel.add(TextField_Nnoches);
		TextField_Nnoches.setColumns(10);
		
		Lblciudad = new JLabel("Ciudad");
		Lblciudad.setBounds(299, 27, 41, 24);
		panel.add(Lblciudad);

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