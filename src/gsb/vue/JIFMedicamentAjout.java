package gsb.vue;

import gsb.modele.Medicament;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFMedicamentAjout extends JInternalFrame  {
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
    
	protected JTextField JTdepotLegal;
	protected JTextField JTnomCom;
	protected JTextField JTcompo;
	protected JTextField JTeffet;
	protected JTextField JTcontreIndic;
    protected JTextField JTprixEchan;
    protected JTextField JTcodeFam;
    protected JTextField JTlibFam;
	
    public JIFMedicamentAjout() {
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
         JTdepotLegal.setMaximumSize(JTdepotLegal.getPreferredSize());
         JTnomCom = new JTextField(40);
         JTcompo = new JTextField(40);
         JTeffet = new JTextField(40);    
         JTcontreIndic = new JTextField(40);
         JTprixEchan = new JTextField(40);
         JTcodeFam = new JTextField(40);
         JTlibFam = new JTextField(40);
         
         pTexte.add(JLdepotLegal);
         pTexte.add(JTdepotLegal);
         pTexte.add(JLnomCom);
         pTexte.add(JTnomCom);
         pTexte.add(JLcompo);
         pTexte.add(JTcompo);
         pTexte.add(JLeffet);
         pTexte.add(JTeffet);
         pTexte.add(JLcontreIndic);
         pTexte.add(JTcontreIndic);
         pTexte.add(JLprixEchan);
         pTexte.add(JTprixEchan);
         pTexte.add(JLcodeFam);
         pTexte.add(JTcodeFam);
         pTexte.add(JLlibFam);
         pTexte.add(JTlibFam);
		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medicament unMedicament) {	
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

