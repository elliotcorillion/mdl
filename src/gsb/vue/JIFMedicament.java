package gsb.vue;

import gsb.modele.Medicament;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFMedicament extends JInternalFrame  {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	protected JLabel JLdepotLegal;
	protected JLabel JLnomCom;
	protected JLabel JLcompo;
	protected JLabel JLeffet;
	protected JLabel JLcontreIndic;
    protected JLabel JLprixEchan;
    protected JLabel JLcodeFam;
    protected JLabel JLlibFam;
    ;
    
	protected JTextField JTdepotLegal;
	protected JTextField JTnomCom;
	protected JTextField JTcompo;
	protected JTextField JTeffet;
	protected JTextField JTcontreIndic;
    protected JTextField JTprixEchan;
    protected JTextField JTcodeFam;
    protected JTextField JTlibFam;
	
    public JIFMedicament() {
    	p = new JPanel();  // panneau principal de la fen�tre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(8,2));
    	
        JLdepotLegal = new JLabel("Depot Légal");
        JLnomCom = new JLabel("Nom Commerciale");
        JLcompo = new JLabel("Composition");
        JLeffet = new JLabel("Effet");
        JLcontreIndic = new JLabel("Contre Indication");
        JLprixEchan = new JLabel("Prix Echantillon");
        JLcodeFam = new JLabel("Code Famille");
        JLlibFam = new JLabel("Libellé Famille");
         
         JTdepotLegal = new JTextField(20);
         JTnomCom = new JTextField();
         JTcompo = new JTextField();
         JTeffet = new JTextField();    
         JTcontreIndic = new JTextField();
         JTprixEchan = new JTextField();
         JTcodeFam = new JTextField();
         JTlibFam = new JTextField();
         
         pTexte.add(JTdepotLegal);
         pTexte.add(JTnomCom);
         pTexte.add(JTcompo);
         pTexte.add(JTeffet);
         pTexte.add(JTcontreIndic);
         pTexte.add(JTprixEchan);
         pTexte.add(JTcodeFam);
         pTexte.add(JTlibFam);
		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medicament unMedicament) 	
    {  // m�thode qui permet de remplir les zones de texte � partir des valeurs pass�es en param�tres
        JTdepotLegal.setText(unMedicament.getDepotLegal());
        JTnomCom.setText(unMedicament.getNomCommercial());
        JTcompo.setText(unMedicament.getComposition());
        JTeffet.setText(unMedicament.getEffets());    
        JTcontreIndic.setText(unMedicament.getContreIndication());
        JTprixEchan.setText(String.valueOf(unMedicament.getPrixEchantillon()));
        JTcodeFam.setText(unMedicament.getCodeFamille());
        JTlibFam.setText(unMedicament.getLibelleFamille());
     }
     
      public void viderText() 	
    {  // m�thode qui permet de vider les zones de texte 
    	  JTdepotLegal.setText("");        
    	  JTnomCom.setText("");
    	  JTcompo.setText("");
    	  JTeffet.setText("");    
    	  JTcontreIndic.setText("");
    	  JTprixEchan.setText("");
    	  JTcodeFam.setText("");
    	  JTlibFam.setText("");
     }

}
