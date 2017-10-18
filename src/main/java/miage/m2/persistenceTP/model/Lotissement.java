package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.Set;

@Entity
public class Lotissement extends Projet {

	private int nbMaisons;

	@OneToMany
	private Set<Maison> maisons;
	
	public Lotissement(){
		
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
	public Lotissement(String refProjet, String nom, float surfaceTotal, String avancement, Date dateFinEstime,
			float coutTotalEstime, boolean termine, Date dateFinReelle, Adresse localisation, Set<Lot> lots, int nbMaisons, Set<Maison> maisons) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstime, coutTotalEstime, termine, dateFinReelle, localisation,
				lots);
		this.nbMaisons=nbMaisons;
		this.maisons=maisons;
	}

	public int getNbMaisons() {
		return nbMaisons;
	}

	public void setNbMaisons(int nbMaisons) {
		this.nbMaisons = nbMaisons;
	}

	public Set<Maison> getMaisons() {
		return maisons;
	}

	public void setMaisons(Set<Maison> maisons) {
		this.maisons = maisons;
	}
	
	public void addMaison(Maison m){
		if(!this.maisons.contains(m)){
			this.maisons.add(m);
		}
	}
	
}