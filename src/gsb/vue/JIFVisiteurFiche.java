package gsb.vue;

import gsb.modele.Stocker;


/**
 * @author Elliot
 * 4 Dec 2015
 * Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class JIFVisiteurFiche extends JIFVisiteur {

	private static final long serialVersionUID = 1L;

	public JIFVisiteurFiche(Stocker unStock) {
		super();
		this.remplirText(unStock);
	}
	
}