package gsb.vue;

import gsb.modele.Stocker;
import gsb.modele.dao.StockerDao;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFMedicamentAjout extends JInternalFrame implements ActionListener  {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	private JButton Ajouter;

	protected JLabel JLcodeVisiteur;
	protected JLabel JLdepotLegal;
	protected JLabel JLquantite;
    
	protected JTextField JTcodeVisiteur;
	protected JTextField JTdepotLegal;
	protected JTextField JTquantite;
	
    public JIFMedicamentAjout() {
    	super();
    	p = new JPanel();  // panneau principal de la fen�tre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(3,2));
    	
        
        Ajouter = new JButton("Ajouter");
        pBoutons.add(Ajouter);
        
        // d�claration des sources d'�v�nements
        Ajouter.addActionListener(this);
        setTitle("Ajout stock visiteur");
        
        JLcodeVisiteur = new JLabel("Code Visiteur");
        JLdepotLegal = new JLabel("Depot Legal");
        JLquantite = new JLabel("Quantite");
         
        JTcodeVisiteur = new JTextField(20);
        JTcodeVisiteur.setMaximumSize(JTcodeVisiteur.getPreferredSize());
        JTdepotLegal = new JTextField(20);
        JTquantite = new JTextField(20);
         
         pTexte.add(JLcodeVisiteur);
         pTexte.add(JTcodeVisiteur);
         pTexte.add(JLdepotLegal);
         pTexte.add(JTdepotLegal);
         pTexte.add(JLquantite);
         pTexte.add(JTquantite);
		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

    }
   
    public void remplirText(Stocker unStock) {	
    	JTcodeVisiteur.setText("");        
    	JTdepotLegal.setText("");
    	JTquantite.setText("");
     }
    
    public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		if (source == Ajouter){
   			Stocker unStock = StockerDao.ajouterStock(JTcodeVisiteur.getText(),JTdepotLegal.getText(),Integer.parseInt((JTquantite.getText())));
   			if (unStock != null){
			JOptionPane.showMessageDialog(null, "Erreur de saisie.");
			}else{
				JOptionPane.showMessageDialog(null, "Requête reussi.");
			}
	}
    }}

