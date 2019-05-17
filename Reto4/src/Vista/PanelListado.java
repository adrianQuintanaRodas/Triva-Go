package Vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
	private JComboBox<String> comboBox_2;
	private JLabel lblTipoDeCama;

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
		
		comboBox_2 = new JComboBox<>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] { "Doble", "Individual", "Matrimonio" }));
		comboBox_2.setBounds(110, 337, 123, 20);
		add(comboBox_2);
		
		lblTipoDeCama = new JLabel("Tipo de cama");
		lblTipoDeCama.setBounds(20, 340, 86, 14);
		add(lblTipoDeCama);

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
	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JLabel getLblTipoDeCama() {
		return lblTipoDeCama;
	}

	public void setLblTipoDeCama(JLabel lblTipoDeCama) {
		this.lblTipoDeCama = lblTipoDeCama;
	}
}