package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Peinture extends Lot {

	private float surface;

	/**
	 * 
	 */
	public Peinture() {
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
	public Peinture(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement, float coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float surface) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surface=surface;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	
	
}