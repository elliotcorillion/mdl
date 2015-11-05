package gsb.modele.dao;

import gsb.modele.Unite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gsb.modele.dao.ConnexionMySql;

/**
 * @author Erwan
 * @date 16/10/15
 */

public class UniteDao {
			
	public static Unite rechercherUnite(String codeUnite){
			
		Unite uneUnite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from UNITE where CODEUNITE='"+codeUnite+"'");
		
		try {
			if (reqSelection.next()) {
				uneUnite = new Unite(reqSelection.getString(1), reqSelection.getString(2));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from LOCALITE where CODEPOSTAL='"+codeUnite+"'");
			e.printStackTrace();	
		}	
		ConnexionMySql.fermerConnexionBd();
		return uneUnite;
		
	}
	
	public static void creerUnite(Unite uneUnite){
		
		String requeteInsertion;
		String code= uneUnite.getCodeUnite();
		String nom = uneUnite.getNomUnite();
		
		try{
			requeteInsertion = "insert into destination values('"+code+"','"+nom+"')";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - insert into destination values('"+code+"','"+nom+"')");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static void supprimerUnite(String codeUnite){
		
		String requeteInsertion;
		
		try{
			requeteInsertion = "delete from UNITE where CODEUNIT='"+codeUnite+"'";
			System.out.println(requeteInsertion);
			int result = ConnexionMySql.execReqMaj(requeteInsertion);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("erreur reqSelection.next() pour la requête - delete from UNITE where CODEUNIT='"+codeUnite+"'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		
	}
	
	public static ArrayList<Unite> retournerCollectionDesUnites(){
		ArrayList<Unite> collectionDesUnites = new ArrayList<Unite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEUNIT from UNITE");
		try{
		while (reqSelection.next()) {
			String codeUnite = reqSelection.getString(1);
		    collectionDesUnites.add(UniteDao.rechercherUnite(codeUnite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesUnites()");
		}
		return collectionDesUnites;
	}
	
}