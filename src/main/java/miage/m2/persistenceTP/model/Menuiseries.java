package miage.m2.persistenceTP.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Menuiseries extends Lot {

	private int nbFenetres;

	private int nbPortes;

	private int nbFenetreToit;

	public Menuiseries(){
		
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
	public Menuiseries(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement,
			float coutReel, Date dateFinReel, Set<Entreprise> realise, Entreprise responsable, int nbFenetres, int nbPortes, int nbFenetreToit) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		this.nbFenetres=nbFenetres;
		this.nbPortes=nbPortes;
		this.nbFenetreToit=nbFenetreToit;
	}

	public int getNbFenetres() {
		return nbFenetres;
	}

	public void setNbFenetres(int nbFenetres) {
		this.nbFenetres = nbFenetres;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public int getNbFenetreToit() {
		return nbFenetreToit;
	}

	public void setNbFenetreToit(int nbFenetreToit) {
		this.nbFenetreToit = nbFenetreToit;
	}
	
	
	
	
	
}