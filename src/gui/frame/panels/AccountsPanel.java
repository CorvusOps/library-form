package gui.frame.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import execs.AccountEXE;

@SuppressWarnings("serial")
public class AccountsPanel extends JPanel {
	
	private JTable jtblAccounts;
	
	/**
	 * Create the panel.
	 */
	public AccountsPanel() {
		
		
		setBackground(new Color(255, 255, 255));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setPreferredSize(new Dimension(625, 400));
		setMinimumSize(new Dimension(625, 400));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel jpnlHeader = new JPanel();
		jpnlHeader.setBackground(new Color(255, 255, 255));
		jpnlHeader.setAlignmentX(0.0f);
		jpnlHeader.setAlignmentY(0.0f);
		add(jpnlHeader);
		jpnlHeader.setLayout(new BoxLayout(jpnlHeader, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Account Panel");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 10, 0));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
		lblNewLabel.setAlignmentY(0.0f);
		jpnlHeader.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentX(0.0f);
		add(scrollPane);
		
		jtblAccounts = new JTable();
		jtblAccounts.setRowHeight(25);
		jtblAccounts.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		
		
		String[] arrColumnNames = {"Account ID", "Account Name", "Address", "City", "Province", "Country", "Role", "Contact Number", "Email"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		AccountEXE.ReadAccountTable(objtableModel);
		jtblAccounts.setModel(objtableModel);
		
		
		//accountTableModel = new AccountTableModel();
		//accountTableModel.accountPanel = this;
		//jtblAccounts.setModel(accountTableModel);
		
		
		scrollPane.setViewportView(jtblAccounts);
	}
	


	

}
