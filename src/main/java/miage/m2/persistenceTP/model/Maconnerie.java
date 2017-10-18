package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Maconnerie extends Lot {

	private float surfaceMur;

	private int nbPoteaux;

	
	public Maconnerie(){
		
	}


	/**
	 * @param numero
	 * @param dateDebut
	 * @param dureeEstime
	 * @param coutEstime
	 * @param avancement
	 * @param coutReel
	 * @param dateFinReel
	 * @param realise
	 * @param responsable
	 */
	public Maconnerie(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement,
			float coutReel, Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float surfaceMur, int nbPoteaux) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surfaceMur=surfaceMur;
		this.nbPoteaux=nbPoteaux;
	}


	public float getSurfaceMur() {
		return surfaceMur;
	}


	public void setSurfaceMur(float surfaceMur) {
		this.surfaceMur = surfaceMur;
	}


	public int getNbPoteaux() {
		return nbPoteaux;
	}


	public void setNbPoteaux(int nbPoteaux) {
		this.nbPoteaux = nbPoteaux;
	}
	
	
	
}