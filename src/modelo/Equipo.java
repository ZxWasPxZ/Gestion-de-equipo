package modelo;

public class Equipo {
	// Atributos
	private int id;
	private String nombreEquipo;

	// Metodo constructor por defecto
	public Equipo() {
		id = 0;
		nombreEquipo = null;

	}

	// Metodo constructor por parámetros
	public Equipo(int id, String nombreEquipo) {
		this.id = id;
		this.nombreEquipo = nombreEquipo;
	}

	// Accedentes
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public int getId() {
		return id;
	}

	// Mutadores

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void setId(int id) {
		this.id = id;
	}

}
