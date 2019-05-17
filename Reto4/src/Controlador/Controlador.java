package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

import java.lang.String;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Modelo.Cliente;
import Modelo.ConsultasBBDD;
import Modelo.Hotel;
import Modelo.Modelo;
import Modelo.Reserva;
import Modelo.SentenciasBBDD;
import Vista.Vista;

public class Controlador {

	protected static final String String = null;
	private Vista vista;
	private String ubicacion;
	Double precioFinal;

	SentenciasBBDD sentencias = new SentenciasBBDD();

	// **************************METODOS*************
	public Controlador(Vista vista, Modelo modelo, ConsultasBBDD consultaBBDD2) {
		this.vista = vista;
		InitializeEvents();

	}

	public void cambios() {
		double introducido;
		double finalPrecio = Double.parseDouble(vista.pagar.getTextField_total().getText());
		if (vista.pagar.getTextField_introducido().getText().equals(null)) {
			introducido = 0;
		} else {
			introducido = Double.parseDouble(vista.pagar.getTextField_introducido().getText());
			if (finalPrecio > introducido) {
				vista.pagar.getTextField_introducido().setText(null);
				;
				vista.pagar.getTextField_devolver().setText(null);
			} else {
				vista.pagar.getTextField_devolver().setText(Double.toString(introducido - finalPrecio));
				// cambios = TotalIntroducido - Total;
			}
		}

	}

	public void devolver(String vuelta) {

		vista.Devolver.textField_1.setText(vuelta);
		double x = Double.parseDouble(vista.Devolver.getTextField_1().getText());
		String cambios = "Se te devolvera: \n";
		String a, b, c, d, e, f, g, h, i, j, z;
		int cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, cont05 = 0, cont02 = 0, cont01 = 0, cont005 = 0,
				cont002 = 0, cont001 = 0;
		while (x >= 20.0) {
			cont20++;
			x = x - 20;
		}
		;

		if (cont20 > 0) {
			z = cont20 + " billetes de 20€";
			cambios = cambios + z;
		}

		while (x >= 10) {
			cont10++;
			x = x - 10;
		}
		;

		if (cont10 > 0) {
			a = cont10 + " billetes de 10€";
			cambios = cambios + a;
		}

		while (x >= 5) {
			cont5++;

			x = x - 5;
		}
		;

		if (cont5 > 0) {
			b = cont5 + " billetes de 5€";
			cambios = cambios + b;
		}

		while (x >= 2) {
			cont2++;
			x = x - 2;
		}
		;

		if (cont2 > 0) {
			c = cont2 + " monedas de 2€";
			cambios = cambios + c;
		}

		while (x >= 1) {
			cont1++;
			x = x - 1;
		}
		;

		if (cont1 > 0) {
			d = cont1 + " monedas de 1€";
			cambios = cambios + d;
		}

		while (x >= 0.5) {
			cont05++;
			x = x - 0.5;
		}
		;

		if (cont05 > 0) {
			e = cont05 + " monedas de 0,50cent";
			cambios = cambios + e;
		}

		while (x >= 0.2) {
			cont02++;

			x = x - 0.2;
		}
		;

		if (cont02 > 0) {
			f = cont02 + " monedas de 0,20cent";
			cambios = cambios + f;
		}

		while (x >= 0.1) {
			cont01++;
			x = x - 0.1;
		}
		;

		if (cont01 > 0) {
			g = cont01 + " monedas de 0,10cent";
			cambios = cambios + g;
		}

		while (x >= 0.05) {
			cont005++;
			x = x - 0.05;
		}
		;

		if (cont005 > 0) {
			h = cont005 + " monedas de 0,05cent";
			cambios = cambios + h;
		}

		while (x >= 0.02) {
			cont002++;
			x = x - 0.02;
		}
		;

		if (cont002 > 0) {
			i = cont002 + " monedas de 0,02cent";
			cambios = cambios + i;
		}

		while (x >= 0.01) {
			cont001++;
			x = x - 0.01;
		}
		;

		if (cont001 > 0) {
			j = cont001 + " monedas de 0,01cent";
			cambios = cambios + j;
		}
		vista.Devolver.getTextField_vueltas().setText(cambios);
	}

	private Cliente cogerdatosregistroUsuario() {
		Cliente A1 = null;
		// Al darle al boton registrar, Guardas los datos de la pantalla y los guarda en
		// un objeto usuario
		if (java.lang.String.valueOf(vista.registro.getpFContrasenaRegistro().getPassword())
				.equals(java.lang.String.valueOf(vista.registro.getpFRegistroContrasena().getPassword()))) {
			System.out.print("son iguales");
			A1 = new Cliente();

			A1.setNombre(vista.registro.gettFNombreRegistro().getText());
			A1.setDni(vista.registro.getTfDNIRegistro().getText());
			A1.setApellido(vista.registro.getTextField_Apellido().getText());
			A1.setcontraseña(java.lang.String.valueOf(vista.registro.getpFContrasenaRegistro().getPassword()));
			A1.setTelefono(Integer.parseInt(vista.registro.getTextField_Telefono().getText()));
			A1.setgmail(vista.registro.getTextField_Gmail().getText());

		} else {
			System.out.print("No son iguales");
		}

		return A1;

	}

