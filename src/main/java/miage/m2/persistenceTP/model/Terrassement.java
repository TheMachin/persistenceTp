package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Terrassement extends Lot {

	private float volumeTerre;

	public Terrassement(){
		
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
	public Terrassement(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement,
			float coutReel, Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float volumeTerre) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.volumeTerre=volumeTerre;
	}

	public float getVolumeTerre() {
		return volumeTerre;
	}

	public void setVolumeTerre(float volumeTerre) {
		this.volumeTerre = volumeTerre;
	}
	
		
	
}