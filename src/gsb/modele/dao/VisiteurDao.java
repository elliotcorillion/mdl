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
	 * @param codeVisiteur
	 * @return Retourne une collection de visiteurs en fonction de son matricule
	 */
	public static Visiteur rechercherVisiteur(String codeVisiteur){
		
		Visiteur unVisiteur=null;
		ResultSet reqSelectionVisiteur = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE='"+codeVisiteur+"'");
		
		try {
			if (reqSelectionVisiteur.next()) {
				unVisiteur = new Visiteur(reqSelectionVisiteur.getString(1), reqSelectionVisiteur.getString(2), reqSelectionVisiteur.getString(3), reqSelectionVisiteur.getString(4), reqSelectionVisiteur.getString(5), reqSelectionVisiteur.getString(6), reqSelectionVisiteur.getString(7),reqSelectionVisiteur.getString(8), reqSelectionVisiteur.getInt(9), reqSelectionVisiteur.getString(10), reqSelectionVisiteur.getString(11), reqSelectionVisiteur.getString(12),reqSelectionVisiteur.getString(13));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where CODEPOSTAL='"+codeVisiteur+"'");
			e.printStackTrace();	
		}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
		
	}
	
	public static void creerVisiteur(Visiteur unVisiteur){
		
		String requeteInsertion;
		String code= unVisiteur.getMatriculeVisiteur();
		String nom = unVisiteur.getNomVisiteur();
		String prenom = unVisiteur.getPrenomVisiteur();
		String login = unVisiteur.getLoginVisiteur();
		String mdp = unVisiteur.getMdpVisiteur();
		String adresse = unVisiteur.getAdresseVisiteur();
		String tel = unVisiteur.getTelephoneVisiteur();
		String date = unVisiteur.getDateEntreeVisiteur();
		int prime = unVisiteur.getPrime();
		String codeUnite = unVisiteur.getCodeUnite();
		String nomUnite = unVisiteur.getNomUnite();
		String cp = unVisiteur.getCodePostal();
		String ville = unVisiteur.getVille();
		
		try{
			requeteInsertion = "insert into destination values('"+code+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+tel+"','"+date+"',"+prime+",'"+codeUnite+"','"+nomUnite+"','"+cp+"','"+ville+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into destination values('"+code+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+tel+"','"+date+"',"+prime+",'"+codeUnite+"','"+nomUnite+"','"+cp+"','"+ville+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerVisiteur(String codeVisiteur){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from VISITEUR where MATRICULE='"+codeVisiteur+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from UNITE where CODEUNITE='"+codeVisiteur+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs= new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEUNITE from UNITE");
		try{
		while (reqSelection.next()) {
			String codeVisiteur = reqSelection.getString(1);
		    collectionDesVisiteurs.add(VisiteurDao.rechercherVisiteur(codeVisiteur));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}
	
}