	// resetear el panel registro poniendolo vacio.
	private void resetRegistro() {
		// TODO Auto-generated method stub
		vista.registro.gettFNombreRegistro().setText(null);
		vista.registro.getTfDNIRegistro().setText(null);
		vista.registro.getpFRegistroContrasena().setText(null);
		vista.registro.getpFContrasenaRegistro().setText(null);
		vista.registro.getTextField_Apellido().setText(null);
		vista.registro.getTextField_Gmail().setText(null);
		;
		vista.registro.getTextField_Telefono().setText(null);
		;
	}

	private Reserva cogerdatosparareserva() {
		Reserva v1 = new Reserva();
		v1.setNombre(sentencias.SacarNombreUsuario(vista.login.gettFLoginUsuario().getText()));
		v1.setDni(vista.login.gettFLoginUsuario().getText());
		v1.setUbicacion((java.lang.String) vista.eleccion.getComboBox_1().getSelectedItem());
		v1.setEstrellas(vista.Resumen.getTextField_Estrellas().getText());
		v1.setPrecio(Double.parseDouble(vista.Resumen.getTextField_Precio().getText()));
		v1.setId(sentencias.SacarId(ubicacion));
		v1.setTipo_cama((java.lang.String) vista.listado.getComboBox_2().getSelectedItem());
		v1.setNoches(Integer.parseInt(vista.eleccion.getTextField_Noches().getText()));
		return v1;

	}

