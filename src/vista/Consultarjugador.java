package vista;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controlador.BasedeDatos;
import modelo.Equipo;
import modelo.Jugador;


import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;




public class Consultarjugador extends JPanel {
	private JTable table;
	private JComboBox cmbEquipo;
	private JSpinner spinnerEdad;
	private JComboBox cmbPosicion;
	private JComboBox cmbSexo;
	private JSpinner spinnerAltura;
	private JComboBox cmbPierna;
	private ArrayList<Jugador> arrayLJugador = new ArrayList();
	private Vector vNombres;
	private JRadioButton rdbtnEquipo;
	private JRadioButton rdbtnEdad;
	
	/**
	 * Create the panel.
	 */
	public Consultarjugador() {
		setBackground(Color.WHITE);
		setBounds(100, 100,1100, 900);
		setLayout(null);
		// Creacion del los grupos de radioButtons
		ButtonGroup grupo1 = new ButtonGroup();
		BasedeDatos b = new BasedeDatos();
		
		JLabel lblTitulo = new JLabel("CONSULTAR JUGADOR");
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 1090, 30);
		add(lblTitulo);
		
		rdbtnEquipo = new JRadioButton("EQUIPO");
		rdbtnEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(true);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(false);
			}
		});
		rdbtnEquipo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnEquipo.setBounds(39, 65, 109, 23);
		add(rdbtnEquipo);
		grupo1.add(rdbtnEquipo);
		
		JRadioButton rdbtnEdad = new JRadioButton("EDAD");
		rdbtnEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(true);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(false);
			}
		});
		rdbtnEdad.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnEdad.setBounds(213, 65, 109, 23);
		add(rdbtnEdad);
		grupo1.add(rdbtnEdad);
		
		JRadioButton rdbtnPosicion = new JRadioButton("POSICION");
		rdbtnPosicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(true);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(false);
			}
		});
		rdbtnPosicion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnPosicion.setBounds(383, 65, 126, 23);
		add(rdbtnPosicion);
		grupo1.add(rdbtnPosicion);
		
		JRadioButton rdbtnSexo = new JRadioButton("SEXO");
		rdbtnSexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(true);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(false);
			}
		});
		rdbtnSexo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnSexo.setBounds(571, 64, 94, 25);
		add(rdbtnSexo);
		grupo1.add(rdbtnSexo);
		
		JRadioButton rdbtnAltura = new JRadioButton("ALTURA");
		rdbtnAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(true);
				cmbPierna.setEnabled(false);
			}
		});
		rdbtnAltura.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnAltura.setBounds(729, 64, 126, 25);
		add(rdbtnAltura);
		grupo1.add(rdbtnAltura);
		
		JRadioButton rdbtnPierna = new JRadioButton("PIERNA");
		rdbtnPierna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(true);
			}
		});
		rdbtnPierna.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnPierna.setBounds(911, 64, 126, 25);
		add(rdbtnPierna);
		grupo1.add(rdbtnPierna);
		
		
		
		
		
		
		
		
		
		
		
		
		cmbEquipo = new JComboBox();
		
		
		cmbEquipo.setBounds(39, 102, 109, 22);
		add(cmbEquipo);
		// Con esto cargamos el combobox con las Marcas
				ArrayList<Equipo> arrayLEquipo = b.cargarComboEquipo();
				for (int i = 0; i < arrayLEquipo.size(); i++) {
					cmbEquipo.addItem(arrayLEquipo.get(i).getNombreEquipo());
				}
		
		
		spinnerEdad = new JSpinner();
		spinnerEdad.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerEdad.setBounds(213, 103, 109, 21);
		add(spinnerEdad);
		
		cmbPosicion = new JComboBox();
		cmbPosicion.setBounds(383, 102, 126, 22);
		add(cmbPosicion);
		// Con esto cargamos el combobox con las posiciones
		ArrayList<Jugador> arrayLPosicion = b.cargarComboJugador();
		for (int i = 0; i < arrayLPosicion.size(); i++) {
			cmbPosicion.addItem(arrayLPosicion.get(i).getPosicion());
		}
		
		cmbSexo = new JComboBox();
		cmbSexo.setBounds(571, 102, 94, 22);
		add(cmbSexo);
		// Con esto cargamos el combobox con los sexos
				ArrayList<Jugador> arrayLSexo = b.cargarComboJugador();
				for (int i = 0; i < arrayLSexo.size(); i++) {
					cmbSexo.addItem(arrayLSexo.get(i).getSexo());
				}
		spinnerAltura = new JSpinner();
		spinnerAltura.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(0.01)));
		spinnerAltura.setBounds(729, 100, 126, 23);
		add(spinnerAltura);
		
		cmbPierna = new JComboBox();
		cmbPierna.setBounds(911, 102, 126, 22);
		add(cmbPierna);
		// Con esto cargamos el combobox con las piernas
				ArrayList<Jugador> arrayLPierna = b.cargarComboJugador();
				for (int i = 0; i < arrayLPierna.size(); i++) {
					cmbPierna.addItem(arrayLPierna.get(i).getPiernabuena());
				}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 297, 998, 503);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		// Vector para la cabezera de la tabla
				Vector vNombres = new Vector();
				vNombres.add("ID");
				vNombres.add("ID_EQUIPO");
				vNombres.add("EQUIPO");
				vNombres.add("NOMBRE");
				vNombres.add("EDAD");
				vNombres.add("POSICION");
				vNombres.add("SEXO");
				vNombres.add("ALTURA");
				vNombres.add("PIERNA");
				
				
				//metodo para filtrar por equipo
				cmbEquipo.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						String filtro;
						filtro = cmbEquipo.getSelectedItem().toString();
						if (rdbtnEquipo.isSelected()) {
							arrayLJugador= b.cargandoJugador(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							table.setValueAt(filtro, i, 2);
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
						}
					}
				});
				
				//metodo para filtrar por edad
				spinnerEdad.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						double filtro;
						filtro = (double) spinnerEdad.getValue();
						if (rdbtnEdad.isSelected()) {
							arrayLJugador = b.cargandoEdad(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							for (Equipo ex : arrayLEquipo) {

								if (ex.getId() == arrayLJugador.get(i).getId_Equipo()) {
									table.setValueAt(ex.getNombreEquipo(), i, 2);

								}
							}
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
							
						}
					}
				});
				//metodo para filtrar por posicion
				cmbPosicion.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						String filtro;
						filtro = cmbPosicion.getSelectedItem().toString();
						if (rdbtnPosicion.isSelected()) {
							arrayLJugador= b.cargandoPosicion(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							for (Equipo ex : arrayLEquipo) {

								if (ex.getId() == arrayLJugador.get(i).getId_Equipo()) {
									table.setValueAt(ex.getNombreEquipo(), i, 2);

								}
							}
							
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
						}
						
					}
				});
				//metodo para filtrar por sexo
				cmbSexo.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						String filtro;
						filtro = cmbSexo.getSelectedItem().toString();
						if (rdbtnSexo.isSelected()) {
							arrayLJugador= b.cargandoSexo(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							for (Equipo ex : arrayLEquipo) {

								if (ex.getId() == arrayLJugador.get(i).getId_Equipo()) {
									table.setValueAt(ex.getNombreEquipo(), i, 2);

								}
							}
							
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
						}
						
					}
				});
		
				//metodo para filtrar por altura
				spinnerAltura.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						double filtro;
						filtro = (double) spinnerAltura.getValue();
						if (rdbtnAltura.isSelected()) {
							arrayLJugador = b.cargandoAltura(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							for (Equipo ex : arrayLEquipo) {

								if (ex.getId() == arrayLJugador.get(i).getId_Equipo()) {
									table.setValueAt(ex.getNombreEquipo(), i, 2);

								}
							}
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
							
						}
					}
				});
				
				//metodo para filtrar por pierna
				cmbPierna.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						String filtro;
						filtro = cmbPierna.getSelectedItem().toString();
						if (rdbtnPierna.isSelected()) {
							arrayLJugador= b.cargandoPierna(filtro);
							table.setModel(new DefaultTableModel(vNombres, arrayLJugador.size()));
						}
						for (int i = 0; i < arrayLJugador.size(); i++) {
							table.setValueAt(arrayLJugador.get(i).getId(), i, 0);
							table.setValueAt(arrayLJugador.get(i).getId_Equipo(), i, 1);
							for (Equipo ex : arrayLEquipo) {

								if (ex.getId() == arrayLJugador.get(i).getId_Equipo()) {
									table.setValueAt(ex.getNombreEquipo(), i, 2);

								}
							}
							
							table.setValueAt(arrayLJugador.get(i).getNombreJugador(), i, 3);
							table.setValueAt(arrayLJugador.get(i).getEdad(), i, 4);
							table.setValueAt(arrayLJugador.get(i).getPosicion(), i, 5);
							table.setValueAt(arrayLJugador.get(i).getSexo(), i, 6);
							table.setValueAt(arrayLJugador.get(i).getAltura(), i, 7);
							table.setValueAt(arrayLJugador.get(i).getPiernabuena(), i, 8);
						}
						
					}
				});
		// Para que no salga nada al principio nada activado de los radioButton
				cmbEquipo.setEnabled(false);
				spinnerEdad.setEnabled(false);
				cmbPosicion.setEnabled(false);
				cmbSexo.setEnabled(false);
				spinnerAltura.setEnabled(false);
				cmbPierna.setEnabled(false);
		
		
		
		
		
		
		

	}
}
