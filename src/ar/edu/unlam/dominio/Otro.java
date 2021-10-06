package ar.edu.unlam.dominio;

public class Otro extends Musico{
	
	private boolean cantaONo;
	private String descripcion;
	public Otro(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.descripcion = descripcion;
		this.cantaONo = cantaONo;
	}
	
	
}
