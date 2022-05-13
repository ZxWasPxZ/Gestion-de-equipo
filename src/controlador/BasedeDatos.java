package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Equipo;
import modelo.Jugador;






public class BasedeDatos {
	//Metodo para cargar el comboBox Equipo
		public ArrayList<Equipo> cargarComboEquipo() {
			ArrayList<Equipo> arrayLEquipo = new ArrayList<>();
			Equipo nuevoEquipo;
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localHost/jugadores", "jugadores",
						"jugadores");
				Statement consulta = conexion.createStatement();
				ResultSet registro = consulta.executeQuery("select * from equipo");

				while (registro.next()) {
					nuevoEquipo = new Equipo();
					nuevoEquipo.setId(Integer.parseInt(registro.getString("id")));
					nuevoEquipo.setNombreEquipo(registro.getString("nombreEquipo"));
					arrayLEquipo.add(nuevoEquipo);

				}
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return arrayLEquipo;
		}
	
		
		//Metodo para cargar el comboBox de todos los combobox de jugadores
				public ArrayList<Jugador> cargarComboJugador() {
					ArrayList<Jugador> arrayLJugador = new ArrayList<>();
					Jugador nuevoJugador;
					try {
						Connection conexion = DriverManager.getConnection("jdbc:mysql://localHost/jugadores", "jugadores",
								"jugadores");
						Statement consulta = conexion.createStatement();
						ResultSet registro = consulta.executeQuery("select * from jugador");

						while (registro.next()) {
							nuevoJugador = new Jugador();
							nuevoJugador.setId(Integer.parseInt(registro.getString("id")));
							nuevoJugador.setId_Equipo(Integer.parseInt(registro.getString("id_Equipo")));
							nuevoJugador.setNombreJugador(registro.getString("nombreJugador"));
							nuevoJugador.setEdad(Integer.parseInt(registro.getString("edad")));
							nuevoJugador.setPosicion(registro.getString("posicion"));
							nuevoJugador.setSexo(registro.getString("sexo"));
							nuevoJugador.setAltura(Float.parseFloat(registro.getString("altura")));
							nuevoJugador.setPiernabuena(registro.getString("piernabuena"));
							arrayLJugador.add(nuevoJugador);

						}
						conexion.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}

					return arrayLJugador;
				}
				
				//Metodo para filtrar por Equipo
				public ArrayList<Jugador> cargandoJugador(String filtro) {
					ArrayList<Jugador> arrayLJugador = new ArrayList<>();
					Jugador nuevoJugador;

					try {
						Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/jugadores", "jugadores",
								"jugadores");
						Statement consulta = conexion.createStatement();
						ResultSet registro = consulta.executeQuery("select * from jugador,equipo where equipo.nombreEquipo ='" + filtro
								+ "' and equipo.id=jugador.id_Equipo; ");

						while (registro.next()) {
							nuevoJugador = new Jugador();
							nuevoJugador.setId(Integer.parseInt(registro.getString("id")));
							nuevoJugador.setId_Equipo(Integer.parseInt(registro.getString("id_Equipo")));
							nuevoJugador.setNombreJugador(registro.getString("nombreJugador"));
							nuevoJugador.setEdad(Integer.parseInt(registro.getString("edad")));
							nuevoJugador.setPosicion(registro.getString("posicion"));
							nuevoJugador.setSexo(registro.getString("sexo"));
							nuevoJugador.setAltura(Float.parseFloat(registro.getString("altura")));
							nuevoJugador.setPiernabuena(registro.getString("piernabuena"));
							arrayLJugador.add(nuevoJugador);

							
						}
						conexion.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return arrayLJugador;
				}
				//Metodo para filtrar por edad
				public ArrayList<Jugador> cargandoEdad(double filtro) {
					ArrayList<Jugador> arrayLJugador = new ArrayList<>();
					Jugador nuevoJugador;
					try {
						Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/jugadores", "jugadores",
								"jugadores");
						Statement consulta = conexion.createStatement();
						ResultSet registro = consulta.executeQuery("select * from jugador where edad <= " + filtro
								+  ";");

						while (registro.next()) {
							nuevoJugador = new Jugador();
							nuevoJugador.setId(Integer.parseInt(registro.getString("id")));
							nuevoJugador.setId_Equipo(Integer.parseInt(registro.getString("id_Equipo")));
							nuevoJugador.setNombreJugador(registro.getString("nombreJugador"));
							nuevoJugador.setEdad(Integer.parseInt(registro.getString("edad")));
							nuevoJugador.setPosicion(registro.getString("posicion"));
							nuevoJugador.setSexo(registro.getString("sexo"));
							nuevoJugador.setAltura(Float.parseFloat(registro.getString("altura")));
							nuevoJugador.setPiernabuena(registro.getString("piernabuena"));
							arrayLJugador.add(nuevoJugador);

							
						}
						conexion.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return arrayLJugador;

					
				}
				//Metodo para filtrar por posicion
				public ArrayList<Jugador> cargandoPosicion(String filtro) {
					ArrayList<Jugador> arrayLJugador = new ArrayList<>();
					Jugador nuevoJugador;

					try {
						Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/jugadores", "jugadores",
								"jugadores");
						Statement consulta = conexion.createStatement();
						ResultSet registro = consulta.executeQuery("select * from jugador where posicion = '" + filtro
								+  "';");
						

						while (registro.next()) {
							nuevoJugador = new Jugador();
							nuevoJugador.setId(Integer.parseInt(registro.getString("id")));
							nuevoJugador.setId_Equipo(Integer.parseInt(registro.getString("id_Equipo")));
							nuevoJugador.setNombreJugador(registro.getString("nombreJugador"));
							nuevoJugador.setEdad(Integer.parseInt(registro.getString("edad")));
							nuevoJugador.setPosicion(registro.getString("posicion"));
							nuevoJugador.setSexo(registro.getString("sexo"));
							nuevoJugador.setAltura(Float.parseFloat(registro.getString("altura")));
							nuevoJugador.setPiernabuena(registro.getString("piernabuena"));
							arrayLJugador.add(nuevoJugador);

							
						}
						conexion.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return arrayLJugador;
				}
	
	

	
}
