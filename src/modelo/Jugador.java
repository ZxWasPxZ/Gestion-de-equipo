package modelo;

public class Jugador {
	//Atributos
	private int id;
	private String nombre;
	private int edad;
	private Posicion posicion;
	public enum Posicion{
		PORTERO, DEFENSA, MEDIOCENTRO, DELANTERO, BANQUILLO, NOCONVOCADO;
	}
	private Sexo sexo;
	public enum Sexo{
		HOMBRE, MUJER, TS;
	}
	private float altura;
	private float peso;
	private Piernabuena piernabuena;
	public enum Piernabuena{
		DERECHA, IZQUIERDA, AMBIDIESTRO;
	}
	private int numero;
	

	//Metodo constructor por defecto
	public Jugador() {
		nombre = null;
		edad = -99;
		posicion = null;
		sexo = null;
		altura = -99.9f;
		peso = -99.9f;
		piernabuena = null;
		numero = -99;
	}
	
	//Metodo constructor por parámetros
	public Jugador(int id, String nombre, int edad, Posicion posicion, Sexo sexo, float altura, float peso,
			Piernabuena piernabuena, int numero) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.piernabuena = piernabuena;
		this.numero = numero;
	}

	
	
	//Accedentes
	public String getNombre() {
		return nombre;
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

	public int getNumero() {
		return numero;
	}

	
	
	//Mutadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public void setNumero(int numero) {
		this.numero = numero;
	}



}
