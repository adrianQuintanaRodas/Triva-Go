package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelPagar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField_total;
	private JTextField textField_introducido;
	private JTextField textField_devolver;
	private JLabel lblTotalAPagar;
	private JLabel lblPagado;
	private JLabel lblADevolver;
	private JButton btnDevolver;
	private JButton btnCancelar;
	private JButton btnComprobar;

	/**
	 * Create the panel.
	 */
	public PanelPagar() {
		setLayout(null);

		lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setBounds(103, 42, 95, 16);
		add(lblTotalAPagar);

		textField_total = new JTextField();
		textField_total.setBounds(240, 39, 116, 22);
		add(textField_total);
		textField_total.setColumns(10);

		lblPagado = new JLabel("Total Introducido :");
		lblPagado.setBounds(103, 69, 116, 16);
		add(lblPagado);

		textField_introducido = new JTextField();
		textField_introducido.setBounds(240, 68, 116, 22);
		add(textField_introducido);
		textField_introducido.setColumns(10);

		lblADevolver = new JLabel("A devolver :");
		lblADevolver.setBounds(103, 101, 95, 16);
		add(lblADevolver);

		textField_devolver = new JTextField();
		textField_devolver.setEditable(false);
		textField_devolver.setBounds(240, 98, 116, 22);
		add(textField_devolver);
		textField_devolver.setColumns(10);

		btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(315, 218, 97, 25);
		add(btnDevolver);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(52, 218, 97, 25);
		add(btnCancelar);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(380, 66, 89, 23);
		add(btnComprobar);
	}

	public JButton getBtnComprobar() {
		return btnComprobar;
	}

	public void setBtnComprobar(JButton btnComprobar) {
		this.btnComprobar = btnComprobar;
	}

	public JTextField getTextField_total() {
		return textField_total;
	}

	public void setTextField_total(JTextField textField_total) {
		this.textField_total = textField_total;
	}

	public JTextField getTextField_introducido() {
		return textField_introducido;
	}

	public void setTextField_introducido(JTextField textField_introducido) {
		this.textField_introducido = textField_introducido;
	}

	public JTextField getTextField_devolver() {
		return textField_devolver;
	}

	public void setTextField_devolver(JTextField textField_devolver) {
		this.textField_devolver = textField_devolver;
	}

	public JButton getbtnDevolver() {
		return (this.btnDevolver);
	}

	public void setbtnDevolver() {
		this.btnDevolver.setText("Devolver");
	}

	public JButton getbtnCancelar() {
		return (this.btnCancelar);
	}

	public void setbtnCancelar() {
		this.btnCancelar.setText("Cancelar");
	}

}