package gui.dialog;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import declarations.Book;
import execs.BookEXE;
import general.classComboItem;
import gui.BorrowerPage;
import gui.LibrarianPage;

@SuppressWarnings("serial")
public class AddBookDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField jtxtfieldLocDescription;
	private JComboBox cmbISBNcomboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddBookDialog dialog = new AddBookDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddBookDialog() {
		setMinimumSize(new Dimension(500, 500));
		setBounds(new Rectangle(0, 0, 500, 500));
		setTitle("Add ISBN");
		setBounds(100, 100, 500, 292);
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
		gbl_contentPanel.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		{
			JLabel jlblISBN = new JLabel("ISBN:");
			jlblISBN.setHorizontalAlignment(SwingConstants.TRAILING);
			jlblISBN.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			jlblISBN.setAlignmentX(Component.RIGHT_ALIGNMENT);
			GridBagConstraints gbc_jlblISBN = new GridBagConstraints();
			gbc_jlblISBN.anchor = GridBagConstraints.EAST;
			gbc_jlblISBN.insets = new Insets(0, 0, 5, 5);
			gbc_jlblISBN.gridx = 0;
			gbc_jlblISBN.gridy = 0;
			contentPanel.add(jlblISBN, gbc_jlblISBN);
		}
		
			JComboBox cmbISBNcomboBox = new JComboBox();
			GridBagConstraints gbc_cmbISBN = new GridBagConstraints();
			gbc_cmbISBN.gridwidth = 2;
			gbc_cmbISBN.insets = new Insets(0, 0, 5, 5);
			gbc_cmbISBN.fill = GridBagConstraints.HORIZONTAL;
			gbc_cmbISBN.gridx = 1;
			gbc_cmbISBN.gridy = 0;
			contentPanel.add(cmbISBNcomboBox, gbc_cmbISBN);
			BookEXE.RetrieveISBN("isbn_table", cmbISBNcomboBox);
		
		{
			JLabel jlblLocDescription = new JLabel("Location Description:");
			jlblLocDescription.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblLocDescription = new GridBagConstraints();
			gbc_jlblLocDescription.anchor = GridBagConstraints.EAST;
			gbc_jlblLocDescription.insets = new Insets(0, 0, 5, 5);
			gbc_jlblLocDescription.gridx = 0;
			gbc_jlblLocDescription.gridy = 2;
			contentPanel.add(jlblLocDescription, gbc_jlblLocDescription);
		}
		{
			jtxtfieldLocDescription = new JTextField();
			GridBagConstraints gbc_jtxtfieldLocDescription = new GridBagConstraints();
			gbc_jtxtfieldLocDescription.gridwidth = 2;
			gbc_jtxtfieldLocDescription.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldLocDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldLocDescription.gridx = 1;
			gbc_jtxtfieldLocDescription.gridy = 2;
			contentPanel.add(jtxtfieldLocDescription, gbc_jtxtfieldLocDescription);
			jtxtfieldLocDescription.setColumns(10);
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
				addButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Book book = new Book();
						Object isbn = cmbISBNcomboBox.getSelectedItem();	
						
						boolean boolIsFilled = ((classComboItem)isbn).getValue() > 0 && 
											!jtxtfieldLocDescription.getText().equals("");
						
			
						try {
							if (boolIsFilled) {
								
								BookEXE.setValues(book,
										((classComboItem)isbn).getValue(),
										jtxtfieldLocDescription.getText()
										);
								JOptionPane.showMessageDialog(null, BookEXE.exeInsertStatements(book));
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
				buttonPane.add(addButton);
				getRootPane().setDefaultButton(addButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Cancel Success.");
						BorrowerPage pageBorrower = new BorrowerPage();
						pageBorrower.setVisible(true);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
}


