package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Dallage extends Lot {

	private float surfaceTotale;

	public Dallage(){
		
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
	public Dallage(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement, float coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float surfaceTotale) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surfaceTotale=surfaceTotale;
	}

	public float getSurfaceTotale() {
		return surfaceTotale;
	}

	public void setSurfaceTotale(float surfaceTotale) {
		this.surfaceTotale = surfaceTotale;
	}

	@Override
	public String toString() {
		return "Dallage [surfaceTotale=" + surfaceTotale + "]";
	}
	
	
	
	
	
}