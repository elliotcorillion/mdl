package gsb.modele.dao;

import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Elliot
 * @date 16/10/15 
 */

public class VisiteDao {
	
	/**
	 * @param codeVisite
	 * @return Retourne une collection de Visites en fonction de son matricule
	 */
	public static Visite rechercherVisite(String uneReferenceVisite){
		
		Visite uneVisite=null;
		ResultSet reqSelectionVisite = ConnexionMySql.execReqSelection("select * from Visite where CODEVISITE='"+uneReferenceVisite+"'");
		
		try {
			if (reqSelectionVisite.next()) {
				String codeMed = reqSelectionVisite.getString(4);
				Medecin unMed = MedecinDao.rechercherMedecin(codeMed);
				String unMatriculeVisiteur = reqSelectionVisite.getString(5);
				Visiteur unVis = VisiteurDao.rechercherVisiteur(unMatriculeVisiteur) ;
				
				uneVisite = new Visite(reqSelectionVisite.getString(1), reqSelectionVisite.getString(2), reqSelectionVisite.getString(3),unMed, unVis );	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visite where CODEVISITE='"+uneReferenceVisite+"'");
			e.printStackTrace();	
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
		
	}
	
	public static void creerVisite(Visite uneVisite){
		
		String requeteInsertion;
		String uneReferenceVisite= uneVisite.getDateVisite();
		String uneDateVisite = uneVisite.getDateVisite();
		String unCommentaireVisite = uneVisite.getCommentaireVisite();
		Medecin unMedecin = uneVisite.getLeMedecin();
		Visiteur unVisiteur = uneVisite.getLeVisiteur();

		
		try{
			requeteInsertion = "insert into destination values('"+uneReferenceVisite+"','"+uneDateVisite+"','"+unCommentaireVisite+"','"+unMedecin+"','"+unVisiteur+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into destination values('"+uneReferenceVisite+"','"+uneDateVisite+"','"+unCommentaireVisite+"','"+unMedecin+"','"+unVisiteur+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerVisite(String uneReferenceVisite){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from VISITE where CODEVISITE='"+uneReferenceVisite+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from VISITE where CODEVISITE='"+uneReferenceVisite+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Visite> retournerCollectionDesVisites(){
		ArrayList<Visite> collectionDesVisites= new ArrayList<Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEVISITE from VISITE");
		try{
		while (reqSelection.next()) {
			String uneReferenceVisite = reqSelection.getString(1);
		    collectionDesVisites.add(VisiteDao.rechercherVisite(uneReferenceVisite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisites()");
		}
		return collectionDesVisites;
	}
	
}