package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Consultarjugador extends JPanel {

	/**
	 * Create the panel.
	 */
	public Consultarjugador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultarjugador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(131, 141, 195, 25);
		add(lblNewLabel);

	}

}
