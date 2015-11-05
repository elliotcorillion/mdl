/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.modele.dao;

import gsb.modele.Localite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * @author Erwan
 * @date 16/10/15
 */
public class LocaliteDao {
	
	public static Localite rechercherLocalite(String codeLocalite){
		Localite uneLocalite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = new Localite(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneLocalite;
	}
	
	public static ArrayList<Localite> retournerCollectionDesLocalites(){
		ArrayList<Localite> collectionDesLocalites = new ArrayList<Localite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEPOSTAL from LOCALITE");
		try{
		while (reqSelection.next()) {
			String codeLocalite = reqSelection.getString(1);
		    collectionDesLocalites.add(LocaliteDao.rechercherLocalite(codeLocalite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesLocalites()");
		}
		return collectionDesLocalites;
	}

}