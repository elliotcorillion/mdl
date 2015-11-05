package gsb.modele;

public class Visite {
	
	protected String referenceVisite ;
	protected String dateVisite;
	protected String commentaireVisite;
	protected Medecin leMedecin;
	protected Visiteur leVisiteur;
	
	public Visite(String uneReferenceVisite, String uneDateVisite, String unCommentaireVisite, Medecin unMedecin, Visiteur unVisiteur){
		
		this.referenceVisite= uneReferenceVisite;
		this.dateVisite = uneDateVisite;
		this.commentaireVisite = unCommentaireVisite;
		this.leMedecin = unMedecin;
		this.leVisiteur = unVisiteur;
		
	}

	public String getReferenceVisite() {
		return referenceVisite;
	}

	public void setReferenceVisite(String referenceVisite) {
		this.referenceVisite = referenceVisite;
	}

	public String getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(String dateVisite) {
		this.dateVisite = dateVisite;
	}

	public String getCommentaireVisite() {
		return commentaireVisite;
	}

	public void setCommentaireVisite(String commentaireVisite) {
		this.commentaireVisite = commentaireVisite;
	}

	public Medecin getLeMedecin() {
		return leMedecin;
	}

	public void setLeMedecin(Medecin leMedecin) {
		this.leMedecin = leMedecin;
	}

	public Visiteur getLeVisiteur() {
		return leVisiteur;
	}

	public void setLeVisiteur(Visiteur leVisiteur) {
		this.leVisiteur = leVisiteur;
	}
	
}