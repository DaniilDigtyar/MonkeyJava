
public class Impresions {
	private String nomGcode;
	private String numeroCopia;
	private String codiImpresora;
	private String ordreImpresio;
	private String estat;
	
	public Impresions(String nomGcode, String numeroCopia, String codiImpresora, String ordreImpresio, String estat) {
		super();
		this.nomGcode = nomGcode;
		this.numeroCopia = numeroCopia;
		this.codiImpresora = codiImpresora;
		this.ordreImpresio = ordreImpresio;
		this.estat = estat;
	}
	
	public String getNomGcode() {return nomGcode;}
	public void setNomGcode(String nomGcode) {this.nomGcode = nomGcode;}
	
	public String getNumeroCopia() {return numeroCopia;}
	public void setNumeroCopia(String numeroCopia) {this.numeroCopia = numeroCopia;}
	
	public String getCodiImpresora() {return codiImpresora;}
	public void setCodiImpresora(String codiImpresora) {this.codiImpresora = codiImpresora;}
	
	public String getOrdreImpresio() {return ordreImpresio;}
	public void setOrdreImpresio(String ordreImpresio) {this.ordreImpresio = ordreImpresio;}
	
	public String getEstat() {return estat;}
	public void setEstat(String estat) {this.estat = estat;}

	@Override
	public String toString() {
		return nomGcode + "|" + numeroCopia + "|" + codiImpresora + "|" + ordreImpresio + "|" + estat;
	}
	
	
	
}
