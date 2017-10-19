package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;
import java.util.Set;

@NamedQueries(
		{
				@NamedQuery(
						name="Entreprise.requete1",
						query="SELECT e.nom FROM Entreprise e"),
				@NamedQuery(
						name="Entreprise.requete5",
						query="SELECT e.nom FROM Entreprise e WHERE e.corpsMetier = :corpsMetier")
		}
)

@Entity
public class Entreprise {

	@Id
	private String nom;

	@Enumerated(EnumType.STRING)
	private ECorpsMetier corpsMetier;

	private String numTel;

	@OneToOne
	private Adresse siegeSocial;

	@OneToMany(mappedBy = "entreprise")
	private Set<Acteur> acteurs;

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

	public Set<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(Set<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
}