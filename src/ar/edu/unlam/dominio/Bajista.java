package ar.edu.unlam.dominio;

public class Bajista extends Musico{
	
	private Boolean cantaONo;
	private UsoCuerdas usoCuerdas;
	
	
	public Bajista(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.usoCuerdas = usoCuerdas;
	}
	
	
}
