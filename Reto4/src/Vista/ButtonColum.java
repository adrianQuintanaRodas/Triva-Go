package Vista;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import Modelo.Hotel;

public class ButtonColum extends JFrame {
	public ButtonColum() {
		super("Boton princiipal");
		/*
		 */
		ArrayList<Hotel> hotel1=new ArrayList<>();
		
		
		
		
		Object[][] data = { { "1", "Mach", new Integer(2013), "78" }, { "2", "Mach1", new Integer(2014), "781" },
				{ "3", "Mach3", new Integer(2015), "782" }, { "4", "Mach4", new Integer(2016), "783" },
				{ "5", "Mach5", new Integer(2016), "784" },

		};

		// Cabezado de la columnas
		String columnHeaders[] = { "Postiion", "Team", "Last year", "numero" };
		// Creartabla
		JTable tablita = new JTable(data, columnHeaders);
		// Meter boton a una celda
		tablita.getColumnModel().getColumn(1).setCellRenderer(new ButtonRenderer());
		// Meter el editor
		tablita.getColumnModel().getColumn(1).setCellEditor(new ButtonEditor(new JTextField()));
		;

		// JScroll panel
		JScrollPane pane = new JScrollPane(tablita);
		getContentPane().add(pane);
		setSize(450, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		ButtonColum bc=new ButtonColum();
		bc.setVisible(true);
	}

	class ButtonRenderer extends JButton implements TableCellRenderer {
//CONTRUCTOR DEL BOTONRENDERER
		public ButtonRenderer() {
			// PONER LASPROPIEDADES DEL BOTON
			setOpaque(true);
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object obj, boolean selected, boolean focused,
				int row, int column) {

			setText((obj == null) ? "" : obj.toString());
			;

			return this;
		}

	}

//Butoon editor class
	class ButtonEditor extends DefaultCellEditor {
		protected JButton btn;
		private String lbl;
		private Boolean clicked;

		public ButtonEditor(JTextField txt) {
			super(txt);
			btn = new JButton();
			btn.setOpaque(true);
			// Cuando se hara click
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					fireEditingStopped();
				}
			});

		}

		// overrride es un metodo
		@Override
		public Component getTableCellEditorComponent(JTable table, Object obj, boolean selected, int row, int column) {
			// TODO Auto-generated method stub
			lbl = (obj == null) ? "" : obj.toString();
			btn.setText(lbl);
			clicked = true;
			return btn;
		}

		// Si el valor de la fila cambia,si haces click en este
		@Override
		public Object getCellEditorValue() {
			if (clicked) {
				JOptionPane.showMessageDialog(btn, lbl + "Clicked");
			}
			// Si es falso ahora eha y le das c lick
			clicked = false;

			return new String(lbl);

		}

		@Override
		public boolean stopCellEditing() {
			clicked = false;
			return super.stopCellEditing();
		}

		@Override
		protected void fireEditingStopped() {
			// TODO Auto-generated method stub
			super.fireEditingStopped();
		}

	}
}
