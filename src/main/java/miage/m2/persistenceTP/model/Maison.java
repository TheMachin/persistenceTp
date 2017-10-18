package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Maison extends Projet {

	private int nbPieces;

	private int nbNiveaux;
	
	public Maison(){
		
	}

	/**
	 * @param refProjet
	 * @param nom
	 * @param surfaceTotal
	 * @param avancement
	 * @param dateFinEstime
	 * @param coutTotalEstime
	 * @param termine
	 * @param dateFinReelle
	 * @param localisation
	 * @param lots
	 */
	public Maison(String refProjet, String nom, float surfaceTotal, String avancement, Date dateFinEstime,
			float coutTotalEstime, boolean termine, Date dateFinReelle, Adresse localisation, Set<Lot> lots, int nbPieces, int nbNiveaux) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstime, coutTotalEstime, termine, dateFinReelle, localisation,
				lots);
		this.nbPieces=nbPieces;
		this.nbNiveaux=nbNiveaux;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public int getNbNiveaux() {
		return nbNiveaux;
	}

	public void setNbNiveaux(int nbNiveaux) {
		this.nbNiveaux = nbNiveaux;
	}
	
	
	
	

}