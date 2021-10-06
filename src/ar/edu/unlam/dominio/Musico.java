package ar.edu.unlam.dominio;

public class Musico {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String nombreArtistico;
	private Boolean tieneFormacionAcademica;
	private Boolean manejaMasDeUnInstrumento;
	
	public Musico(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreArtistico = nombreArtistico;
		this.tieneFormacionAcademica = tieneFormacionAcademica;
		this.manejaMasDeUnInstrumento = manejaMasDeUnInstrumento;
	}
	
	
}
