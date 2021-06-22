package gui.dialog;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddAccountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField jtxtfieldAccountName;
	private JTextField jtxtfieldAddress;
	private JTextField jtxtfieldCity;
	private JTextField jtxtfieldProvince;
	private JTextField jtxtfieldCountry;
	private JTextField jtxtfieldContNumber;
	private JTextField jtxtfieldEmail;
	private JTextField txtLibrarianBorrower;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddAccountDialog dialog = new AddAccountDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddAccountDialog() {
		setMinimumSize(new Dimension(500, 500));
		setBounds(new Rectangle(0, 0, 500, 500));
		setTitle("Add Account");
		setBounds(100, 100, 450, 287);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{436, 0};
		gridBagLayout.rowHeights = new int[]{219, 0, 31, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.insets = new Insets(0, 0, 5, 0);
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{132, 70, 96, 0};
		gbl_contentPanel.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel jlblAccountName = new JLabel("Accounts Name:");
			jlblAccountName.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			jlblAccountName.setAlignmentX(Component.RIGHT_ALIGNMENT);
			GridBagConstraints gbc_jlblAccountName = new GridBagConstraints();
			gbc_jlblAccountName.anchor = GridBagConstraints.EAST;
			gbc_jlblAccountName.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAccountName.gridx = 0;
			gbc_jlblAccountName.gridy = 0;
			contentPanel.add(jlblAccountName, gbc_jlblAccountName);
		}
		{
			jtxtfieldAccountName = new JTextField();
			GridBagConstraints gbc_jtxtfieldAccountName = new GridBagConstraints();
			gbc_jtxtfieldAccountName.gridwidth = 2;
			gbc_jtxtfieldAccountName.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldAccountName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldAccountName.gridx = 1;
			gbc_jtxtfieldAccountName.gridy = 0;
			contentPanel.add(jtxtfieldAccountName, gbc_jtxtfieldAccountName);
			jtxtfieldAccountName.setColumns(10);
		}
		{
			JLabel jlblAddress = new JLabel("Address:");
			jlblAddress.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblAddress = new GridBagConstraints();
			gbc_jlblAddress.anchor = GridBagConstraints.EAST;
			gbc_jlblAddress.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAddress.gridx = 0;
			gbc_jlblAddress.gridy = 2;
			contentPanel.add(jlblAddress, gbc_jlblAddress);
		}
		{
			jtxtfieldAddress = new JTextField();
			GridBagConstraints gbc_jtxtfieldAddress = new GridBagConstraints();
			gbc_jtxtfieldAddress.gridwidth = 2;
			gbc_jtxtfieldAddress.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldAddress.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldAddress.gridx = 1;
			gbc_jtxtfieldAddress.gridy = 2;
			contentPanel.add(jtxtfieldAddress, gbc_jtxtfieldAddress);
			jtxtfieldAddress.setColumns(10);
		}
		{
			JLabel jlblCity = new JLabel("City:");
			jlblCity.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblCity = new GridBagConstraints();
			gbc_jlblCity.anchor = GridBagConstraints.EAST;
			gbc_jlblCity.insets = new Insets(0, 0, 5, 5);
			gbc_jlblCity.gridx = 0;
			gbc_jlblCity.gridy = 3;
			contentPanel.add(jlblCity, gbc_jlblCity);
		}
		{
			jtxtfieldCity = new JTextField();
			GridBagConstraints gbc_jtxtfieldCity = new GridBagConstraints();
			gbc_jtxtfieldCity.gridwidth = 2;
			gbc_jtxtfieldCity.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldCity.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldCity.gridx = 1;
			gbc_jtxtfieldCity.gridy = 3;
			contentPanel.add(jtxtfieldCity, gbc_jtxtfieldCity);
			jtxtfieldCity.setColumns(10);
		}
		{
			JLabel jlblProvince = new JLabel("Province:");
			jlblProvince.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblProvince = new GridBagConstraints();
			gbc_jlblProvince.anchor = GridBagConstraints.EAST;
			gbc_jlblProvince.insets = new Insets(0, 0, 5, 5);
			gbc_jlblProvince.gridx = 0;
			gbc_jlblProvince.gridy = 4;
			contentPanel.add(jlblProvince, gbc_jlblProvince);
		}
		{
			jtxtfieldProvince = new JTextField();
			GridBagConstraints gbc_jtxtfieldProvince = new GridBagConstraints();
			gbc_jtxtfieldProvince.gridwidth = 2;
			gbc_jtxtfieldProvince.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldProvince.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldProvince.gridx = 1;
			gbc_jtxtfieldProvince.gridy = 4;
			contentPanel.add(jtxtfieldProvince, gbc_jtxtfieldProvince);
			jtxtfieldProvince.setColumns(10);
		}
		{
			JLabel jlblCountry = new JLabel("Country:");
			jlblCountry.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblCountry = new GridBagConstraints();
			gbc_jlblCountry.anchor = GridBagConstraints.EAST;
			gbc_jlblCountry.insets = new Insets(0, 0, 5, 5);
			gbc_jlblCountry.gridx = 0;
			gbc_jlblCountry.gridy = 5;
			contentPanel.add(jlblCountry, gbc_jlblCountry);
		}
		{
			jtxtfieldCountry = new JTextField();
			GridBagConstraints gbc_jtxtfieldCountry = new GridBagConstraints();
			gbc_jtxtfieldCountry.gridwidth = 2;
			gbc_jtxtfieldCountry.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldCountry.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldCountry.gridx = 1;
			gbc_jtxtfieldCountry.gridy = 5;
			contentPanel.add(jtxtfieldCountry, gbc_jtxtfieldCountry);
			jtxtfieldCountry.setColumns(10);
		}
		{
			JLabel jlblContNumber = new JLabel("Contact Number:");
			jlblContNumber.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblContNumber = new GridBagConstraints();
			gbc_jlblContNumber.anchor = GridBagConstraints.EAST;
			gbc_jlblContNumber.insets = new Insets(0, 0, 5, 5);
			gbc_jlblContNumber.gridx = 0;
			gbc_jlblContNumber.gridy = 7;
			contentPanel.add(jlblContNumber, gbc_jlblContNumber);
		}
		{
			jtxtfieldContNumber = new JTextField();
			GridBagConstraints gbc_jtxtfieldContNumber = new GridBagConstraints();
			gbc_jtxtfieldContNumber.gridwidth = 2;
			gbc_jtxtfieldContNumber.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldContNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldContNumber.gridx = 1;
			gbc_jtxtfieldContNumber.gridy = 7;
			contentPanel.add(jtxtfieldContNumber, gbc_jtxtfieldContNumber);
			jtxtfieldContNumber.setColumns(10);
		}
		{
			JLabel jlblEmail = new JLabel("Email Address:");
			jlblEmail.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblEmail = new GridBagConstraints();
			gbc_jlblEmail.anchor = GridBagConstraints.EAST;
			gbc_jlblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_jlblEmail.gridx = 0;
			gbc_jlblEmail.gridy = 8;
			contentPanel.add(jlblEmail, gbc_jlblEmail);
		}
		{
			jtxtfieldEmail = new JTextField();
			GridBagConstraints gbc_jtxtfieldEmail = new GridBagConstraints();
			gbc_jtxtfieldEmail.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldEmail.gridwidth = 2;
			gbc_jtxtfieldEmail.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldEmail.gridx = 1;
			gbc_jtxtfieldEmail.gridy = 8;
			contentPanel.add(jtxtfieldEmail, gbc_jtxtfieldEmail);
			jtxtfieldEmail.setColumns(10);
		}
		{
			JLabel jlblRole = new JLabel("Role:");
			jlblRole.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblRole = new GridBagConstraints();
			gbc_jlblRole.anchor = GridBagConstraints.EAST;
			gbc_jlblRole.insets = new Insets(0, 0, 0, 5);
			gbc_jlblRole.gridx = 0;
			gbc_jlblRole.gridy = 10;
			contentPanel.add(jlblRole, gbc_jlblRole);
		}
		{
			txtLibrarianBorrower = new JTextField();
			txtLibrarianBorrower.setAlignmentX(Component.RIGHT_ALIGNMENT);
			txtLibrarianBorrower.setText("Borrower");
			GridBagConstraints gbc_txtLibrarianBorrower = new GridBagConstraints();
			gbc_txtLibrarianBorrower.gridwidth = 2;
			gbc_txtLibrarianBorrower.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtLibrarianBorrower.gridx = 1;
			gbc_txtLibrarianBorrower.gridy = 10;
			contentPanel.add(txtLibrarianBorrower, gbc_txtLibrarianBorrower);
			txtLibrarianBorrower.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 2;
			getContentPane().add(buttonPane, gbc_buttonPane);
			{
				JButton addButton = new JButton("Add");
				addButton.setActionCommand("OK");
				buttonPane.add(addButton);
				getRootPane().setDefaultButton(addButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
