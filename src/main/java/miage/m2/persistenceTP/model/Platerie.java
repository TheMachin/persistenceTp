package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Platerie extends Lot {

	private float surfacePlafond;

	private float surfaceMur;

	public Platerie(){
		
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
	public Platerie(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement, float coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, float surfacePlafond, float surfaceMur) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.surfacePlafond=surfacePlafond;
		this.surfaceMur=surfaceMur;
	}

	public float getSurfacePlafond() {
		return surfacePlafond;
	}

	public void setSurfacePlafond(float surfacePlafond) {
		this.surfacePlafond = surfacePlafond;
	}

	public float getSurfaceMur() {
		return surfaceMur;
	}

	public void setSurfaceMur(float surfaceMur) {
		this.surfaceMur = surfaceMur;
	}
	
	
	
	
}