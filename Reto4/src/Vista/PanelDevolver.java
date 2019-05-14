package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDevolver extends JPanel {

	private JPanel contentPane;
	public JTextField textField_1;
	private JTextField textField_vueltas;

	public PanelDevolver() {
		setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(120, 47, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);

		JLabel lblNewLabel = new JLabel("Vueltas:");
		lblNewLabel.setBounds(40, 50, 46, 14);
		add(lblNewLabel);
		
		textField_vueltas = new JTextField();
		textField_vueltas.setBounds(30, 88, 391, 150);
		add(textField_vueltas);
		textField_vueltas.setColumns(10);
		

	}

	public JTextField getTextField_vueltas() {
		return textField_vueltas;
	}

	public void setTextField_vueltas(JTextField textField_vueltas) {
		this.textField_vueltas = textField_vueltas;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
}