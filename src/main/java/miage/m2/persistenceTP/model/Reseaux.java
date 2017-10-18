package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Reseaux extends Lot {

	private float longueur;

	public Reseaux(){
		
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
	public Reseaux(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement, float coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float longueur) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.longueur=longueur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	
	
	
	
}