package modelo;

public class Equipo {
	// Atributos
	private int id_Equipo;
	private String nombreEquipo;

	// Metodo constructor por defecto
	public Equipo() {
		id_Equipo = 0;
		nombreEquipo = null;

	}

	// Metodo constructor por parámetros
	public Equipo(int id_Equipo, String nombreEquipo) {
		this.id_Equipo = id_Equipo;
		this.nombreEquipo = nombreEquipo;
	}

	// Accedentes
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getId_Equipo() {
		return id_Equipo;
	}

	// Mutadores

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void setId_Equipo(int id_Equipo) {
		this.id_Equipo = id_Equipo;
	}

}
