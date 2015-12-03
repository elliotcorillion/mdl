package gsb.vue;

import gsb.modele.Medicament;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFMedicamentStock extends JInternalFrame implements ActionListener {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	private JButton Afficher;
	protected JLabel JLcodeVisiteur;
	protected JTextField JTcodeVisiteur;

    public JIFMedicamentStock() {
    	p = new JPanel();  // panneau principal de la fen�tre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(1,1));
    	
        Afficher = new JButton("Afficher");
        pBoutons.add(Afficher);
        
        Afficher.addActionListener(this);
        setTitle("Consultation Stock Visiteur");
        
        JLcodeVisiteur = new JLabel("Code Visiteur");
        JTcodeVisiteur = new JTextField(20);
        JTcodeVisiteur.setMaximumSize(JTcodeVisiteur.getPreferredSize());
        pTexte.add(JLcodeVisiteur);
        pTexte.add(JTcodeVisiteur);

		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medicament unMedicament) {	
    	JTcodeVisiteur.setText("");        

     }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
