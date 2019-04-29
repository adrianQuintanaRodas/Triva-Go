package Vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.Hotel;
import Modelo.SentenciasBBDD;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelListado extends JPanel{
	private JTable Table;
	private JScrollPane ScrollPane;
	private JButton BtnAceptar;
	private JButton BtnAtras;
	
	
	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public PanelListado() {
		setLayout(null);
		
		BtnAtras = new JButton("Atras");
		BtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BtnAtras.setBounds(20, 277, 111, 23);
		add(BtnAtras);
		
		BtnAceptar = new JButton("Aceptar");
		BtnAceptar.setBounds(329, 277, 111, 23);
		add(BtnAceptar);
		
		ScrollPane = new JScrollPane();
		ScrollPane.setBounds(10, 11, 430, 260);
		add(ScrollPane);
		
		Table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		Object[] columnas = new Object[3];
		columnas[0] = "Nombre";
		columnas[1] = "Precio";
		columnas[2]="";
		model.setColumnIdentifiers(columnas);
		Object [] filas=new Object[2];
		ArrayList<Hotel> hotel1=new ArrayList<Hotel>();
		hotel1=SentenciasBBDD.visualizarCiudad();

		for(int i=0; i<hotel1.size();i++) {
			 filas[0] =hotel1.get(i).getNombre();
			 System.out.println(filas[0]);
			 filas[1] =hotel1.get(i).getPrecio();
			 System.out.println(filas[1]);
			 model.addRow(filas);
	}
		 Table.setModel(model);
		

		ScrollPane.setViewportView(Table);
	
}
	public JButton getBtnAceptar() {
		return (this.BtnAceptar);
	}
	public void setBtnAceptar() {
		this.BtnAceptar.setText("Aceptar");
	}
	public JButton getBtnAtras() {
		return (this.BtnAtras);
	}
	public void setBtnAtras() {
		this.BtnAtras.setText("Atras");
	}
}
