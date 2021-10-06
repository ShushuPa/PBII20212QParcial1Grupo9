package ar.edu.unlam.dominio;

public class Banda {
	
	private Integer id;
	private Integer nroIntegrantes;
	private Genero genero;
	private Musico musicosIntegrantes[];
	
	public Banda(Integer id, Integer nroIntegrantes, Genero genero, Integer cantidadIntegrantes) {
		
		this.id = id;
		this.nroIntegrantes = nroIntegrantes;
		this.genero = genero;
		this.musicosIntegrantes = new Musico[cantidadIntegrantes];
	}
	
	
}
