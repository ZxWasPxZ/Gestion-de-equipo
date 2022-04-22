package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Insertarjugador extends JPanel {

	/**
	 * Create the panel.
	 */
	public Insertarjugador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insertar jugador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(60, 101, 270, 49);
		add(lblNewLabel);

	}
}
