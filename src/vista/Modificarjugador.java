package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Modificarjugador extends JPanel {

	/**
	 * Create the panel.
	 */
	public Modificarjugador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar jugador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 115, 211, 55);
		add(lblNewLabel);

	}

}
