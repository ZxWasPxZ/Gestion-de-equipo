package modelo;

public class Jugador {
	// Atributos
	private int id;
	private int id_Equipo;
	private String nombreJugador;
	private int edad;
	private String posicion;
	private String sexo;
	private float altura;
	private String piernabuena;
	
	public Jugador() {
		id = 0;
		id_Equipo =0;
		nombreJugador = null;
		edad = 0;
		posicion = null;
		sexo = null;
		altura = 0.0f;
		piernabuena = null;
		
	}
	
	public Jugador(int id, int id_Equipo, String nombreJugador, int edad, String posicion, String sexo, float altura,
			String piernabuena) {
		this.id = id;
		this.id_Equipo = id_Equipo;
		this.nombreJugador = nombreJugador;
		this.edad = edad;
		this.posicion = posicion;
		this.sexo = sexo;
		this.altura = altura;
		this.piernabuena = piernabuena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Equipo() {
		return id_Equipo;
	}

	public void setId_Equipo(int id_Equipo) {
		this.id_Equipo = id_Equipo;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getPiernabuena() {
		return piernabuena;
	}

	public void setPiernabuena(String piernabuena) {
		this.piernabuena = piernabuena;
	}
	
	

	
	

}
