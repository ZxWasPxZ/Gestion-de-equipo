package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Consultarjugador extends JPanel {
	private JTable table;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtPosicion;
	private JTextField tstSexo;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtPierna;
	private JTextField txtNumero;

	/**
	 * Create the panel.
	 */
	public Consultarjugador() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultarjugador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(187, 11, 195, 25);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 91, 537, 219);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(67, 377, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(67, 420, 86, 20);
		add(txtEdad);
		txtEdad.setColumns(10);
		
		txtPosicion = new JTextField();
		txtPosicion.setBounds(67, 474, 86, 20);
		add(txtPosicion);
		txtPosicion.setColumns(10);
		
		tstSexo = new JTextField();
		tstSexo.setBounds(190, 377, 86, 20);
		add(tstSexo);
		tstSexo.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(190, 431, 86, 20);
		add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(190, 474, 86, 20);
		add(txtPeso);
		txtPeso.setColumns(10);
		
		txtPierna = new JTextField();
		txtPierna.setBounds(312, 377, 86, 20);
		add(txtPierna);
		txtPierna.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(312, 431, 86, 20);
		add(txtNumero);
		txtNumero.setColumns(10);

	}
}
