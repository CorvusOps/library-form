package gui.frame.panels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import declarations.Account;

@SuppressWarnings("serial")
public class AccountTableModel extends AbstractTableModel{
	
	protected AccountsPanel accountPanel;
	
	private static List<Account> currentValue;

	@Override
	public int getColumnCount() {
		return 9;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex) {
		case 0:
			return "Account ID";
			
		case 1:
			return "Account Name";	

		case 2:
			return "Address";
			
		case 3:
			return "City";
		
		case 4:
			return "Province";

		case 5:
			return "Country";

		case 6:
			return "Role";

		case 7:
			return "Contact Number";

		case 8:
			return "Email";
			
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
