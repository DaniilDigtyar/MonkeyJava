
public class Treballdor {
	private String dni;
	private String nom;
	private String cognoms;

	
	public Treballdor(String dni, String nom, String cognoms) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.cognoms = cognoms;

	}

	public String getDni() {return dni;}
	public void setDni(String dni) {this.dni = dni;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public String getCognoms() {return cognoms;}
	public void setCognoms(String cognoms) {this.cognoms = cognoms;}


	@Override
	public String toString() {
		return dni + "\t" +  nom + "\t" + cognoms;
	}
	
	
	

}
