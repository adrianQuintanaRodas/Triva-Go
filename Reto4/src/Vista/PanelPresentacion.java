package Vista;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class PanelPresentacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnPresentacionTermibus;

	public PanelPresentacion() {
		setBackground(Color.WHITE);
		setLayout(null);

		btnPresentacionTermibus = new JButton("Comenzar");
		btnPresentacionTermibus.setBounds(186, 281, 111, 23);
		add(btnPresentacionTermibus);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Imagenes/TrivaGO.jpg"));
		lblNewLabel.setBounds(90, 47, 284, 219);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO!!\r\n");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(128, 11, 182, 53);
		add(lblNewLabel_1);
	}

	public JButton getbtnPresentacionTermibus() {
		return (this.btnPresentacionTermibus);
	}

	public void setbtnPresentacionTermibus() {
		this.btnPresentacionTermibus.setText("TrivaGo");
	}
}