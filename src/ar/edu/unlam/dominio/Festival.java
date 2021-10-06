package ar.edu.unlam.dominio;

public class Festival {
	
	private String nombre;
	private Banda listaDeBandas[];
	private Espectador audiencia[];
	private Integer diasDeDuracion;
	
	
	public Festival(String nombre, Integer diasDeDuracion) {
		
		this.nombre = nombre;
		this.listaDeBandas = new Banda[25];
		this.audiencia = new Espectador[50000];
		this.diasDeDuracion = diasDeDuracion;
	}
	
	
}
