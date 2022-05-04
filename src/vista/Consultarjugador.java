package vista;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.SwingConstants;

import controlador.BasedeDatos;
import modelo.Jugador;


import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;




public class Consultarjugador extends JPanel {
	private JTable tableConsultas;
	private JComboBox cmbNombreJugador;
	private JComboBox cmbNombreEquipo;
	private JComboBox cmbPierna;
	private JSpinner spinnerEdad;
	private JComboBox cmbSexo;
	private JComboBox cmbPosicion;

	/**
	 * Create the panel.
	 */
	public Consultarjugador() {
		setBounds(100, 100, 800, 700);
		setLayout(null);
		//Crear grupo de radioButtons
		ButtonGroup grupo1 = new ButtonGroup();
		//Creamos objeto de tipo BaseDeDatos
		BasedeDatos b = new BasedeDatos();
		
		JLabel lblTitulo = new JLabel("CONSULTAR JUGADOR");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(111, 11, 588, 38);
		add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 467, 570, 203);
		add(scrollPane);
		
		tableConsultas = new JTable();
		scrollPane.setViewportView(tableConsultas);
		// Vector para la cabezera de la tabla
			Vector vNombres = new Vector();
			vNombres.add("NOMBRE_JUGADOR");
			vNombres.add("NOMBRE_EQUIPO");
			vNombres.add("POSICION");
			vNombres.add("EDAD");
			vNombres.add("SEXO");
			vNombres.add("PIERNA");
		
		JRadioButton rdbtnNombreJugador = new JRadioButton("NOMBRE JUGADOR");
		rdbtnNombreJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(true);
				cmbNombreEquipo.setEnabled(false);
				cmbPierna.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbSexo.setEnabled(false);
				cmbPosicion.setEnabled(false);
			}
		});
		rdbtnNombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNombreJugador.setBounds(36, 78, 137, 23);
		add(rdbtnNombreJugador);
		grupo1.add(rdbtnNombreJugador);
		
		JRadioButton rdbtnNombreEquipo = new JRadioButton("NOMBRE EQUIPO");
		rdbtnNombreEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(false);
				cmbNombreEquipo.setEnabled(true);
				cmbPierna.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbSexo.setEnabled(false);
				cmbPosicion.setEnabled(false);
			}
		});
		rdbtnNombreEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNombreEquipo.setBounds(365, 78, 124, 23);
		add(rdbtnNombreEquipo);
		grupo1.add(rdbtnNombreEquipo);
		
		JRadioButton rdbtnEdad = new JRadioButton("EDAD");
		rdbtnEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(false);
				cmbNombreEquipo.setEnabled(false);
				cmbPierna.setEnabled(false);
				spinnerEdad.setEnabled(true);
				cmbSexo.setEnabled(false);
				cmbPosicion.setEnabled(false);
			}
		});
		rdbtnEdad.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEdad.setBounds(658, 78, 109, 23);
		add(rdbtnEdad);
		grupo1.add(rdbtnEdad);
		
		JRadioButton rdbtnPosicion = new JRadioButton("POSICION");
		rdbtnPosicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(false);
				cmbNombreEquipo.setEnabled(false);
				cmbPierna.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbSexo.setEnabled(false);
				cmbPosicion.setEnabled(true);
			}
		});
		rdbtnPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPosicion.setBounds(36, 274, 109, 23);
		add(rdbtnPosicion);
		grupo1.add(rdbtnPosicion);
		
		JRadioButton rdbtnSexo = new JRadioButton("SEXO");
		rdbtnSexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(false);
				cmbNombreEquipo.setEnabled(false);
				cmbPierna.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbSexo.setEnabled(true);
				cmbPosicion.setEnabled(false);
			}
		});
		rdbtnSexo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSexo.setBounds(380, 274, 109, 23);
		add(rdbtnSexo);
		grupo1.add(rdbtnSexo);
		
		JRadioButton rdbtnPierna = new JRadioButton("PIERNA");
		rdbtnPierna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbNombreJugador.setEnabled(false);
				cmbNombreEquipo.setEnabled(false);
				cmbPierna.setEnabled(true);
				spinnerEdad.setEnabled(false);
				cmbSexo.setEnabled(false);
				cmbPosicion.setEnabled(false);
			}
		});
		rdbtnPierna.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPierna.setBounds(658, 274, 109, 23);
		add(rdbtnPierna);
		grupo1.add(rdbtnPierna);
		
		cmbNombreJugador = new JComboBox();
		cmbNombreJugador.setBounds(36, 108, 137, 22);
		add(cmbNombreJugador);
		ArrayList<Jugador> arrayLNombreJugador = b.cargarComboNombreJugador();
		for (int i = 0; i < arrayLNombreJugador.size(); i++) {
			cmbNombreJugador.addItem(arrayLNombreJugador.get(i).getNombreJugador());
		}
		
		cmbNombreEquipo = new JComboBox();
		cmbNombreEquipo.setBounds(365, 108, 124, 22);
		add(cmbNombreEquipo);
		
		cmbPierna = new JComboBox();
		cmbPierna.setBounds(658, 304, 109, 22);
		add(cmbPierna);
		
		spinnerEdad = new JSpinner();
		spinnerEdad.setBounds(658, 109, 109, 20);
		add(spinnerEdad);
		
		cmbSexo = new JComboBox();
		cmbSexo.setBounds(380, 304, 109, 22);
		add(cmbSexo);
		
		cmbPosicion = new JComboBox();
		cmbPosicion.setBounds(36, 304, 137, 22);
		add(cmbPosicion);
		
		
		cmbNombreJugador.setEnabled(false);
		cmbNombreEquipo.setEnabled(false);
		cmbPierna.setEnabled(false);
		spinnerEdad.setEnabled(false);
		cmbSexo.setEnabled(false);
		cmbPosicion.setEnabled(false);
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
