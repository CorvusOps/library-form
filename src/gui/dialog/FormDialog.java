package gui.dialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class FormDialog extends JDialog {

	private final JPanel AccountDetailPanel = new JPanel();
	private JTextField jtxtfieldAccountID;
	private JTextField jtxtfieldAccountName;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField jtxtfieldBookName;
	private JTextField jtxtfieldBookCode;

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
		
		{
			JPanel ImagePanel = new JPanel();
			ImagePanel.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
			ImagePanel.setBackground(new Color(255, 255, 255));
			GridBagConstraints gbc_ImagePanel = new GridBagConstraints();
			gbc_ImagePanel.insets = new Insets(0, 0, 5, 0);
			gbc_ImagePanel.fill = GridBagConstraints.BOTH;
			gbc_ImagePanel.gridx = 0;
			gbc_ImagePanel.gridy = 0;
			getContentPane().add(ImagePanel, gbc_ImagePanel);
			{
				JLabel jlblImageLabel = new JLabel("");
				Image AddBorrowFormLogoImage = new ImageIcon(this.getClass().getResource("/BorrowFormLogo250px.png")).getImage();
				jlblImageLabel.setIcon(new ImageIcon(AddBorrowFormLogoImage));
				ImagePanel.add(jlblImageLabel);
				
			}
		}
		
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
		{
			JLabel jlblAccountDetail = new JLabel("Accounts' Personal Details");
			GridBagConstraints gbc_jlblAccountDetail = new GridBagConstraints();
			gbc_jlblAccountDetail.gridwidth = 6;
			gbc_jlblAccountDetail.insets = new Insets(0, 0, 5, 0);
			gbc_jlblAccountDetail.gridx = 0;
			gbc_jlblAccountDetail.gridy = 0;
			AccountDetailPanel.add(jlblAccountDetail, gbc_jlblAccountDetail);
		}
		{
			JLabel jlblAccountIDLabel = new JLabel("Account ID:");
			GridBagConstraints gbc_jlblAccountIDLabel = new GridBagConstraints();
			gbc_jlblAccountIDLabel.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAccountIDLabel.anchor = GridBagConstraints.EAST;
			gbc_jlblAccountIDLabel.gridx = 0;
			gbc_jlblAccountIDLabel.gridy = 1;
			AccountDetailPanel.add(jlblAccountIDLabel, gbc_jlblAccountIDLabel);
		}
		{
			jtxtfieldAccountID = new JTextField();
			GridBagConstraints gbc_jtxtfieldAccountID = new GridBagConstraints();
			gbc_jtxtfieldAccountID.gridwidth = 5;
			gbc_jtxtfieldAccountID.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldAccountID.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldAccountID.gridx = 1;
			gbc_jtxtfieldAccountID.gridy = 1;
			AccountDetailPanel.add(jtxtfieldAccountID, gbc_jtxtfieldAccountID);
			jtxtfieldAccountID.setColumns(10);
		}
		{
			JLabel jlblAccountName = new JLabel("Account Name:");
			GridBagConstraints gbc_jlblAccountName = new GridBagConstraints();
			gbc_jlblAccountName.anchor = GridBagConstraints.EAST;
			gbc_jlblAccountName.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAccountName.gridx = 0;
			gbc_jlblAccountName.gridy = 2;
			AccountDetailPanel.add(jlblAccountName, gbc_jlblAccountName);
		}
		{
			jtxtfieldAccountName = new JTextField();
			GridBagConstraints gbc_jtxtfieldAccountName = new GridBagConstraints();
			gbc_jtxtfieldAccountName.gridwidth = 5;
			gbc_jtxtfieldAccountName.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldAccountName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldAccountName.gridx = 1;
			gbc_jtxtfieldAccountName.gridy = 2;
			AccountDetailPanel.add(jtxtfieldAccountName, gbc_jtxtfieldAccountName);
			jtxtfieldAccountName.setColumns(10);
		}
		{
			JLabel jlblPartition = new JLabel("-----------------------------------------------------------------------------------------------------");
			GridBagConstraints gbc_jlblPartition = new GridBagConstraints();
			gbc_jlblPartition.gridwidth = 6;
			gbc_jlblPartition.insets = new Insets(0, 0, 5, 0);
			gbc_jlblPartition.gridx = 0;
			gbc_jlblPartition.gridy = 3;
			AccountDetailPanel.add(jlblPartition, gbc_jlblPartition);
		}
		{
			JLabel jlblBookLabel = new JLabel("Book Label");
			GridBagConstraints gbc_jlblBookLabel = new GridBagConstraints();
			gbc_jlblBookLabel.gridwidth = 6;
			gbc_jlblBookLabel.insets = new Insets(0, 0, 5, 0);
			gbc_jlblBookLabel.gridx = 0;
			gbc_jlblBookLabel.gridy = 4;
			AccountDetailPanel.add(jlblBookLabel, gbc_jlblBookLabel);
		}
		{
			JLabel jlblBookCode = new JLabel("Book Code:");
			GridBagConstraints gbc_jlblBookCode = new GridBagConstraints();
			gbc_jlblBookCode.anchor = GridBagConstraints.EAST;
			gbc_jlblBookCode.insets = new Insets(0, 0, 5, 5);
			gbc_jlblBookCode.gridx = 0;
			gbc_jlblBookCode.gridy = 5;
			AccountDetailPanel.add(jlblBookCode, gbc_jlblBookCode);
		}
		{
			jtxtfieldBookCode = new JTextField();
			GridBagConstraints gbc_jtxtfieldBookCode = new GridBagConstraints();
			gbc_jtxtfieldBookCode.gridwidth = 5;
			gbc_jtxtfieldBookCode.insets = new Insets(0, 0, 5, 5);
			gbc_jtxtfieldBookCode.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldBookCode.gridx = 1;
			gbc_jtxtfieldBookCode.gridy = 5;
			AccountDetailPanel.add(jtxtfieldBookCode, gbc_jtxtfieldBookCode);
			jtxtfieldBookCode.setColumns(10);
		}
		{
			JLabel jlblBookName = new JLabel("Book Name:");
			GridBagConstraints gbc_jlblBookName = new GridBagConstraints();
			gbc_jlblBookName.anchor = GridBagConstraints.EAST;
			gbc_jlblBookName.insets = new Insets(0, 0, 0, 5);
			gbc_jlblBookName.gridx = 0;
			gbc_jlblBookName.gridy = 6;
			AccountDetailPanel.add(jlblBookName, gbc_jlblBookName);
		}
		{
			jtxtfieldBookName = new JTextField();
			GridBagConstraints gbc_jtxtfieldBookName = new GridBagConstraints();
			gbc_jtxtfieldBookName.gridwidth = 5;
			gbc_jtxtfieldBookName.insets = new Insets(0, 0, 0, 5);
			gbc_jtxtfieldBookName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldBookName.gridx = 1;
			gbc_jtxtfieldBookName.gridy = 6;
			AccountDetailPanel.add(jtxtfieldBookName, gbc_jtxtfieldBookName);
			jtxtfieldBookName.setColumns(10);
		}
		{
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
			{
				JLabel jlblBorrowFormDetails = new JLabel("Borrowed Book Details");
				GridBagConstraints gbc_jlblBorrowFormDetails = new GridBagConstraints();
				gbc_jlblBorrowFormDetails.gridwidth = 2;
				gbc_jlblBorrowFormDetails.insets = new Insets(0, 0, 5, 0);
				gbc_jlblBorrowFormDetails.gridx = 0;
				gbc_jlblBorrowFormDetails.gridy = 0;
				BorrowformPannel.add(jlblBorrowFormDetails, gbc_jlblBorrowFormDetails);
			}
			{
				JLabel jlblStartDate = new JLabel("Start Date:");
				GridBagConstraints gbc_jlblStartDate = new GridBagConstraints();
				gbc_jlblStartDate.anchor = GridBagConstraints.EAST;
				gbc_jlblStartDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblStartDate.gridx = 0;
				gbc_jlblStartDate.gridy = 1;
				BorrowformPannel.add(jlblStartDate, gbc_jlblStartDate);
			}
			{
				textField_9 = new JTextField();
				GridBagConstraints gbc_textField_9 = new GridBagConstraints();
				gbc_textField_9.insets = new Insets(0, 0, 5, 0);
				gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_9.gridx = 1;
				gbc_textField_9.gridy = 1;
				BorrowformPannel.add(textField_9, gbc_textField_9);
				textField_9.setColumns(10);
			}
			{
				JLabel jlblDueDate = new JLabel("Due Date:");
				GridBagConstraints gbc_jlblDueDate = new GridBagConstraints();
				gbc_jlblDueDate.anchor = GridBagConstraints.EAST;
				gbc_jlblDueDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblDueDate.gridx = 0;
				gbc_jlblDueDate.gridy = 2;
				BorrowformPannel.add(jlblDueDate, gbc_jlblDueDate);
			}
			{
				textField_10 = new JTextField();
				GridBagConstraints gbc_textField_10 = new GridBagConstraints();
				gbc_textField_10.insets = new Insets(0, 0, 5, 0);
				gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_10.gridx = 1;
				gbc_textField_10.gridy = 2;
				BorrowformPannel.add(textField_10, gbc_textField_10);
				textField_10.setColumns(10);
			}
			{
				JLabel jlblReturnDate = new JLabel("Return Date:");
				GridBagConstraints gbc_jlblReturnDate = new GridBagConstraints();
				gbc_jlblReturnDate.anchor = GridBagConstraints.EAST;
				gbc_jlblReturnDate.insets = new Insets(0, 0, 5, 5);
				gbc_jlblReturnDate.gridx = 0;
				gbc_jlblReturnDate.gridy = 3;
				BorrowformPannel.add(jlblReturnDate, gbc_jlblReturnDate);
			}
			{
				textField_11 = new JTextField();
				GridBagConstraints gbc_textField_11 = new GridBagConstraints();
				gbc_textField_11.insets = new Insets(0, 0, 5, 0);
				gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_11.gridx = 1;
				gbc_textField_11.gridy = 3;
				BorrowformPannel.add(textField_11, gbc_textField_11);
				textField_11.setColumns(10);
			}
			{
				JLabel jlblFine = new JLabel("Fine:");
				GridBagConstraints gbc_jlblFine = new GridBagConstraints();
				gbc_jlblFine.anchor = GridBagConstraints.EAST;
				gbc_jlblFine.insets = new Insets(0, 0, 5, 5);
				gbc_jlblFine.gridx = 0;
				gbc_jlblFine.gridy = 4;
				BorrowformPannel.add(jlblFine, gbc_jlblFine);
			}
			{
				textField_12 = new JTextField();
				GridBagConstraints gbc_textField_12 = new GridBagConstraints();
				gbc_textField_12.insets = new Insets(0, 0, 5, 0);
				gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_12.gridx = 1;
				gbc_textField_12.gridy = 4;
				BorrowformPannel.add(textField_12, gbc_textField_12);
				textField_12.setColumns(10);
			}
			{
				JLabel jlblIssuedBy = new JLabel("Issued By:");
				GridBagConstraints gbc_jlblIssuedBy = new GridBagConstraints();
				gbc_jlblIssuedBy.anchor = GridBagConstraints.EAST;
				gbc_jlblIssuedBy.insets = new Insets(0, 0, 5, 5);
				gbc_jlblIssuedBy.gridx = 0;
				gbc_jlblIssuedBy.gridy = 5;
				BorrowformPannel.add(jlblIssuedBy, gbc_jlblIssuedBy);
			}
			{
				textField_13 = new JTextField();
				GridBagConstraints gbc_textField_13 = new GridBagConstraints();
				gbc_textField_13.insets = new Insets(0, 0, 5, 0);
				gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_13.gridx = 1;
				gbc_textField_13.gridy = 5;
				BorrowformPannel.add(textField_13, gbc_textField_13);
				textField_13.setColumns(10);
			}
		}
		{
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
				buttonPane.add(burrowButton);
				getRootPane().setDefaultButton(burrowButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
