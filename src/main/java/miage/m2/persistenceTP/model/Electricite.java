package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Electricite extends Lot {

	private int nbTableau;

	private float longueurCable;

	/**
	 * 
	 */
	public Electricite() {
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
	public Electricite(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement,
			float coutReel, Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, int nbTableau, float longueurCable) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
		this.longueurCable=longueurCable;
		this.nbTableau=nbTableau;
	}

	public int getNbTableau() {
		return nbTableau;
	}

	public void setNbTableau(int nbTableau) {
		this.nbTableau = nbTableau;
	}

	public float getLongueurCable() {
		return longueurCable;
	}

	public void setLongueurCable(float longueurCable) {
		this.longueurCable = longueurCable;
	}
	
	

	
	
}