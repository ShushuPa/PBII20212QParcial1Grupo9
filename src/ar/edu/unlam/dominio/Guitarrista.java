package ar.edu.unlam.dominio;

public class Guitarrista extends Musico{

	private Boolean cantaONo;
	private TipoGuitarra tipoGuitarra;
	private UsoCuerdas usoCuerdas;
	
	
	
	public Guitarrista(Integer id, String nombre, String apellido, String nombreArtistico,
			Boolean tieneFormacionAcademica, Boolean manejaMasDeUnInstrumento) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.tipoGuitarra = tipoGuitarra;
		this.usoCuerdas = usoCuerdas;
	}



	
	
	
}
