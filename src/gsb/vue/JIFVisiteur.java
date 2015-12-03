/*
 * Cr�� le 22 mars 2012
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.vue;

import gsb.modele.Stocker;
import gsb.modele.Visiteur;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFVisiteur extends JInternalFrame  {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	protected JLabel JLcode;
	protected JLabel JLnom;
	protected JLabel JLstock;
    
	protected JTextField JTcode;
	protected JTextField JTnom;
	protected JTextField JTstock;
	
    public JIFVisiteur() {
    	p = new JPanel();  // panneau principal de la fen�tre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(3,2));
    	
    	 JLcode = new JLabel("Code");
         JLnom = new JLabel("Nom");
         JLstock = new JLabel("Stock");
         
         JTcode = new JTextField(20);
         JTcode.setMaximumSize(JTcode.getPreferredSize());
         JTnom = new JTextField();
         JTstock = new JTextField();
         
         pTexte.add(JLcode);
         pTexte.add(JTcode);
         pTexte.add(JLnom);
         pTexte.add(JTnom);
         pTexte.add(JLstock);
         pTexte.add(JTstock);
		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Stocker unStock) 	
    {  // m�thode qui permet de remplir les zones de texte � partir des valeurs pass�es en param�tres
        JTcode.setText(unStock.getMatricule());        
        JTnom.setText(unStock.getNom());
        JTstock.setText(String.valueOf(unStock.getQteStock()));
     }
     
      public void viderText() 	
    {  // m�thode qui permet de vider les zones de texte 
        JTcode.setText("");        
        JTnom.setText("");
        JTstock.setText("");
        
     }

    
}
