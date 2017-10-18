package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.Set;

@Entity
public class Immeuble extends Projet {

	private int nbNiveaux;

	@OneToMany
	private Set<Appartement> appartements;

	public Immeuble(){
		
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
	public Immeuble(String refProjet, String nom, float surfaceTotal, String avancement, Date dateFinEstime,
			float coutTotalEstime, boolean termine, Date dateFinReelle, Adresse localisation, Set<Lot> lots, int nbNiveaux) {
		super(refProjet, nom, surfaceTotal, avancement, dateFinEstime, coutTotalEstime, termine, dateFinReelle, localisation,
				lots);
		this.nbNiveaux=nbNiveaux;
	}

	public int getNbNiveaux() {
		return nbNiveaux;
	}

	public void setNbNiveaux(int nbNiveaux) {
		this.nbNiveaux = nbNiveaux;
	}

	public Set<Appartement> getAppartements() {
		return appartements;
	}

	public void setAppartements(Set<Appartement> appartements) {
		this.appartements = appartements;
	}
	
	
	
	
}