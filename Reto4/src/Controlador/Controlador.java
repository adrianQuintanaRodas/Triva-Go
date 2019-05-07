package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Modelo.ConsultasBBDD;
import Modelo.Hotel;
import Modelo.Modelo;
import Modelo.SentenciasBBDD;
import Vista.Vista;

public class Controlador {

	protected static final String String = null;
	private Vista vista;
	private Modelo modelo;
	private ConsultasBBDD consultaBBDD;
	private String ubicacion;

	public Controlador(Vista vista, Modelo modelo, ConsultasBBDD consultaBBDD2) {
		this.vista = vista;
		this.modelo = modelo;
		this.consultaBBDD = consultaBBDD2;
		InitializeEvents();

	}

	private void InitializeEvents() {
		vista.panelPresentacion.getbtnPresentacionTermibus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});
		vista.eleccion.getComboBox_1().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				SentenciasBBDD sentencias = new SentenciasBBDD();
				System.out.println(e.getItem().toString());
				ubicacion = e.getItem().toString();
				ArrayList<Hotel> a = sentencias.visualizarCiudad(ubicacion);

			}
		});
		vista.eleccion.getbtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.listado);
				vista.listado.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				DefaultTableModel model = new DefaultTableModel();
					
				String ubicacion = (String) vista.eleccion.getComboBox_1().getSelectedItem();
				SentenciasBBDD sentencias = new SentenciasBBDD();
				ArrayList<Hotel> hotel1 = sentencias.visualizarCiudad(ubicacion);

				Object[] columnas = new Object[2];
				columnas[0] = "Nombre";
				columnas[1] = "Precio";
			
				model.setColumnIdentifiers(columnas);
				Object[] filas = new Object[2];
				for (int i = 0; i < hotel1.size(); i++) {
					System.out.println("Meterlas filas");
					filas[0] = hotel1.get(i).getNombre();
					System.out.println(filas[0]);
					filas[1] = hotel1.get(i).getPrecio();
					System.out.println(filas[1]);
					model.addRow(filas);
				}

				vista.listado.getTable().setModel(model);
				vista.listado.getScrollPane().setViewportView(vista.listado.getTable());

			}
		});
		
		vista.eleccion.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.panelPresentacion);

			}
		});
		vista.listado.getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.Resumen);

			}
		});
		vista.listado.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});

		/*
		 * DefaultTableModel model = new DefaultTableModel();
		 * System.out.println("Este es del table"+vista.eleccion.getComboBox_1().
		 * getItemAt(0)); String ubicacion=vista.eleccion.getComboBox_1().toString();
		 * SentenciasBBDD sentencias = new SentenciasBBDD(); ArrayList<Hotel>
		 * hotel1=sentencias.visualizarCiudad(ubicacion);
		 * System.out.println("table"+ubicacion); Object[] columnas = new Object[3];
		 * columnas[0] = "Nombre"; columnas[1] = "Precio"; columnas[2]="";
		 * model.setColumnIdentifiers(columnas); Object [] filas=new Object[2]; for(int
		 * i=0; i<hotel1.size();i++) { filas[0] =hotel1.get(i).getNombre();
		 * System.out.println(filas[0]); filas[1] =hotel1.get(i).getPrecio();
		 * System.out.println(filas[1]); model.addRow(filas); }
		 * vista.listado.getTable().setModel(model);
		 */
		// ---------------------------------------------------------------------------
		/*
		 * Object[] columnas = new Object[3]; columnas[0] = "Nombre"; columnas[1] =
		 * "Precio"; columnas[2]=""; model.setColumnIdentifiers(columnas); Object []
		 * filas=new Object[2]; ArrayList<Hotel> hotel1=new ArrayList<Hotel>();
		 * SentenciasBBDD a = new SentenciasBBDD();
		 * 
		 * 
		 * hotel1=a.visualizarCiudad(ubicacion);
		 * 
		 * for(int i=0; i<hotel1.size();i++) { filas[0] =hotel1.get(i).getNombre();
		 * System.out.println(filas[0]); filas[1] =hotel1.get(i).getPrecio();
		 * System.out.println(filas[1]); model.addRow(filas); } Table.setModel(model);
		 * 
		 * 
		 * ScrollPane.setViewportView(Table);
		 */

		vista.Resumen.getBtnPagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.pagar);

			}
		});
		vista.Resumen.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});

	}
}