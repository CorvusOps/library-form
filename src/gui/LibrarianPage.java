package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

public class LibrarianPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianPage frame = new LibrarianPage();
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
	public LibrarianPage() {
		setTitle("Smart Owl Library");
		setMinimumSize(new Dimension(550, 430));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new LineBorder(new Color(244, 164, 96), 5, true));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
//Welcome Panel Top in
		
		//WelcomePanel
		JPanel panelWelcome = new JPanel();
		panelWelcome.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_panelWelcome = new GridBagConstraints();
		gbc_panelWelcome.gridwidth = 3;
		gbc_panelWelcome.insets = new Insets(0, 0, 5, 5);
		gbc_panelWelcome.gridx = 0;
		gbc_panelWelcome.gridy = 0;
		contentPane.add(panelWelcome, gbc_panelWelcome);
		
		//img
		JLabel lblWelcomeImgLabel = new JLabel("");
		lblWelcomeImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblWelcomeImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image WelcomeImage = new ImageIcon(this.getClass().getResource("/LogoWelcomeLibrarian500px100px.png")).getImage();
		panelWelcome.setLayout(new GridLayout(0, 1, 0, 0));
		lblWelcomeImgLabel.setIcon(new ImageIcon(WelcomeImage));
		lblWelcomeImgLabel.setBounds(27, 19, 106, 130);
		panelWelcome.add(lblWelcomeImgLabel);
		
//Form Panel Top in
		
		//FormPanel
		JPanel panelForm = new JPanel();
		panelForm.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
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
		
//Add Librarian Panel in
		
		//AddLibrarianPanel
		JPanel panelAddLibrarian = new JPanel();
		panelAddLibrarian.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_panelAddLibrarian = new GridBagConstraints();
		gbc_panelAddLibrarian.insets = new Insets(0, 0, 5, 5);
		gbc_panelAddLibrarian.gridx = 1;
		gbc_panelAddLibrarian.gridy = 1;
		contentPane.add(panelAddLibrarian, gbc_panelAddLibrarian);
		
		//img
		JLabel lblAddLibrarianImgLabel = new JLabel("");
		lblAddLibrarianImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblAddLibrarianImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image AddLibrarianImage = new ImageIcon(this.getClass().getResource("/LogoLibrarian125px.png")).getImage();
		panelAddLibrarian.setLayout(new GridLayout(0, 1, 0, 0));
		lblAddLibrarianImgLabel.setIcon(new ImageIcon(AddLibrarianImage));
		lblAddLibrarianImgLabel.setBounds(27, 19, 106, 130);
		panelAddLibrarian.add(lblAddLibrarianImgLabel);
		
//Add Book Panel in
		
		//AddBookPanel
		JPanel panelAddBook = new JPanel();
		panelAddBook.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_panelAddBook = new GridBagConstraints();
		gbc_panelAddBook.insets = new Insets(0, 0, 5, 0);
		gbc_panelAddBook.fill = GridBagConstraints.BOTH;
		gbc_panelAddBook.gridx = 2;
		gbc_panelAddBook.gridy = 1;
		contentPane.add(panelAddBook, gbc_panelAddBook);

		//img
		JLabel lblAddBookImgLabel = new JLabel("");
		lblAddBookImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblAddBookImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image AddBookImage = new ImageIcon(this.getClass().getResource("/LogoBook125px.png")).getImage();
		panelAddBook.setLayout(new GridLayout(0, 1, 0, 0));
		lblAddBookImgLabel.setIcon(new ImageIcon(AddBookImage));
		lblAddBookImgLabel.setBounds(27, 19, 106, 130);
		panelAddBook.add(lblAddBookImgLabel);
		
//View Log Panel in
		
		//viewLogPanel
		JPanel panelViewLog = new JPanel();
		panelViewLog.setBorder(new LineBorder(new Color(255, 228, 181), 5, true));
		GridBagConstraints gbc_panelViewLog = new GridBagConstraints();
		gbc_panelViewLog.gridwidth = 2;
		gbc_panelViewLog.gridx = 1;
		gbc_panelViewLog.gridy = 2;
		contentPane.add(panelViewLog, gbc_panelViewLog);
		
		//img
		JLabel lblLogImgLabel = new JLabel("");
		lblLogImgLabel.setBounds(new Rectangle(23, 123, 45, 67));
		lblLogImgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Image LogImage = new ImageIcon(this.getClass().getResource("/LogoLog250px125px.png")).getImage();
		panelViewLog.setLayout(new GridLayout(0, 1, 0, 0));
		lblLogImgLabel.setIcon(new ImageIcon(LogImage));
		lblLogImgLabel.setBounds(27, 19, 106, 130);
		panelViewLog.add(lblLogImgLabel);	
	}

}
