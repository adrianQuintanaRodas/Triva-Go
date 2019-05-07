package Vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Hotel;
import Modelo.SentenciasBBDD;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class PanelListado extends JPanel {
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

	}

	public JScrollPane getScrollPane() {
		return ScrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		ScrollPane = scrollPane;
	}

	public JTable getTable() {
		return Table;
	}

	public void setTable(JTable table) {
		Table = table;
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
