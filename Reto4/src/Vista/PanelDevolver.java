package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDevolver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public PanelDevolver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setText("60");
		textField.setEditable(false);
		textField.setBounds(86, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblVueltas = new JLabel("Vueltas:");
		lblVueltas.setBounds(30, 42, 46, 14);
		contentPane.add(lblVueltas);

		JTextArea txtrSh = new JTextArea();
		txtrSh.setEditable(false);
		double x = Double.parseDouble(textField.getText());
		System.out.println(x);
		String cambios = "Se te devolvera: \n";
		String a, b, c, d, e, f, g, h, i, j, z;
		int cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, cont05 = 0, cont02 = 0, cont01 = 0, cont005 = 0,
				cont002 = 0, cont001 = 0;
		while (x >= 20.0) {
			cont20++;
			x = x - 20;
		}
		;

		if (cont20 > 0) {
			z = cont20 + " billetes de 20€\n";
			cambios = cambios + z;
		}

		while (x >= 10) {
			cont10++;
			x = x - 10;
		}
		;

		if (cont10 > 0) {
			a = cont10 + " billetes de 10€\n";
			cambios = cambios + a;
		}

		while (x >= 5) {
			cont5++;

			x = x - 5;
		}
		;

		if (cont5 > 0) {
			b = cont5 + " billetes de 5€\n";
			cambios = cambios + b;
		}

		while (x >= 2) {
			cont2++;
			x = x - 2;
		}
		;

		if (cont2 > 0) {
			c = cont2 + " monedas de 2€\n";
			cambios = cambios + c;
		}

		while (x >= 1) {
			cont1++;
			x = x - 1;
		}
		;

		if (cont1 > 0) {
			d = cont1 + " monedas de 1€\n";
			cambios = cambios + d;
		}

		while (x >= 0.5) {
			cont05++;
			x = x - 0.5;
		}
		;

		if (cont05 > 0) {
			e = cont05 + " monedas de 0,50€\n";
			cambios = cambios + e;
		}

		while (x >= 0.2) {
			cont02++;

			x = x - 0.2;
		}
		;

		if (cont02 > 0) {
			f = cont02 + " monedas de 0,20€\n";
			cambios = cambios + f;
		}

		while (x >= 0.1) {
			cont01++;
			x = x - 0.1;
		}
		;

		if (cont01 > 0) {
			g = cont01 + " monedas de 0,10€\n";
			cambios = cambios + g;
		}

		while (x >= 0.05) {
			cont005++;
			x = x - 0.05;
		}
		;

		if (cont005 > 0) {
			h = cont005 + " monedas de 0,05€\n";
			cambios = cambios + h;
		}

		while (x >= 0.02) {
			cont002++;
			x = x - 0.02;
		}
		;

		if (cont002 > 0) {
			i = cont002 + " monedas de 0,02€\n";
			cambios = cambios + i;
		}

		while (x >= 0.01) {
			cont001++;
			x = x - 0.01;
		}
		;

		if (cont001 > 0) {
			j = cont001 + " monedas de 0,01€\n";
			cambios = cambios + j;
		}

		txtrSh.setText(cambios);
		txtrSh.setBounds(54, 70, 290, 132);
		contentPane.add(txtrSh);

		JButton btnTerminado = new JButton("Terminado");
		btnTerminado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnTerminado.setBounds(315, 227, 109, 23);
		contentPane.add(btnTerminado);
	}
}