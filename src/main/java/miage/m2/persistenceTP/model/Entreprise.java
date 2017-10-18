package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;

@Entity
public class Entreprise {

	@Id
	private String nom;

	@Enumerated(EnumType.STRING)
	private ECorpsMetier corpsMetier;

	private String numTel;

	@OneToOne
	private Adresse siegeSocial;

	public Entreprise(){
		
	}
	
	/**
	 * @param nom
	 * @param corpsMetier
	 * @param numTel
	 * @param siegeSocial
	 */
	public Entreprise(String nom, ECorpsMetier corpsMetier, String numTel, Adresse siegeSocial) {
		this.nom = nom;
		this.corpsMetier = corpsMetier;
		this.numTel = numTel;
		this.siegeSocial = siegeSocial;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ECorpsMetier getCorpsMetier() {
		return corpsMetier;
	}

	public void setCorpsMetier(ECorpsMetier corpsMetier) {
		this.corpsMetier = corpsMetier;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public Adresse getSiegeSocial() {
		return siegeSocial;
	}

	public void setSiegeSocial(Adresse siegeSocial) {
		this.siegeSocial = siegeSocial;
	}

	
	
}