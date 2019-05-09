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
		textField.setText("12");
		textField.setEditable(false);
		textField.setBounds(86, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblVueltas = new JLabel("Vueltas:");
		lblVueltas.setBounds(30, 42, 46, 14);
		contentPane.add(lblVueltas);

		JTextArea txtrSh = new JTextArea();
		txtrSh.setEditable(false);
		int x = Integer.parseInt(textField.getText());

		String cambios = "Se te devolvera: \n";
		String a, b, c, d, e, f, g, h, i, j;
		/*do {
			int cont = 0;
			cont++;
			a = cont + " billetes de 10€\n";
			if (cont > 0) {
				cambios = cambios + a;
			}
		} while (x > 10);
		do {
			int cont = 0;
			cont++;
			b = cont + " billetes de 5€\n";
			if (cont > 0) {
				cambios = cambios + b;
			}
		} while (x > 5);
		do {
			int cont = 0;
			cont++;
			c = cont + " monedas de 2€\n";
			if (cont > 0) {
				cambios = cambios + c;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			d = cont + " monedas de 1€\n";
			if (cont > 0) {
				cambios = cambios + d;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			e = cont + " monedas de 0,50€\n";
			if (cont > 0) {
				cambios = cambios + e;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			f = cont + " monedas de 0,20€\n";
			if (cont > 0) {
				cambios = cambios + f;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			g = cont + " monedas de 0,10€\n";
			if (cont > 0) {
				cambios = cambios + g;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			h = cont + " monedas de 0,05€\n";
			if (cont > 0) {
				cambios = cambios + h;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			i = cont + " monedas de 0,02€\n";
			if (cont > 0) {
				cambios = cambios + i;
			}
		} while (x > 2);
		do {
			int cont = 0;
			cont++;
			j = cont + " monedas de 0,01€\n";
			if (cont > 0) {
				cambios = cambios + j;
			}
		} while (x > 2);*/
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
