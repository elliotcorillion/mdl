/*
 * Cr�� le 3 Dec 2015
 *
 */
package gsb.vue;

import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * 3 mars 2015
 *  Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class JIFVisiteurListeCol extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private ArrayList<Visiteur> lesVisiteurs;

	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JTextField JTcodeVisiteur;
	protected JButton JBafficherFiche;
	protected MenuPrincipal fenetreContainer;

	public JIFVisiteurListeCol(MenuPrincipal uneFenetreContainer) {

		fenetreContainer = uneFenetreContainer;
		// r�cup�ration des donn�es Visiteur dans la collection
		lesVisiteurs = VisiteurDao.retournerCollectionDesVisiteurs();

		int nbLignes = lesVisiteurs.size();

		JTable table;
		
		

		p = new JPanel(); // panneau principal de la fen�tre

		int i=0;
		String[][] data = new String[nbLignes][4] ;
		for(Visiteur unVisiteur : lesVisiteurs){
			data[i][0] = unVisiteur.getMatriculeVisiteur();
			data[i][1] = unVisiteur.getNomVisiteur();
			data[i][2] = unVisiteur.getPrenomVisiteur();
			data[i][3] = unVisiteur.getCodeUnite();
			i++;
			}
		String[] columnNames = {"Matricule", "Nom","Prenom","Unite"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		
		pSaisie = new JPanel();
		JTcodeVisiteur = new JTextField(20);
		JTcodeVisiteur.setMaximumSize(JTcodeVisiteur.getPreferredSize());
		JBafficherFiche = new JButton("Afficher Stock Visiteur");
		JBafficherFiche.addActionListener(this);
		pSaisie.add(JTcodeVisiteur);
		pSaisie.add(JBafficherFiche);
		p.add(pSaisie);
		
		// mise en forme de la fen�tre
		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		if (source == JBafficherFiche){
   			Stocker unStock = StockerDao.rechercherStock(JTcodeVisiteur.getText());
   			if (unStock!=null){
   	   			fenetreContainer.ouvrirFenetre(new JIFVisiteurFiche(unStock));
   			}
   		}	
	}
}
