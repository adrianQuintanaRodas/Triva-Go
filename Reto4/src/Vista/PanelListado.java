package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelListado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable Table;
	private JScrollPane ScrollPane;
	private JButton BtnReservar;
	private JButton BtnAtras;

	public PanelListado() {
		setLayout(null);

		BtnAtras = new JButton("Atras");
		BtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BtnAtras.setBounds(10, 27, 76, 23);
		add(BtnAtras);

		BtnReservar = new JButton("Reservar");
		BtnReservar.setBounds(329, 336, 111, 23);
		add(BtnReservar);

		ScrollPane = new JScrollPane();
		ScrollPane.setBounds(10, 70, 430, 260);
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

	public JButton getBtnReservar() {
		return (this.BtnReservar);
	}

	public void setBtnReservar() {
		this.BtnReservar.setText("Reservar");
	}

	public JButton getBtnAtras() {
		return (this.BtnAtras);
	}

	public void setBtnAtras() {
		this.BtnAtras.setText("Atras");
	}
}
