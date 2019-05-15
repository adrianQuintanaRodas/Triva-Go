package Vista;

import javax.swing.*;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Licencia extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;

	public Licencia() {
		setLayout(null);
		setName("Licencia de Uso");

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(150, 5, 300, 30);
		label1.setFont(new Font("Andale Mono", 1, 18));
		label1.setForeground(new Color(0, 0, 0));
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBounds(215, 5, 200, 30);
		textarea1.setFont(new Font("Andale Mono", 1, 12));
		textarea1.setText("\n Terminos y condiciones\n"
				+ "\n a) Acepta que su ubicación sea usada para uso de localización de sus alojamientos."
				+ "\n b) Acepta el uso de sus datos para registro apropiado de sus reservas."
				+ "\n c) Acepta el que TrivaGo le envie promociones."
				+ "\n d) Acepta el uso de sus datos para las promociones de TrivaGo.\n"
				+ "\n Más información en www.trivaGo.com"

		);
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 40, 500, 200);
		add(scrollpane1);

		check1 = new JCheckBox("Acepto los términos.");
		check1.setBounds(10, 250, 300, 30);
		add(check1);

		boton2 = new JButton("No Acepto");
		boton2.setBounds(120, 290, 100, 30);
		boton2.setEnabled(true);
		add(boton2);

		ImageIcon imagen = new ImageIcon("C:\\Users\\IN1DM3B_08\\Desktop\\Licencia.png");
		label2 = new JLabel(imagen);
		label2.setBounds(315, 135, 300, 300);
		add(label2);

		boton1 = new JButton("Continuar");
		boton1.setEnabled(false);
		boton1.setBounds(10, 287, 100, 30);
		add(boton1);

	}

	public JCheckBox getCheck1() {
		return check1;
	}

	public void setCheck1(JCheckBox check1) {
		this.check1 = check1;
	}

	public JButton getBoton1() {
		return boton1;
	}

	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

}
