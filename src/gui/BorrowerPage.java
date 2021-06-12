package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

public class BorrowerPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowerPage frame = new BorrowerPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BorrowerPage() {
		setTitle("Smart Owl Library");
		setMinimumSize(new Dimension(550, 420));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(244, 164, 96));
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new LineBorder(new Color(244, 164, 96), 3, true));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
//Welcome Panel Top in
		
		//WelcomePanel
		JPanel panelWelcome = new JPanel();
		panelWelcome.setForeground(new Color(238, 232, 170));
		panelWelcome.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_panelWelcome = new GridBagConstraints();
		gbc_panelWelcome.gridwidth = 2;
		gbc_panelWelcome.insets = new Insets(0, 0, 5, 0);
		gbc_panelWelcome.fill = GridBagConstraints.VERTICAL;
		gbc_panelWelcome.gridx = 0;
		gbc_panelWelcome.gridy = 0;
		contentPane.add(panelWelcome, gbc_panelWelcome);
		
		//img
		JLabel lblWelcomeImgLabel = new JLabel("");
		lblWelcomeImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblWelcomeImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image WelcomeImage = new ImageIcon(this.getClass().getResource("/LogoWelcomeBorrower500px100px.png")).getImage();
		panelWelcome.setLayout(new GridLayout(0, 1, 0, 0));
		lblWelcomeImgLabel.setIcon(new ImageIcon(WelcomeImage));
		lblWelcomeImgLabel.setBounds(27, 19, 106, 130);
		panelWelcome.add(lblWelcomeImgLabel);
		
//Form Panel Top in

		//FormPanel
		JPanel panelForm = new JPanel();
		panelForm.setBorder(new LineBorder(new Color(255, 222, 173), 5, true));
		GridBagConstraints gbc_panelForm = new GridBagConstraints();
		gbc_panelForm.gridheight = 2;
		gbc_panelForm.insets = new Insets(0, 0, 5, 5);
		gbc_panelForm.gridx = 0;
		gbc_panelForm.gridy = 1;
		contentPane.add(panelForm, gbc_panelForm);
		
		//img
		JLabel lblFormImgLabel = new JLabel("");
		lblFormImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblFormImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image FormImage = new ImageIcon(this.getClass().getResource("/LogoForm250px.png")).getImage();
		panelForm.setLayout(new GridLayout(0, 1, 0, 0));
		lblFormImgLabel.setIcon(new ImageIcon(FormImage));
		lblFormImgLabel.setBounds(27, 19, 106, 130);
		panelForm.add(lblFormImgLabel);
		
//Add Borrower Panel Top in
		
		//WelcomePanel
		JPanel panelAddBorrower = new JPanel();
		panelAddBorrower.setBorder(new LineBorder(new Color(255, 222, 173), 5, true));
		GridBagConstraints gbc_panelAddBorrower = new GridBagConstraints();
		gbc_panelAddBorrower.gridheight = 2;
		gbc_panelAddBorrower.insets = new Insets(0, 0, 5, 0);
		gbc_panelAddBorrower.gridx = 1;
		gbc_panelAddBorrower.gridy = 1;
		contentPane.add(panelAddBorrower, gbc_panelAddBorrower);
		
		//img
		JLabel lblAddBorrowerImgLabel = new JLabel("");
		lblAddBorrowerImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblAddBorrowerImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image AddBorrowerImage = new ImageIcon(this.getClass().getResource("/LogoAddBorrower250px.png")).getImage();
		panelAddBorrower.setLayout(new GridLayout(0, 1, 0, 0));
		lblAddBorrowerImgLabel.setIcon(new ImageIcon(AddBorrowerImage));
		lblAddBorrowerImgLabel.setBounds(27, 19, 106, 130);
		panelAddBorrower.add(lblAddBorrowerImgLabel);
	}

}
