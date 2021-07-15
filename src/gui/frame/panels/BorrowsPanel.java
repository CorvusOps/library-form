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

import execs.BookEXE;
import execs.BorrowFormCRUD;
import execs.BorrowFormEXE;

public class BorrowsPanel extends JPanel {
	
	private JTable jtblform;
	
	protected BorrowFormCRUD formRepository;

	/**
	 * Create the panel.
	 */
	public BorrowsPanel() {
		
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
		
		JLabel lblNewLabel = new JLabel("Borrow Form Panel");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 10, 0));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
		lblNewLabel.setAlignmentY(0.0f);
		jpnlHeader.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentX(0.0f);
		add(scrollPane);
		
		jtblform = new JTable();
		jtblform.setRowHeight(25);
		jtblform.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 
		
		String[] arrColumnNames = {"FormID", "accountID", "bookCode", "Start_Date", "Due_Date", "Returned_Date", "Fine", "IssuedBy"};
		DefaultTableModel objtableModel = new DefaultTableModel(arrColumnNames, 0);
		BorrowFormEXE.ReadBorrowFormTable(objtableModel);
		jtblform.setModel(objtableModel);
		
		
		//accountTableModel = new AccountTableModel();
		//accountTableModel.accountPanel = this;
		//jtblAccounts.setModel(accountTableModel);
		
		
		scrollPane.setViewportView(jtblform);

	}

}
