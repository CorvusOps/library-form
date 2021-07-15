package gui.frame.panels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import declarations.Book;
import declarations.ISBN;

public class BookLibTableModel extends AbstractTableModel{
	
	protected BookLibPanel bookPanel;
	
	private static List<Book> currentValue;

	@Override
	public int getColumnCount() {
		return 3;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex) {
		case 0:
			return "Book Code";
			
		case 1:
			return "ISBN";	

		case 2:
			return "Location Description";
		
		default:
			return null;
		
		}
	}

	@Override
	public int getRowCount() {
		if(currentValue == null)
			return 0;
		
		return currentValue.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
