package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Borrarjugador extends JPanel {

	/**
	 * Create the panel.
	 */
	public Borrarjugador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Borrar jugador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(171, 145, 174, 25);
		add(lblNewLabel);

	}

}
