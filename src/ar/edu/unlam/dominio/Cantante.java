package ar.edu.unlam.dominio;

public class Cantante extends Musico{

	private boolean esCompositor;

	public Cantante(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.esCompositor = esCompositor;
	}
	
	
}
