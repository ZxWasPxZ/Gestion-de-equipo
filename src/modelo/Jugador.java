package modelo;

public class Jugador {
	// Atributos
	private int id_Jugador;
	private String nombreJugador;
	private int edad;
	private Posicion posicion;

	public enum Posicion {
		PORTERO, DEFENSA, MEDIOCENTRO, DELANTERO;
	}

	private Sexo sexo;

	public enum Sexo {
		HOMBRE, MUJER;
	}

	private float altura;
	private float peso;
	private Piernabuena piernabuena;

	public enum Piernabuena {
		DERECHA, IZQUIERDA, AMBIDIESTRO;
	}

	// Metodo constructor por defecto
	public Jugador() {
		id_Jugador = 0;
		nombreJugador = null;
		edad = -99;
		posicion = null;
		sexo = null;
		altura = -99.9f;
		peso = -99.9f;
		piernabuena = null;

	}

	// Metodo constructor por parámetros
	public Jugador(int id_Jugador, String nombreJugador, int edad, Posicion posicion, Sexo sexo, float altura,
			float peso, Piernabuena piernabuena) {
		this.id_Jugador = id_Jugador;
		this.nombreJugador = nombreJugador;
		this.edad = edad;
		this.posicion = posicion;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.piernabuena = piernabuena;

	}

	// Accedentes

	public int getId_Jugador() {
		return id_Jugador;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public int getEdad() {
		return edad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public float getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}

	public Piernabuena getPiernabuena() {
		return piernabuena;
	}

	// Mutadores

	public void setId_Jugador(int id_Jugador) {
		this.id_Jugador = id_Jugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setPiernabuena(Piernabuena piernabuena) {
		this.piernabuena = piernabuena;
	}

}
