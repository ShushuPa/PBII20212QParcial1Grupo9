package ar.edu.unlam.dominio;

public class Baterista extends Musico {
	
	private Boolean cantaONo;
	private Integer partesDeLaBateria;
	public Baterista(Integer id, String nombre, String apellido, String nombreArtistico,
			Boolean tieneFormacionAcademica, Boolean manejaMasDeUnInstrumento) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.partesDeLaBateria = partesDeLaBateria;
		
	}
	
	
}
