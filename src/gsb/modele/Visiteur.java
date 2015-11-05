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
	protected String telephoneVisiteur;
	protected String dateEntreeVisiteur;
	protected int prime;
	protected String codeUnite;
	protected String nomUnite;
	protected String codePostal;
	protected String ville;
	
	
	/**
	 * Construteur
	 * @param unMatriculeVisiteur
	 * @param unNomVisiteur
	 * @param unPrenomVisiteur
	 * @param unLogin
	 * @param unMdp
	 * @param uneAdresseVisiteur
	 * @param unTelephoneVisiteur
	 * @param uneDateEntree
	 * @param unePrime
	 * @param uneUnite
	 * @param codePostal
	 * @param ville
	 */
	public Visiteur (String unMatriculeVisiteur, String unNomVisiteur, String unPrenomVisiteur, String unLogin, String unMdp, String uneAdresseVisiteur, String unTelephoneVisiteur, String uneDateEntree, int unePrime, String codeUnite, String nomUnite, String codePostal, String ville){
		
		this.matriculeVisiteur = unMatriculeVisiteur;
		this.nomVisiteur = unNomVisiteur;
		this.prenomVisiteur = unPrenomVisiteur;
		this.loginVisiteur = unLogin;
		this.mdpVisiteur = unMdp;
		this.adresseVisiteur = uneAdresseVisiteur;
		this.telephoneVisiteur = unTelephoneVisiteur;
		this.dateEntreeVisiteur = uneDateEntree;
		this.prime = unePrime;
		this.codeUnite = codeUnite;
		this.nomUnite = nomUnite;
		this.codePostal = codePostal;
		this.ville = ville;
		
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
	 * @return Retourne le numéro de téléphone du visiteur
	 */
	public String getTelephoneVisiteur() {
		return telephoneVisiteur;
	}

	/**
	 * 
	 * @param Set le telephoneVisiteur
	 */
	public void setTelephoneVisiteur(String telephoneVisiteur) {
		this.telephoneVisiteur = telephoneVisiteur;
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

	/**
	 * 
	 * @return Retourne la prime du visiteur
	 */
	public int getPrime() {
		return prime;
	}

	/**
	 * 
	 * @param Set la prime
	 */
	public void setPrime(int prime) {
		this.prime = prime;
	}

	/**
	 * 
	 * @return Retourne la prime du visiteur
	 */
	public String getCodeUnite() {
		return codeUnite;
	}

	/**
	 * 
	 * @param Set la prime
	 */
	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}
	/**
	 * 
	 * @return Retourne la prime du visiteur
	 */
	public String getNomUnite() {
		return nomUnite;
	}

	/**
	 * 
	 * @param Set la prime
	 */
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	/**
	 * @return 
	 * @return Renvoie codePostal.
	 */
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
	/**
	 * @param codePostal codePostal � d�finir.
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}