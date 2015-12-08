/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.modele.dao;

import gsb.modele.Stocker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;



/**
 * @author Isabelle
 * 22 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class StockerDao {
	
	public static Stocker rechercherStock(String unMatricule){
		Stocker unStock=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Stocker where Matricule ='"+unMatricule+"';");
		try {
			if (reqSelection.next()) {
				unStock = new Stocker(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getInt(3));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from Stocker where Matricule ='"+unMatricule+"';");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unStock;
	}
	//
	public static Stocker ajouterStock(String unMatricule, String unNom, int uneQteStock){
		try {
			ResultSet reqSelection = ConnexionMySql.execReqSelection("Insert INTO STOCKER VALUES ('"+unMatricule+"','"+unNom+"',"+uneQteStock+");");
			;
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from Stocker where Matricule ='"+unMatricule+"';");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return null;
	}
	//
	
	
	
	
	
	public static ArrayList<Stocker> retournerCollectionDesStock(){
		ArrayList<Stocker> collectionDesStock = new ArrayList<Stocker>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select Matricule from Stocker;");
		try{
		while (reqSelection.next()) {
			String unMatricule = reqSelection.getString(1);
		    collectionDesStock.add(StockerDao.rechercherStock(unMatricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesStock()");
		}
		return collectionDesStock;
	}

	public static HashMap<String,Stocker> retournerDictionnaireDesStocks(){
		HashMap<String, Stocker> diccoDesStocks = new HashMap<String, Stocker>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MED_DEPOTLEGAL from Medicament");
		try{
		while (reqSelection.next()) {
			String unMatricule = reqSelection.getString(1);
		    diccoDesStocks.put(unMatricule, StockerDao.rechercherStock(unMatricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesStocks()");
		}
		return diccoDesStocks;
	}

}