package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ConexionMYSQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(87, 128, 116, 31);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasenya = new JLabel("Contrase\u00F1a");
		lblContrasenya.setBounds(87, 264, 116, 31);
		contentPane.add(lblContrasenya);
		
		txtUser = new JTextField();
		txtUser.setBounds(87, 169, 209, 39);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(87, 32, 105, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConexionMYSQL con = new ConexionMYSQL();
					String u = txtUser.getText();
					String p = txtPass.getText();
					con.ConectarBasedeDatos();
					String sql = "select count(password) from login where password='"+p+"'";
					con.resultado=con.sentencia.executeQuery(sql);
					while(con.resultado.next()) {
						if(con.resultado.getString(u).equals(1)) {
							setVisible(false);
							VentPrincipal ven = new VentPrincipal();
							ven.setVisible(true);
						}else {
							JOptionPane.showMessageDialog(null, "Usuario desconocido");
						}
					}
					con.DesconectarBasedeDatos();
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(87, 396, 89, 23);
		contentPane.add(btnNewButton);
		
		txtPass = new JTextField();
		txtPass.setBounds(87, 319, 209, 39);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
	}
	
	public void validarUsuario() {
		int resultado =0;
		
		String user = txtUser.getText();
		String pass= String.valueOf(txtPass.getText());
		final String url_bd = "jdbc:mysql://localhost/madridautos";
		
		String sql= "select * from login where nombre='"+user+"' and password="+pass;
		
		try {
			Connection conexion = DriverManager.getConnection(url_bd, user, pass);
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery(sql);
			
			
			
			
			
			conexion.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
