package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class EtablissementScolaire extends BatimentPublic {

	private int nbEleves;

	@Enumerated(EnumType.STRING)
	private EEtaScolaire categorie;

	public EtablissementScolaire(){
		
	}

	/**
	 * @param nbEleves
	 * @param categorie
	 */
	public EtablissementScolaire(int nbEleves, EEtaScolaire categorie) {
		this.nbEleves = nbEleves;
		this.categorie = categorie;
	}

	/**
	 * @param ministere
	 */
	public EtablissementScolaire(String ministere, int nbEleves, EEtaScolaire categorie) {
		super(ministere);
		this.nbEleves=nbEleves;
		this.categorie=categorie;
	}

	public int getNbEleves() {
		return nbEleves;
	}

	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}

	public EEtaScolaire getCategorie() {
		return categorie;
	}

	public void setCategorie(EEtaScolaire categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "EtablissementScolaire [nbEleves=" + nbEleves + ", categorie=" + categorie + "]";
	}
	
	
	
	
	
}