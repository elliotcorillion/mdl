package gsb.modele;

/**
 * @author Erwan
 * @date 15/10/15
 */

public class Famille {
	
	protected String codeFamille;
	protected String libelleFamille;
	
	
	/**
	 * Constructeur
	 * @param unCodeFamille
	 * @param unLibelleFamille
	 */
	public Famille(String unCodeFamille, String unLibelleFamille){
		
		this.codeFamille = unCodeFamille;
		this.libelleFamille = unLibelleFamille;
		
	}

	/**
	 * 
	 * @return Return le code de la famille de médicament
	 */
	public String getCodeFamille() {
		return codeFamille;
	}

	/**
	 * 
	 * @param Set le codeFamille
	 */
	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille;
	}

	/**
	 * 
	 * @returnle Return lelibelle de la famille de médicament
	 */
	public String getLibelleFamille() {
		return libelleFamille;
	}

	/**
	 * 
	 * @param Set le libelleFamille
	 */
	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}
	
}