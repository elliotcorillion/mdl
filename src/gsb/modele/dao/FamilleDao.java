package gsb.modele.dao;

import gsb.modele.Famille;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Elliot
 * @date 16/10/15 
 */

public class FamilleDao {
	
	public static Famille rechercherFamille(String codeFamille){
			
		Famille uneFamille=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Famille where CODEFamille='"+codeFamille+"'");
		
		try {
			if (reqSelection.next()) {
				uneFamille = new Famille(reqSelection.getString(1), reqSelection.getString(2));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from LOCALITE where CODEPOSTAL='"+codeFamille+"'");
			e.printStackTrace();	
		}	
		ConnexionMySql.fermerConnexionBd();
		return uneFamille;
		
	}
	
	public static void creerFamille(Famille unFamille){
		
		String requeteInsertion;
		String code= unFamille.getCodeFamille();
		String libelle = unFamille.getLibelleFamille();
		
		try{
			requeteInsertion = "insert into destination values('"+code+"','"+libelle+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into destination values('"+code+"','"+libelle+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerFamille(String codeFamille){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from Famille where MATRICULE='"+codeFamille+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from UNITE where CODEUNITE='"+codeFamille+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Famille> retournerCollectionDesFamilles(){
		ArrayList<Famille> collectionDesFamilles= new ArrayList<Famille>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEUNITE from UNITE");
		try{
		while (reqSelection.next()) {
			String codeFamille = reqSelection.getString(1);
		    collectionDesFamilles.add(FamilleDao.rechercherFamille(codeFamille));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesFamilles()");
		}
		return collectionDesFamilles;
	}
	
}