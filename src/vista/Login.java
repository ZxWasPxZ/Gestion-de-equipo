package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JTextField txtUserLogin;
	private JTextField txtUserPass;
	String bdnombre;
	String bdpassword;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 25, 72, 34);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(67, 109, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(67, 189, 72, 14);
		add(lblNewLabel_2);
		
		txtUserLogin = new JTextField();
		txtUserLogin.setBounds(67, 134, 250, 20);
		add(txtUserLogin);
		txtUserLogin.setColumns(10);
		
		txtUserPass = new JTextField();
		txtUserPass.setBounds(67, 214, 250, 20);
		add(txtUserPass);
		txtUserPass.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombre = txtUserLogin.getText();
				String password = txtUserPass.getText();
				
				if(nombre == bdNombre) {
					
				}
			}
		});
		btnNewButton.setBounds(67, 266, 89, 23);
		add(btnNewButton);

	}
}
