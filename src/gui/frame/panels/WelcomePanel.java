package gui.frame.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class WelcomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public WelcomePanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{234, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Welcome to Smart Owl Logs!");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Lucida Fax", Font.BOLD, 45));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

	}

}
