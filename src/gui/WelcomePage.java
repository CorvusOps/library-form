package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class WelcomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setTitle("Smart Owl Library");
		setMinimumSize(new Dimension(950, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 597);
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(244, 164, 96));
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new LineBorder(new Color(244, 164, 96), 3, true));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
//left panel for welcome page 
		
		//panel
		JPanel panelWelcomePage = new JPanel();
		panelWelcomePage.setBackground(new Color(255, 255, 255));
		panelWelcomePage.setBorder(new LineBorder(new Color(255, 222, 173), 5, true));
		panelWelcomePage.setForeground(new Color(238, 232, 170));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panelWelcomePage, gbc_panel);
		
		//img
		JLabel lblWelcomePageImgLabel = new JLabel("");
		lblWelcomePageImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblWelcomePageImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image WelcomePageImage = new ImageIcon(this.getClass().getResource("/LogoFine500px.png")).getImage();
		lblWelcomePageImgLabel.setIcon(new ImageIcon(WelcomePageImage));
		lblWelcomePageImgLabel.setBounds(27, 19, 106, 130);
		panelWelcomePage.add(lblWelcomePageImgLabel);

//BorrowerPanel in
		
		JPanel panelBorrowerPortal = new JPanel();
		panelBorrowerPortal.setBorder(new LineBorder(new Color(250, 235, 215), 5, true));
		panelBorrowerPortal.setBackground(Color.WHITE);
		panelBorrowerPortal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				BorrowerPage objBorrower = new BorrowerPage();
				objBorrower.setVisible(true);
			}
		});
		GridBagConstraints gbc_panelBorrowerPortal = new GridBagConstraints();
		gbc_panelBorrowerPortal.insets = new Insets(0, 0, 5, 0);
		gbc_panelBorrowerPortal.fill = GridBagConstraints.BOTH;
		gbc_panelBorrowerPortal.gridx = 1;
		gbc_panelBorrowerPortal.gridy = 0;
		contentPane.add(panelBorrowerPortal, gbc_panelBorrowerPortal);
		
		//img
		JLabel lblBorrowerImgLabel = new JLabel("");
		lblBorrowerImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblBorrowerImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image BorrowerImage = new ImageIcon(this.getClass().getResource("/LogoBigBorrower250px.png")).getImage();
		lblBorrowerImgLabel.setIcon(new ImageIcon(BorrowerImage));
		lblBorrowerImgLabel.setBounds(27, 19, 106, 130);
		panelBorrowerPortal.add(lblBorrowerImgLabel);
		
//LibrarianPanel in		

		JPanel panelLibrarianPortal = new JPanel();
		panelLibrarianPortal.setBackground(new Color(255, 255, 255));
		panelLibrarianPortal.setBorder(new LineBorder(new Color(250, 235, 215), 5, true));
		panelLibrarianPortal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LibrarianPage objLibrarian = new LibrarianPage();
				objLibrarian.setVisible(true);
			}
		});
		GridBagConstraints gbc_panelLibrarianPortal = new GridBagConstraints();
		gbc_panelLibrarianPortal.fill = GridBagConstraints.BOTH;
		gbc_panelLibrarianPortal.gridx = 1;
		gbc_panelLibrarianPortal.gridy = 1;
		contentPane.add(panelLibrarianPortal, gbc_panelLibrarianPortal);
		
		//img
		JLabel lblLibrarianImgLabel = new JLabel("");
		lblLibrarianImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblLibrarianImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image LibrarianImage = new ImageIcon(this.getClass().getResource("/LogoBigLibrarian250px.png")).getImage();
		lblLibrarianImgLabel.setIcon(new ImageIcon(LibrarianImage));
		lblLibrarianImgLabel.setBounds(27, 19, 106, 130);
		panelLibrarianPortal.add(lblLibrarianImgLabel);
	}

}
