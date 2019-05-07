package Vista;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class PanelPresentacion extends JPanel {

	private JButton btnPresentacionTermibus;
	
	public PanelPresentacion() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		btnPresentacionTermibus = new JButton("Comenzar");
		btnPresentacionTermibus.setBounds(186, 281, 111, 23);
		add(btnPresentacionTermibus);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\IN1DM3B_08\\Downloads\\TrivaGO.png"));
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

