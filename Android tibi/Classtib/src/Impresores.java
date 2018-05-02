
public class Impresores {
	private String codiImpresora;
	private String nomAssignat;
	private String estat;
	private String marca;
	private String model;
	private String bobinaCarregada;
	
	public Impresores(String codiImpresora, String nomAssignat, String estat, String marca, String model,
			String bobinaCarregada) {
		super();
		this.codiImpresora = codiImpresora;
		this.nomAssignat = nomAssignat;
		this.estat = estat;
		this.marca = marca;
		this.model = model;
		this.bobinaCarregada = bobinaCarregada;
	}

	public String getCodiImpresora() {return codiImpresora;}
	public void setCodiImpresora(String codiImpresora) {this.codiImpresora = codiImpresora;}
	
	public String getNomAssignat() {return nomAssignat;}
	public void setNomAssignat(String nomAssignat) {this.nomAssignat = nomAssignat;}

	public String getEstat() {return estat;}
	public void setEstat(String estat) {this.estat = estat;}

	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}

	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public String getBobinaCarregada() {return bobinaCarregada;}
	public void setBobinaCarregada(String bobinaCarregada) {this.bobinaCarregada = bobinaCarregada;}

	@Override
	public String toString() {
		return codiImpresora + "|" + nomAssignat + "|" + estat + "|" + marca + "|" + model + "|" + bobinaCarregada;
	}
	
	
	
}