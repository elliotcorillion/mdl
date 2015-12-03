package gsb.modele.dao;

import gsb.modele.Visiteur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Elliot
 * @date 16/10/15 
 */

public class VisiteurDao {
	
	/**
	 * @param Matricule
	 * @return Retourne une collection de visiteurs en fonction de son matricule
	 */
	public static Visiteur rechercherVisiteur(String Matricule){
		
		Visiteur unVisiteur=null;
		ResultSet reqSelectionVisiteur = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE='"+Matricule+"';");
		
		try {
			if (reqSelectionVisiteur.next()) {
				unVisiteur = new Visiteur(reqSelectionVisiteur.getString(1), reqSelectionVisiteur.getString(2), reqSelectionVisiteur.getString(3), reqSelectionVisiteur.getString(4), reqSelectionVisiteur.getString(5), reqSelectionVisiteur.getString(6), reqSelectionVisiteur.getString(7),reqSelectionVisiteur.getString(8), reqSelectionVisiteur.getString(9));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where MATRICULE='"+Matricule+"';");
			e.printStackTrace();	
		}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
		
	}
	
	public static void creerVisiteur(Visiteur unVisiteur){
		
		String requeteInsertion;
		String matricule= unVisiteur.getMatriculeVisiteur();
		String nom = unVisiteur.getNomVisiteur();
		String prenom = unVisiteur.getPrenomVisiteur();
		String login = unVisiteur.getLoginVisiteur();
		String mdp = unVisiteur.getMdpVisiteur();
		String adresse = unVisiteur.getAdresseVisiteur();
		String cp = unVisiteur.getCodePostal();
		String date = unVisiteur.getDateEntreeVisiteur();
		String codeUnite = unVisiteur.getNomVisiteur();
		
		
		try{
			requeteInsertion = "insert into destination values('"+matricule+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+cp+"','"+date+"','"+codeUnite+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into destination values('"+matricule+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+cp+"','"+date+"','"+codeUnite+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerVisiteur(String MATRICULE){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from VISITEUR where MATRICULE='"+MATRICULE+"';";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from VISITEUR where MATRICULE='"+MATRICULE+"';");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs= new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from visiteur;");
		try{
		while (reqSelection.next()) {
			String MATRICULE = reqSelection.getString(1);
		    collectionDesVisiteurs.add(VisiteurDao.rechercherVisiteur(MATRICULE));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}
	
}