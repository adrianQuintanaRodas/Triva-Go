package Vista;

import javax.swing.JPanel;

public class Vista {

	public Ventana ventana = new Ventana();
	public Licencia licencia = new Licencia();
	public PanelListado listado = new PanelListado();
	public PanelPresentacion panelPresentacion = new PanelPresentacion();
	public PanelEleccion eleccion = new PanelEleccion();
	public PanelResumen Resumen = new PanelResumen();
	public PanelDevolver Devolver = new PanelDevolver();
	public PanelPagar pagar = new PanelPagar();
	public PanelLogin login = new PanelLogin();
	public PanelRegistro registro = new PanelRegistro();

	public Vista() {
		mostrarPanel(panelPresentacion);
	}

	// Metodo que recibe un panel
	// y lo muestra en el JFrame ventana
	public void mostrarPanel(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
	}
}