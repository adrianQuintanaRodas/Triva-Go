package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;

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
	SentenciasBBDD sentencias = new SentenciasBBDD();

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
				// SentenciasBBDD sentencias = new SentenciasBBDD();
				System.out.println(e.getItem().toString());
				ubicacion = e.getItem().toString();
				/*
				 * if (e.getSource()==vista.eleccion.getComboBox_1()) { String
				 * seleccionado=(String)vista.eleccion.getComboBox_1().getSelectedItem();
				 * ubicacion=seleccionado; }
				 */
				// ArrayList<Hotel> a = sentencias.visualizarCiudad(ubicacion);

			}
		});
		// La accion es que mete a la tabla con la ubicacion que pase del combobox
		vista.eleccion.getbtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.listado);
				vista.listado.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				DefaultTableModel model = new DefaultTableModel() {
					@Override
					public boolean isCellEditable(int row, int column) {
						// all cells false
						return false;
					}
				};

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
		/*
		 * vista.listado.getTable().addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent arg0) {
		 * 
		 * } });
		 */

		vista.eleccion.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.panelPresentacion);

			}
		});
		/*
		 * if (vista.listado.getTable().getSelectedRowCount() > 0) {
		 * vista.Resumen.getTextField_nombre().setText( (String)
		 * vista.listado.getTable().getValueAt(vista.listado.getTable().getSelectedRow()
		 * , 0)); }
		 */
		vista.listado.getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (vista.listado.getTable().getSelectedRowCount() > 0) {
					vista.Resumen.getTextField_nombre().setText(
							(String) vista.listado.getTable().getValueAt(vista.listado.getTable().getSelectedRow(), 0));
				}
				String huespedes = (String) vista.eleccion.getTextField_huespedes().getText();
				String Nnoches = (String) vista.eleccion.getTextField_Noches().getText();
				vista.Resumen.getTextField_Nnoches().setText(String.valueOf(Nnoches));
				Double precio = SentenciasBBDD.SacarPrecio(ubicacion);
				vista.Resumen.getTextField_Precio().setText(String.valueOf(precio));
				String ciudadhotel = (String) vista.eleccion.getComboBox_1().getSelectedItem();
				vista.Resumen.getTextField_ciudad().setText(ciudadhotel);
				String dia = Integer.toString(vista.eleccion.getDataida().getCalendar().get(Calendar.DAY_OF_MONTH));
				String mes = Integer.toString(vista.eleccion.getDataida().getCalendar().get(Calendar.MONTH) + 1);
				String year = Integer.toString(vista.eleccion.getDataida().getCalendar().get(Calendar.YEAR));
				String fechahotel = (dia + "-" + mes + "-" + year);
				vista.Resumen.getTextField_fechaIni().setText(fechahotel);
				String dia2 = Integer.toString(vista.eleccion.getDatavuelta().getCalendar().get(Calendar.DAY_OF_MONTH));
				String mes2 = Integer.toString(vista.eleccion.getDatavuelta().getCalendar().get(Calendar.MONTH) + 1);
				String year2 = Integer.toString(vista.eleccion.getDatavuelta().getCalendar().get(Calendar.YEAR));
				String fechahotel2 = (dia2 + "-" + mes2 + "-" + year2);
				vista.Resumen.getTextField_fechaFin().setText(fechahotel2);
				System.out.println("56468464-----------------------------------------------------");
				 Double preciohotel = SentenciasBBDD.CalcularPrecio(precio, huespedes,
				 Nnoches);
				 vista.Resumen.getTextField_precioFinal().setText(String.valueOf(preciohotel));
				String estrellashotel = SentenciasBBDD.SacarEstrellas(ubicacion);
				vista.Resumen.getTextField_Estrellas().setText(estrellashotel);
				vista.mostrarPanel(vista.Resumen);

			}
		});
		vista.listado.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});

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