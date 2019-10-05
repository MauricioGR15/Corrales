package Paneles;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Crias extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Crias() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
