package modelo;

import java.util.ArrayList;

public class Equipo {
	//Atributos
	private int id;
	private String nombre;
	private Categoria categoria;
	public enum Categoria{
		CHUPETIN, PREBENJAMIN, BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, TERCERA, SEGUNDA, PRIMERA, SEGUNDAB;
	}
	private String entrenador;
	private String estadio;
	private Sexo sexo;
	public enum Sexo{
		HOMBRE, MUJERES, MIXTO;
	}
	private int numJugadores;
	private ArrayList<Jugador> jugadoresDelEquipo;
	
	
	//Metodo constructor por defecto
	public Equipo() {
		nombre = null;
		categoria = null;
		entrenador = null;
		estadio = null;
		sexo = null;
		numJugadores = -99;
		jugadoresDelEquipo = null;
	}
	
	//Metodo constructor por parámetros
	public Equipo(int id, String nombre, Categoria categoria, String entrenador, String estadio, Sexo sexo,
			int numJugadores, ArrayList<Jugador> jugadoresDelEquipo) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.entrenador = entrenador;
		this.estadio = estadio;
		this.sexo = sexo;
		this.numJugadores = numJugadores;
		this.jugadoresDelEquipo = jugadoresDelEquipo;
	}
	

	
		
	//Accedentes
	public String getNombre() {
		return nombre;
	}

	

	public Categoria getCategoria() {
		return categoria;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public String getEstadio() {
		return estadio;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public ArrayList<Jugador> getJugadoresDelEquipo() {
		return jugadoresDelEquipo;
	}

	
	
	//Mutadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public void setJugadoresDelEquipo(ArrayList<Jugador> jugadoresDelEquipo) {
		this.jugadoresDelEquipo = jugadoresDelEquipo;
	}
	
	
}
