package gsb.modele;

/**
 * 
 * @author Elliot
 * @date 15/10/15
 *
 */

public class Visiteur {

	protected String matriculeVisiteur;
	protected String nomVisiteur;
	protected String prenomVisiteur;
	protected String loginVisiteur;
	protected String mdpVisiteur;
	protected String adresseVisiteur;
	protected String codePostal;
	protected String dateEntreeVisiteur;
	protected String codeUnite;
	
	
	/**
	 * Construteur
	 * @param unMatriculeVisiteur
	 * @param unNomVisiteur
	 * @param unPrenomVisiteur
	 * @param unLogin
	 * @param unMdp
	 * @param uneAdresseVisiteur
	 * @param codePostal
	 * @param uneDateEntree
	 * @param unCodenite
	
	 */
	public Visiteur (String unMatriculeVisiteur, String unNomVisiteur, String unPrenomVisiteur, String unLogin, String unMdp, String uneAdresseVisiteur, String codePostal,  String uneDateEntree, String codeUnite){
		
		this.matriculeVisiteur = unMatriculeVisiteur;
		this.nomVisiteur = unNomVisiteur;
		this.prenomVisiteur = unPrenomVisiteur;
		this.loginVisiteur = unLogin;
		this.mdpVisiteur = unMdp;
		this.adresseVisiteur = uneAdresseVisiteur;
		this.codePostal = codePostal;
		this.dateEntreeVisiteur = uneDateEntree;
		this.codeUnite = codeUnite;
		
		
	}

	/**
	 * 
	 * @return Retourne le matricule du visiteur
	 */
	public String getMatriculeVisiteur() {
		return matriculeVisiteur;
	}

	/**
	 * 
	 * @param Set le matriculeVisiteur
	 */
	public void setMatriculeVisiteur(String matriculeVisiteur) {
		this.matriculeVisiteur = matriculeVisiteur;
	}

	/**
	 * 
	 * @return Retourne le nom du visiteur
	 */
	public String getNomVisiteur() {
		return nomVisiteur;
	}

	/**
	 * 
	 * @param Set le nomVisiteur
	 */
	public void setNomVisiteur(String nomVisiteur) {
		this.nomVisiteur = nomVisiteur;
	}

	/**
	 * 
	 * @return Retourne le prénom du visiteur
	 */
	public String getPrenomVisiteur() {
		return prenomVisiteur;
	}

	/**
	 * 
	 * @param Set le prenomVisiteur
	 */
	public void setPrenomVisiteur(String prenomVisiteur) {
		this.prenomVisiteur = prenomVisiteur;
	}

	/**
	 * 
	 * @return Retourne le login du visiteur
	 */
	public String getLoginVisiteur() {
		return loginVisiteur;
	}

	/**
	 * 
	 * @param Set le loginVisiteur
	 */
	public void setLoginVisiteur(String loginVisiteur) {
		this.loginVisiteur = loginVisiteur;
	}

	/**
	 * 
	 * @return Return le mot de passe du visiteur
	 */
	public String getMdpVisiteur() {
		return mdpVisiteur;
	}

	/**
	 * 
	 * @param Set le mdpVisiteur
	 */
	public void setMdpVisiteur(String mdpVisiteur) {
		this.mdpVisiteur = mdpVisiteur;
	}

	/**
	 * 
	 * @return Retourne l'adresse du visiteur
	 */
	public String getAdresseVisiteur() {
		return adresseVisiteur;
	}

	/**
	 * 
	 * @param Set l'adresseVisiteur
	 */
	public void setAdresseVisiteur(String adresseVisiteur) {
		this.adresseVisiteur = adresseVisiteur;
	}



	/**
	 * 
	 * @return Retourne la date d'embauche du visiteur
	 */
	public String getDateEntreeVisiteur() {
		return dateEntreeVisiteur;
	}

	/**
	 * 
	 * @param Set la dateEntreeVisiteur
	 */
	public void setDateEntreeVisiteur(String dateEntreeVisiteur) {
		this.dateEntreeVisiteur = dateEntreeVisiteur;
	}

	public String getCodeUnite() {
		return codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}


	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal codePostal � d�finir.
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return 
	 * @return Renvoie codePostal.
	 */
	public String getVille() {
		return codePostal;
	}

}