	public void generarfichero() throws IOException {
		String nombre = JOptionPane.showInputDialog(null, "Introduce el noombre del fichero");
		File ruta = new File("c:/ficheros");
		File f = new File(ruta, nombre + ".txt");
		System.out.println(f.getParent());
		System.out.println(ruta.getAbsolutePath());
		System.out.println(ruta.getParent());

		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter impresora = new PrintWriter(fw);
			if (!f.exists()) { // se comprueba si el fichero existe o no
				System.out.println("Fichero " + f.getName() + " no existe");
				if (!ruta.exists()) { // se comprueba si la ruta existe o no
					System.out.println("El directorio " + ruta.getName() + " no existe");
					if (ruta.mkdir()) { // se crea la ruta. Si se ha creado correctamente
						System.out.println("Directorio creado");
						if (f.createNewFile()) { // se crea el fichero. Si se ha creado correctamente
							System.out.println("Fichero " + f.getName() + " creado");

							/*
							 * impresora.println("\tRESERVAS DE:"+dni);
							 * impresora.println("------------------"); impresora.println(""); for(int
							 * i=0;i<lista.size();i++) {
							 * impresora.println(lista.get(i).getId_reserva()+"\t"+lista.get(i).getDni()+
							 * "\t"+ lista.get(i).getDni()+"\t"+ lista.get(i).getNombre()+"\t"+
							 * lista.get(i).getUbicacion()+"\t"+ lista.get(i).getEstrellas()+"\t"+
							 * lista.get(i).getPrecio()+"\t"+ lista.get(i).getId()+"\t"+
							 * lista.get(i).getTipo_cama()+"\t"+ lista.get(i).getNoches());
							 * 
							 * } impresora.println(""); impresora.close();
							 */
						} else {
							System.out.println("No se ha podido crear " + f.getName());
						}
					} else {
						System.out.println("No se ha podido crear " + ruta.getName());
					}
				} else { // si la ruta existe creamos el fichero
					if (f.createNewFile()) {
						System.out.println("Fichero " + f.getName() + " creado");

					} else {
						System.out.println("No se ha podido crear " + f.getName());
					}
				}
			} else { // el fichero existe. Mostramos el tamaño
				System.out.println("Fichero " + f.getName() + " existe");
				impresora.println("Nombre Hotel:" + sentencias.SacarNombre(ubicacion) + "     Precio Hotel:"
						+ sentencias.SacarPrecio(ubicacion));
				impresora.close();
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	// ************************************************************************************************************

	private void InitializeEvents() {
		vista.panelPresentacion.getbtnPresentacionTermibus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.licencia);
				sentencias.cogerUbicacion(vista.eleccion.getComboBox_1());

			}
		});
		// **************************ELECCION*************
		vista.eleccion.getComboBox_1().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				ubicacion = e.getItem().toString();

			}
		});
		// La accion es que mete a la tabla con la ubicacion que pase del combobox
		vista.eleccion.getbtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!(vista.eleccion.getComboBox_1().getSelectedItem().equals("-Selecciona-"))) {
					vista.listado.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					DefaultTableModel model = new DefaultTableModel() {

						private static final long serialVersionUID = 1L;

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

						filas[0] = hotel1.get(i).getNombre();

						filas[1] = hotel1.get(i).getPrecio();

						model.addRow(filas);
					}
					vista.listado.getTable().setModel(model);
					vista.listado.getScrollPane().setViewportView(vista.listado.getTable());
				//	int noches = Integer.parseInt(vista.eleccion.getTextField_Noches().getText());
					if (vista.eleccion.getTextField_Noches().getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Introduce al menos un noche");
						vista.eleccion.getTextField_Noches().setText("1");
					} else {
						vista.mostrarPanel(vista.listado);
					}

					String tipo_cama = (String) vista.listado.getComboBox_2().getSelectedItem();
					vista.Resumen.getTextField_Tipo_cama().setText(tipo_cama);

				} else {
					JOptionPane.showMessageDialog(null, "Selecciona un hotel");
				}
			}
		});
		vista.eleccion.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.panelPresentacion);

			}
		});
		// **************************LISTADO*************
		vista.listado.getBtnReservar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (vista.listado.getTable().getSelectedRowCount() > 0) {
					vista.Resumen.getTextField_nombre().setText(
							(String) vista.listado.getTable().getValueAt(vista.listado.getTable().getSelectedRow(), 0));
				}
				String huespedes = (String) vista.eleccion.getTextField_huespedes().getText();
				String Nnoches = (String) vista.eleccion.getTextField_Noches().getText();
				vista.Resumen.getTextField_Nnoches().setText(java.lang.String.valueOf(Nnoches));
				Double precio = sentencias.SacarPrecio(ubicacion);
				vista.Resumen.getTextField_Precio().setText(java.lang.String.valueOf(precio));
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
				Double preciohotel = sentencias.CalcularPrecio(precio, huespedes, Nnoches);
				vista.Resumen.getTextField_precioFinal().setText(java.lang.String.valueOf(preciohotel));
				precioFinal = Double.parseDouble(vista.Resumen.getTextField_precioFinal().getText());
				String estrellashotel = sentencias.SacarEstrellas(ubicacion);
				vista.Resumen.getTextField_Estrellas().setText(estrellashotel);
				vista.mostrarPanel(vista.Resumen);

			}
		});
		vista.listado.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);
				/* poner la licencia en el principal panel */
			}
		});
		// **************************RESUMEN*************
		vista.Resumen.getBtnPagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.login);
				String precioFinal = vista.Resumen.getTextField_precioFinal().getText();
				vista.pagar.getTextField_total().setText(precioFinal);
			}
		});
		vista.Resumen.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});
		// **************************LICENCIA*************
		vista.licencia.getBoton2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// vista.licencia.setVisible(false);
				vista.mostrarPanel(vista.panelPresentacion);
				;
			}
		});
		vista.licencia.getCheck1().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (vista.licencia.getCheck1().isSelected()) {
					vista.licencia.getBoton1().setEnabled(true);
					vista.licencia.getBoton2().setEnabled(false);
				} else {
					vista.licencia.getBoton1().setEnabled(false);
					vista.licencia.getBoton2().setEnabled(true);
				}
			}
		});
		vista.licencia.getBoton1().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.eleccion);

			}
		});
		// **************************PAGAR*************
		vista.pagar.getBtnComprobar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambios();
			}
		});
		vista.pagar.getbtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.listado);
			}
		});
		vista.pagar.getbtnDevolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (vista.pagar.getTextField_devolver().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No has comprobado el dinero introducido");

				} else {
					Reserva v1 = cogerdatosparareserva();
					sentencias.insertarReserva(v1);
					vista.mostrarPanel(vista.Devolver);
					String vuelta = vista.pagar.getTextField_devolver().getText();

					devolver(vuelta);
				}
			}
		});
		// *************************LOGIN***********************
		vista.login.getBtnAtras().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.Resumen);

			}
		});
		vista.login.getbtnRegistrarse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.registro);

			}
		});
		vista.login.getbtnLoginAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = vista.login.gettFLoginUsuario().getText();
				String password = java.lang.String.valueOf(vista.login.getpFLoginPassword().getPassword());

				if (sentencias.comprobarLog(dni, password) == 1) {
					JOptionPane.showMessageDialog(null, "esta bien");
					vista.mostrarPanel(vista.pagar);
				} else {
					JOptionPane.showMessageDialog(null, "esta mal");
					vista.mostrarPanel(vista.login);
				}

			}
		});
		// ***************************REGISTRO**************************
		vista.registro.getbtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.login);

			}
		});
		vista.registro.getbtnLoginAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// recogemos los datos del usuario
				Cliente A1 = cogerdatosregistroUsuario();
				int exito = sentencias.insertarUsuario(A1);
				if (exito > 0) {
					System.out.println("Es");
				} else {
					System.out.println("no");
				}
				resetRegistro();
				vista.mostrarPanel(vista.login);

			}

		});
		vista.Devolver.getBtnVolverEleccion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.eleccion.getTextField_huespedes().setText(null);
				vista.eleccion.getTextField_Noches().setText(null);
				String dni = vista.login.gettFLoginUsuario().getText();
				try {
					generarfichero();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				vista.mostrarPanel(vista.eleccion);

			}
		});

	}
}