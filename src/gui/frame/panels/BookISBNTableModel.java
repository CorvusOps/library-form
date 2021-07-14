package gui.frame.panels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import declarations.Account;
import declarations.ISBN;

public class BookISBNTableModel extends AbstractTableModel{
	
	protected BookISBNPanel isbnPanel;
	
	private static List<ISBN> currentValue;

	@Override
	public int getColumnCount() {
		return 7;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex) {
		case 0:
			return "#";
			
		case 1:
			return "ISBN";	

		case 2:
			return "Book Name";
			
		case 3:
			return "Description";
		
		case 4:
			return "Edition";

		case 5:
			return "Publication Year";

		case 6:
			return "Author";
			
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
