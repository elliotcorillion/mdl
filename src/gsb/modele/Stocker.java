package gsb.modele;

public class Stocker {
	
	protected int qteStocker ;
	protected String matricule ;
	protected String nom;
	
	public Stocker(String unMatricule, String unNom,int uneQteStock){
		
		
		this.matricule = unMatricule;
		this.nom = unNom;
		this.qteStocker= uneQteStock;
	}

	public int getQteStock() {
		return qteStocker;
	}

	public void setQteStock(int uneQteStock) {
		this.qteStocker = uneQteStock;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String unNom) {
		this.nom = unNom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String unMatricule) {
		this.matricule = unMatricule;
	}

}