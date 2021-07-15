package gui.dialog;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import declarations.BorrowForm;
import execs.BorrowFormEXE;
import general.classComboItem;
import gui.LibrarianPage;

@SuppressWarnings("serial")
public class FormDialog extends JDialog {

	private final JPanel AccountDetailPanel = new JPanel();
	private JTextField jtxtfieldStartDate;
	private JTextField jtxtfieldDueDate;
	private JTextField jtxtfieldReturnDate;
	private JTextField jtxtfieldFine;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormDialog dialog = new FormDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormDialog() {
		getContentPane().setBackground(new Color(255, 228, 181));
		setBounds(100, 100, 450, 650);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{436, 0};
		gridBagLayout.rowHeights = new int[]{0, 232, 0, 0, 0, 31, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		
			JPanel ImagePanel = new JPanel();
			ImagePanel.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
			ImagePanel.setBackground(new Color(255, 255, 255));
			GridBagConstraints gbc_ImagePanel = new GridBagConstraints();
			gbc_ImagePanel.insets = new Insets(0, 0, 5, 0);
			gbc_ImagePanel.fill = GridBagConstraints.BOTH;
			gbc_ImagePanel.gridx = 0;
			gbc_ImagePanel.gridy = 0;
			getContentPane().add(ImagePanel, gbc_ImagePanel);
			
			JLabel jlblImageLabel = new JLabel("");
			Image AddBorrowFormLogoImage = new ImageIcon(this.getClass().getResource("/BorrowFormLogo250px.png")).getImage();
			jlblImageLabel.setIcon(new ImageIcon(AddBorrowFormLogoImage));
			ImagePanel.add(jlblImageLabel);
	
		
		AccountDetailPanel.setBackground(new Color(255, 228, 181));
		AccountDetailPanel.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_AccountDetailPanel = new GridBagConstraints();
		gbc_AccountDetailPanel.anchor = GridBagConstraints.NORTH;
		gbc_AccountDetailPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_AccountDetailPanel.insets = new Insets(0, 0, 5, 0);
		gbc_AccountDetailPanel.gridx = 0;
		gbc_AccountDetailPanel.gridy = 1;
		getContentPane().add(AccountDetailPanel, gbc_AccountDetailPanel);
		GridBagLayout gbl_AccountDetailPanel = new GridBagLayout();
		gbl_AccountDetailPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_AccountDetailPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_AccountDetailPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_AccountDetailPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		AccountDetailPanel.setLayout(gbl_AccountDetailPanel);
		
			JLabel jlblAccountDetail = new JLabel("Accounts' Personal Details");
			GridBagConstraints gbc_jlblAccountDetail = new GridBagConstraints();
			gbc_jlblAccountDetail.gridwidth = 6;
			gbc_jlblAccountDetail.insets = new Insets(0, 0, 5, 0);
			gbc_jlblAccountDetail.gridx = 0;
			gbc_jlblAccountDetail.gridy = 0;
			AccountDetailPanel.add(jlblAccountDetail, gbc_jlblAccountDetail);
		
		
			JLabel jlblAccountIDLabel = new JLabel("Account Name:");
			GridBagConstraints gbc_jlblAccountIDLabel = new GridBagConstraints();
			gbc_jlblAccountIDLabel.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAccountIDLabel.anchor = GridBagConstraints.EAST;
			gbc_jlblAccountIDLabel.gridx = 0;
			gbc_jlblAccountIDLabel.gridy = 1;
			AccountDetailPanel.add(jlblAccountIDLabel, gbc_jlblAccountIDLabel);
		
		
			JComboBox jcmbAccountID = new JComboBox();
			GridBagConstraints gbc_jcmbAccoutID = new GridBagConstraints();
			gbc_jcmbAccoutID.gridwidth = 5;
			gbc_jcmbAccoutID.insets = new Insets(0, 0, 5, 0);
			gbc_jcmbAccoutID.fill = GridBagConstraints.HORIZONTAL;
			gbc_jcmbAccoutID.gridx = 1;
			gbc_jcmbAccoutID.gridy = 1;
			AccountDetailPanel.add(jcmbAccountID, gbc_jcmbAccoutID);
			BorrowFormEXE.RetrieveAccount("account_table", jcmbAccountID);
		
		
			JLabel jlblPartition = new JLabel("-----------------------------------------------------------------------------------------------------");
			GridBagConstraints gbc_jlblPartition = new GridBagConstraints();
			gbc_jlblPartition.gridwidth = 6;
			gbc_jlblPartition.insets = new Insets(0, 0, 5, 0);
			gbc_jlblPartition.gridx = 0;
			gbc_jlblPartition.gridy = 3;
			AccountDetailPanel.add(jlblPartition, gbc_jlblPartition);
		
		
			JLabel jlblBookLabel = new JLabel("Book Label");
			GridBagConstraints gbc_jlblBookLabel = new GridBagConstraints();
			gbc_jlblBookLabel.gridwidth = 6;
			gbc_jlblBookLabel.insets = new Insets(0, 0, 5, 0);
			gbc_jlblBookLabel.gridx = 0;
			gbc_jlblBookLabel.gridy = 4;
			AccountDetailPanel.add(jlblBookLabel, gbc_jlblBookLabel);
		
		
			JLabel jlblBookCode = new JLabel("Title & ISBN");
			GridBagConstraints gbc_jlblBookCode = new GridBagConstraints();
			gbc_jlblBookCode.anchor = GridBagConstraints.EAST;
			gbc_jlblBookCode.insets = new Insets(0, 0, 5, 5);
			gbc_jlblBookCode.gridx = 0;
			gbc_jlblBookCode.gridy = 5;
			AccountDetailPanel.add(jlblBookCode, gbc_jlblBookCode);
		
		
			JComboBox jcmbBook = new JComboBox();
			GridBagConstraints gbc_jcmbBookCode = new GridBagConstraints();
			gbc_jcmbBookCode.gridwidth = 5;
			gbc_jcmbBookCode.insets = new Insets(0, 0, 5, 5);
			gbc_jcmbBookCode.fill = GridBagConstraints.HORIZONTAL;
			gbc_jcmbBookCode.gridx = 1;
			gbc_jcmbBookCode.gridy = 5;
			AccountDetailPanel.add(jcmbBook, gbc_jcmbBookCode);
			BorrowFormEXE.RetrieveBook("isbn_table", jcmbBook);
		
			JPanel BorrowformPannel = new JPanel();
			BorrowformPannel.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
			BorrowformPannel.setBackground(new Color(255, 228, 181));
			GridBagConstraints gbc_BorrowformPannel = new GridBagConstraints();
			gbc_BorrowformPannel.insets = new Insets(0, 0, 5, 0);
			gbc_BorrowformPannel.fill = GridBagConstraints.BOTH;
			gbc_BorrowformPannel.gridx = 0;
			gbc_BorrowformPannel.gridy = 3;
			getContentPane().add(BorrowformPannel, gbc_BorrowformPannel);
			GridBagLayout gbl_BorrowformPannel = new GridBagLayout();
			gbl_BorrowformPannel.columnWidths = new int[]{0, 0, 0};
			gbl_BorrowformPannel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_BorrowformPannel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_BorrowformPannel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			BorrowformPannel.setLayout(gbl_BorrowformPannel);
			
				JLabel jlblBorrowFormDetails = new JLabel("Borrowed Book Details");
				GridBagConstraints gbc_jlblBorrowFormDetails = new GridBagConstraints();
				gbc_jlblBorrowFormDetails.gridwidth = 2;
				gbc_jlblBorrowFormDetails.insets = new Insets(0, 0, 5, 0);
				gbc_jlblBorrowFormDetails.gridx = 0;
				gbc_jlblBorrowFormDetails.gridy = 0;
				BorrowformPannel.add(jlblBorrowFormDetails, gbc_jlblBorrowFormDetails);
			
			
				JLabel jlblStartDate = new JLabel("Start Date:");
				GridBagConstraints gbc_jlblStartDate = new GridBagConstraints();
				gbc_jlblStartDate.anchor = GridBagConstraints.EAST;
				gbc_jlblStartDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblStartDate.gridx = 0;
				gbc_jlblStartDate.gridy = 1;
				BorrowformPannel.add(jlblStartDate, gbc_jlblStartDate);
			
			
				jtxtfieldStartDate = new JTextField();
				GridBagConstraints gbc_jtxtfieldStartDate = new GridBagConstraints();
				gbc_jtxtfieldStartDate.insets = new Insets(0, 0, 5, 0);
				gbc_jtxtfieldStartDate.fill = GridBagConstraints.HORIZONTAL;
				gbc_jtxtfieldStartDate.gridx = 1;
				gbc_jtxtfieldStartDate.gridy = 1;
				BorrowformPannel.add(jtxtfieldStartDate, gbc_jtxtfieldStartDate);
				jtxtfieldStartDate.setColumns(10);
			
			
				JLabel jlblDueDate = new JLabel("Due Date:");
				GridBagConstraints gbc_jlblDueDate = new GridBagConstraints();
				gbc_jlblDueDate.anchor = GridBagConstraints.EAST;
				gbc_jlblDueDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblDueDate.gridx = 0;
				gbc_jlblDueDate.gridy = 2;
				BorrowformPannel.add(jlblDueDate, gbc_jlblDueDate);
			
			
				jtxtfieldDueDate = new JTextField();
				GridBagConstraints gbc_jtxtfieldDueDate = new GridBagConstraints();
				gbc_jtxtfieldDueDate.insets = new Insets(0, 0, 5, 0);
				gbc_jtxtfieldDueDate.fill = GridBagConstraints.HORIZONTAL;
				gbc_jtxtfieldDueDate.gridx = 1;
				gbc_jtxtfieldDueDate.gridy = 2;
				BorrowformPannel.add(jtxtfieldDueDate, gbc_jtxtfieldDueDate);
				jtxtfieldDueDate.setColumns(10);
			
			
				JLabel jlblReturnDate = new JLabel("Return Date:");
				GridBagConstraints gbc_jlblReturnDate = new GridBagConstraints();
				gbc_jlblReturnDate.anchor = GridBagConstraints.EAST;
				gbc_jlblReturnDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblReturnDate.gridx = 0;
				gbc_jlblReturnDate.gridy = 3;
				BorrowformPannel.add(jlblReturnDate, gbc_jlblReturnDate);
			
			
				jtxtfieldReturnDate = new JTextField();
				GridBagConstraints gbc_jtxtfieldReturnDate = new GridBagConstraints();
				gbc_jtxtfieldReturnDate.insets = new Insets(0, 0, 5, 0);
				gbc_jtxtfieldReturnDate.fill = GridBagConstraints.HORIZONTAL;
				gbc_jtxtfieldReturnDate.gridx = 1;
				gbc_jtxtfieldReturnDate.gridy = 3;
				BorrowformPannel.add(jtxtfieldReturnDate, gbc_jtxtfieldReturnDate);
				jtxtfieldReturnDate.setColumns(10);
			
			
				JLabel jlblFine = new JLabel("Fine:");
				GridBagConstraints gbc_jlblFine = new GridBagConstraints();
				gbc_jlblFine.anchor = GridBagConstraints.EAST;
				gbc_jlblFine.insets = new Insets(0, 0, 5, 5);
				gbc_jlblFine.gridx = 0;
				gbc_jlblFine.gridy = 4;
				BorrowformPannel.add(jlblFine, gbc_jlblFine);
			
			
				jtxtfieldFine = new JTextField();
				GridBagConstraints gbc_jtxtfieldFine = new GridBagConstraints();
				gbc_jtxtfieldFine.insets = new Insets(0, 0, 5, 0);
				gbc_jtxtfieldFine.fill = GridBagConstraints.HORIZONTAL;
				gbc_jtxtfieldFine.gridx = 1;
				gbc_jtxtfieldFine.gridy = 4;
				BorrowformPannel.add(jtxtfieldFine, gbc_jtxtfieldFine);
				jtxtfieldFine.setColumns(10);
			
			
				JLabel jlblIssuedBy = new JLabel("Issued By:");
				GridBagConstraints gbc_jlblIssuedBy = new GridBagConstraints();
				gbc_jlblIssuedBy.anchor = GridBagConstraints.EAST;
				gbc_jlblIssuedBy.insets = new Insets(0, 0, 5, 5);
				gbc_jlblIssuedBy.gridx = 0;
				gbc_jlblIssuedBy.gridy = 5;
				BorrowformPannel.add(jlblIssuedBy, gbc_jlblIssuedBy);
			
			
				JComboBox jcmbIssuedBy = new JComboBox();
				GridBagConstraints gbc_cmbIssuedBy = new GridBagConstraints();
				gbc_cmbIssuedBy.insets = new Insets(0, 0, 5, 0);
				gbc_cmbIssuedBy.fill = GridBagConstraints.HORIZONTAL;
				gbc_cmbIssuedBy.gridx = 1;
				gbc_cmbIssuedBy.gridy = 5;
				BorrowformPannel.add(jcmbIssuedBy, gbc_cmbIssuedBy);
				BorrowFormEXE.RetrieveLibrarian("account_table", jcmbIssuedBy);
			
		
		
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 228, 181));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 5;
			getContentPane().add(buttonPane, gbc_buttonPane);
			{
				JButton burrowButton = new JButton("Borrow");
				burrowButton.setActionCommand("OK");
				burrowButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						BorrowForm borrowform = new BorrowForm();
						Object account = jcmbAccountID.getSelectedItem();	
						Object book = jcmbBook.getSelectedItem();
						Object librarian = jcmbIssuedBy.getSelectedItem();	
						System.out.print( ((classComboItem)account).getValue() > 0);
						System.out.print(((classComboItem)book).getValue() > 0);
						System.out.print(((classComboItem)librarian).getValue() > 0);
						System.out.print(!jtxtfieldStartDate.getText().equals(""));
						System.out.print(!jtxtfieldDueDate.getText().equals(""));
						System.out.print(!jtxtfieldReturnDate.getText().equals(""));
						System.out.print(!jtxtfieldFine.getText().equals(""));
						
						boolean boolIsFilled = ((classComboItem)account).getValue() > 0 && 
											   ((classComboItem)book).getValue() > 0 &&
			  								   !jtxtfieldStartDate.getText().equals("") &&
											   !jtxtfieldDueDate.getText().equals("") &&
											   !jtxtfieldReturnDate.getText().equals("") &&
											   !jtxtfieldFine.getText().equals("") &&
											   ((classComboItem)librarian).getValue() > 0 ; 
						try {
							if (boolIsFilled) {
								Date StartDate = new SimpleDateFormat("MM/dd/yyyy").parse(jtxtfieldStartDate.getText());
								java.sql.Date sqlStartDate = new java.sql.Date(StartDate.getTime());
								Date DueDate = new SimpleDateFormat("MM/dd/yyyy").parse(jtxtfieldDueDate.getText());
								java.sql.Date sqlDueDate = new java.sql.Date(DueDate.getTime());
								Date ReturnDate = new SimpleDateFormat("MM/dd/yyyy").parse(jtxtfieldReturnDate.getText());
								java.sql.Date sqlReturnDate = new java.sql.Date(ReturnDate.getTime());
								float fine = Float.parseFloat(jtxtfieldFine.getText());
								
								BorrowFormEXE.setValues(borrowform,
										((classComboItem)account).getValue(),
										((classComboItem)book).getValue(),
										sqlStartDate,
										sqlDueDate,
										sqlReturnDate,
										fine,
										((classComboItem)librarian).getValue()
										);
								JOptionPane.showMessageDialog(null, BorrowFormEXE.exeInsertStatements(borrowform));
								setVisible(false);
								LibrarianPage pageLibrarian = new LibrarianPage();
								pageLibrarian.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "Please enter Required Credentials");
							}
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				buttonPane.add(burrowButton);
				getRootPane().setDefaultButton(burrowButton);
			}
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("Cancel");
			cancelButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Cancel Success.");
					LibrarianPage pageLibrarian = new LibrarianPage();
					pageLibrarian.setVisible(true);
				}
			});
			buttonPane.add(cancelButton);		
	}

}
