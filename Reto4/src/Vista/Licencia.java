package Vista;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

	private static final long serialVersionUID = 1L;
	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;

	public Licencia() {
		setLayout(null);
		setTitle("Licencia de Uso");
		setIconImage(new ImageIcon(getClass().getResource("C:\\Users\\IN1DM3B_08\\Desktop\\Licencia.png")).getImage());

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(215, 5, 200, 30);
		label1.setFont(new Font("Andale Mono", 1, 14));
		label1.setForeground(new Color(0, 0, 0));
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBounds(215, 5, 200, 30);
		textarea1.setFont(new Font("Andale Mono", 1, 9));
		textarea1.setText("Terminos y condiciones");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 40, 475, 200);
		add(scrollpane1);

		check1 = new JCheckBox("Acepto los términos.");
		check1.setBounds(10, 250, 300, 30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1=new JButton("Continuar");
		boton1.setBounds(10,290,300,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
		
		boton2=new JButton("No Acepto");
		boton2.setBounds(120,250,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
		ImageIcon imagen=new ImageIcon("C:\\Users\\IN1DM3B_08\\Desktop\\Licencia.png");
		label2=new JLabel(imagen);
		label2.setBounds(315, 135, 300, 300);
		add(label2);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Licencia ventanaLicencia=new Licencia();
		ventanaLicencia.setBounds(0,0,600,360);
		ventanaLicencia.setVisible(true);
		ventanaLicencia.setResizable(false);
		ventanaLicencia.setLocationRelativeTo(null);
	}

}
