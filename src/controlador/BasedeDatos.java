package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Jugador;
import modelo.Jugador.Posicion;



public class BasedeDatos {
	public ArrayList<Jugador> cargarComboNombreJugador() {
		ArrayList<Jugador> arrayLNombreJugador = new ArrayList<>();
		Jugador nombreJugador;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localHost/jugadores", "root"," ");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select * from jugador");

			while (registro.next()) {
				nombreJugador = new Jugador();
				nombreJugador.setId_Jugador(Integer.parseInt(registro.getString("id_Jugador")));
				nombreJugador.setNombreJugador(registro.getString("nombreJugador"));
				nombreJugador.setEdad(Integer.parseInt(registro.getString("edad")));
			
				nombreJugador.setAltura(Float.parseFloat(registro.getString("altura")));
				nombreJugador.setPeso(Float.parseFloat(registro.getString("peso")));
				
				
				
				
				arrayLNombreJugador.add(nombreJugador);

			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return arrayLNombreJugador;
	}
	
	
	

	
}
