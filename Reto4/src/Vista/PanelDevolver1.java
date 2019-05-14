package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelDevolver1 extends JPanel {
	private JTextField textField;

	
	public PanelDevolver1() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(188, 152, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("COSASSSSSASADmsidfjgio");
		lblNewLabel.setBounds(188, 89, 46, 14);
		add(lblNewLabel);

	}
}
