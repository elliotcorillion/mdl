package gsb.modele;

/**
 * @author Elliot
 * @date 15/10/15
 */

public class Medicament {

	protected String depotLegal;
	protected String nomCommercial;
	protected String composition;
	protected String effets;
	protected String contreIndication;
	protected float prixEchantillon; 
	protected Famille laFamille;
	
	
	/**
	 * Constructeur
	 * @param unDepotLegal
	 * @param unNomCommercial
	 * @param uneComposition
	 * @param desEffets
	 * @param uneContreIndication
	 * @param unPrixEchantillon
	 * @param uneFamille
	 */
	public Medicament(String unDepotLegal, String unNomCommercial, String uneComposition, String desEffets, String uneContreIndication, float unPrixEchantillon, Famille uneFamille){
		
		this.depotLegal = unDepotLegal;
		this.nomCommercial = unNomCommercial;
		this.composition = uneComposition;
		this.effets = desEffets;
		this.contreIndication = uneContreIndication;
		this.prixEchantillon = unPrixEchantillon;
		this.laFamille = uneFamille;
		
	}

	/**
	 * 
	 * @return Return le dépôt légal du médoc
	 */
	public String getDepotLegal() {
		return depotLegal;
	}

	/**
	 * 
	 * @param Set le depotLegal
	 */
	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}

	/**
	 * 
	 * @return Return le nom du médoc
	 */
	public String getNomCommercial() {
		return nomCommercial;
	}

	/**
	 * 
	 * @param Set le nomCommercial
	 */
	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}

	/**
	 * 
	 * @return Return la compo du médoc
	 */
	public String getComposition() {
		return composition;
	}

	/**
	 * 
	 * @param Set la composition
	 */
	public void setComposition(String composition) {
		this.composition = composition;
	}

	/**
	 * 
	 * @return Retourne les effets du médoc
	 */
	public String getEffets() {
		return effets;
	}

	/**
	 * 
	 * @param Set les effets
	 */
	public void setEffets(String effets) {
		this.effets = effets;
	}

	/**
	 * 
	 * @return Return les contre-indications du médoc
	 */
	public String getContreIndication() {
		return contreIndication;
	}

	/**
	 * 
	 * @param Set les contreIndication
	 */
	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}

	/**
	 * 
	 * @return Return le prix de l'échantillon du médoc
	 */
	public float getPrixEchantillon() {
		return prixEchantillon;
	}

	/**
	 * 
	 * @param Set le prixEchantillon
	 */
	public void setPrixEchantillon(float prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}

	/**
	 * 
	 * @return Return l'objet Famille
	 */
	public Famille getLaFamille() {
		return laFamille;
	}

	/**
	 * 
	 * @param Set l'objet laFamille
	 */
	public void setLaFamille(Famille laFamille) {
		this.laFamille = laFamille;
	}
	
}