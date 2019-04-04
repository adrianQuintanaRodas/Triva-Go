package Vista;
import javax.swing.table.DefaultTableModel;

public class MModeloTabla extends DefaultTableModel{
	public MModeloTabla(Object[][] data, Object[] columNames) {
		super(data, columNames);
	}
	Class[] types=new Class[] {
			java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class
	};
	public Class getColumnClass(int columnIndex) {
		return types[columnIndex];
	}

}
