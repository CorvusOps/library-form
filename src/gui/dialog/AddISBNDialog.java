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
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import declarations.ISBN;
import execs.ISBNEXE;
import gui.BorrowerPage;
import gui.LibrarianPage;

@SuppressWarnings("serial")
public class AddISBNDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField jtxtfieldISBN;
	private JTextField jtxtfieldBookName;
	private JTextField jtxtfieldDescription;
	private JTextField jtxtfieldEdition;
	private JTextField jtxtfieldPubYear;
	private JTextField jtxtfieldAuthors;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddISBNDialog dialog = new AddISBNDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddISBNDialog() {
		setMinimumSize(new Dimension(500, 500));
		setBounds(new Rectangle(0, 0, 500, 500));
		setTitle("Add ISBN");
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
		{
			jtxtfieldISBN = new JTextField();
			GridBagConstraints gbc_jtxtfieldISBN = new GridBagConstraints();
			gbc_jtxtfieldISBN.gridwidth = 2;
			gbc_jtxtfieldISBN.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldISBN.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldISBN.gridx = 1;
			gbc_jtxtfieldISBN.gridy = 0;
			contentPanel.add(jtxtfieldISBN, gbc_jtxtfieldISBN);
			jtxtfieldISBN.setColumns(10);
		}
		{
			JLabel jlblBookName = new JLabel("BookName:");
			jlblBookName.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblBookName = new GridBagConstraints();
			gbc_jlblBookName.anchor = GridBagConstraints.EAST;
			gbc_jlblBookName.insets = new Insets(0, 0, 5, 5);
			gbc_jlblBookName.gridx = 0;
			gbc_jlblBookName.gridy = 1;
			contentPanel.add(jlblBookName, gbc_jlblBookName);
		}
		{
			jtxtfieldBookName = new JTextField();
			GridBagConstraints gbc_jtxtfieldBookName = new GridBagConstraints();
			gbc_jtxtfieldBookName.gridwidth = 2;
			gbc_jtxtfieldBookName.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldBookName.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldBookName.gridx = 1;
			gbc_jtxtfieldBookName.gridy = 1;
			contentPanel.add(jtxtfieldBookName, gbc_jtxtfieldBookName);
			jtxtfieldBookName.setColumns(10);
		}
		{
			JLabel jlblDescription = new JLabel("Description:");
			jlblDescription.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblDescription = new GridBagConstraints();
			gbc_jlblDescription.anchor = GridBagConstraints.EAST;
			gbc_jlblDescription.insets = new Insets(0, 0, 5, 5);
			gbc_jlblDescription.gridx = 0;
			gbc_jlblDescription.gridy = 2;
			contentPanel.add(jlblDescription, gbc_jlblDescription);
		}
		{
			jtxtfieldDescription = new JTextField();
			GridBagConstraints gbc_jtxtfieldDescription = new GridBagConstraints();
			gbc_jtxtfieldDescription.gridwidth = 2;
			gbc_jtxtfieldDescription.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldDescription.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldDescription.gridx = 1;
			gbc_jtxtfieldDescription.gridy = 2;
			contentPanel.add(jtxtfieldDescription, gbc_jtxtfieldDescription);
			jtxtfieldDescription.setColumns(10);
		}
		{
			JLabel jlblEdition = new JLabel("Edition:");
			jlblEdition.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblEdition = new GridBagConstraints();
			gbc_jlblEdition.anchor = GridBagConstraints.EAST;
			gbc_jlblEdition.insets = new Insets(0, 0, 5, 5);
			gbc_jlblEdition.gridx = 0;
			gbc_jlblEdition.gridy = 3;
			contentPanel.add(jlblEdition, gbc_jlblEdition);
		}
		{
			jtxtfieldEdition = new JTextField();
			GridBagConstraints gbc_jtxtfieldEdition = new GridBagConstraints();
			gbc_jtxtfieldEdition.gridwidth = 2;
			gbc_jtxtfieldEdition.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldEdition.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldEdition.gridx = 1;
			gbc_jtxtfieldEdition.gridy = 3;
			contentPanel.add(jtxtfieldEdition, gbc_jtxtfieldEdition);
			jtxtfieldEdition.setColumns(10);
		}
		{
			JLabel jlblPubYear = new JLabel("Publication Year:");
			jlblPubYear.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblPubYear = new GridBagConstraints();
			gbc_jlblPubYear.anchor = GridBagConstraints.EAST;
			gbc_jlblPubYear.insets = new Insets(0, 0, 5, 5);
			gbc_jlblPubYear.gridx = 0;
			gbc_jlblPubYear.gridy = 4;
			contentPanel.add(jlblPubYear, gbc_jlblPubYear);
		}
		{
			jtxtfieldPubYear = new JTextField();
			GridBagConstraints gbc_jtxtfieldPubYear = new GridBagConstraints();
			gbc_jtxtfieldPubYear.gridwidth = 2;
			gbc_jtxtfieldPubYear.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldPubYear.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldPubYear.gridx = 1;
			gbc_jtxtfieldPubYear.gridy = 4;
			contentPanel.add(jtxtfieldPubYear, gbc_jtxtfieldPubYear);
			jtxtfieldPubYear.setColumns(10);
		}
		{
			JLabel jlblAuthors = new JLabel("Authors:");
			jlblAuthors.setFont(new Font("Lucida Console", Font.PLAIN, 12));
			GridBagConstraints gbc_jlblAuthors = new GridBagConstraints();
			gbc_jlblAuthors.anchor = GridBagConstraints.EAST;
			gbc_jlblAuthors.insets = new Insets(0, 0, 5, 5);
			gbc_jlblAuthors.gridx = 0;
			gbc_jlblAuthors.gridy = 5;
			contentPanel.add(jlblAuthors, gbc_jlblAuthors);
		}
		{
			jtxtfieldAuthors = new JTextField();
			GridBagConstraints gbc_jtxtfieldAuthors = new GridBagConstraints();
			gbc_jtxtfieldAuthors.gridwidth = 2;
			gbc_jtxtfieldAuthors.insets = new Insets(0, 0, 5, 0);
			gbc_jtxtfieldAuthors.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtxtfieldAuthors.gridx = 1;
			gbc_jtxtfieldAuthors.gridy = 5;
			contentPanel.add(jtxtfieldAuthors, gbc_jtxtfieldAuthors);
			jtxtfieldAuthors.setColumns(10);
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
						ISBN isbn = new ISBN();
						boolean boolIsFilled = !jtxtfieldISBN.getText().equals("") && !jtxtfieldBookName.getText().equals("") &&
											   !jtxtfieldDescription.getText().equals("") &&  !jtxtfieldEdition.getText().equals("") &&
											   !jtxtfieldPubYear.getText().equals("") && !jtxtfieldAuthors.getText().equals("")  ;
						try { 
							if (boolIsFilled) {
								Date PubYear = new SimpleDateFormat("yyyy").parse(jtxtfieldPubYear.getText());
								java.sql.Date pubyear = new java.sql.Date(PubYear.getTime());
								
								ISBNEXE.setValues(isbn,
										jtxtfieldISBN.getText(),
										jtxtfieldBookName.getText(),
										jtxtfieldDescription.getText(),
										jtxtfieldEdition.getText(),
										pubyear,
										jtxtfieldAuthors.getText());
								
								JOptionPane.showMessageDialog(null, ISBNEXE.exeInsertStatements(isbn));
								
								setVisible(false);
								LibrarianPage pageLibrarian = new LibrarianPage();
								pageLibrarian.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "Input Required Fields");
							}
						}  catch (ParseException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "Please Format Date this way. (mm/dd/yyyy)");
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
						LibrarianPage pageLibrarian = new LibrarianPage();
						pageLibrarian.setVisible(true);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

}
