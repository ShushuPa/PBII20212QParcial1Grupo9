package ar.edu.unlam.dominio;

public class Productora {
	
	private String nombre;
	private Banda listaDeBandasProductora[];
	private Musico listaDeMusicosProductora[];
	private Festival festivales[];
	
	
	public Productora(String nombre) {
		
		this.nombre = nombre;
		this.listaDeBandasProductora = new Banda[100];
		this.listaDeMusicosProductora = new Musico[500];
		this.festivales = new Festival[50];
	}
	
	
}
