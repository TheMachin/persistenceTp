package miage.m2.persistenceTP.model;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Projet {

	@Id
	private String refProjet;

	private String nom;

	private float surfaceTotal;

	private String avancement;

	@Temporal(TemporalType.DATE)
	private Date dateFinEstime;

	private float coutTotalEstime;

	private boolean termine;

	@Temporal(TemporalType.DATE)
	private Date dateFinReelle;

	@OneToOne
	private Adresse localisation;

	@OneToMany
	private Set<Lot> lots;

	@ManyToMany
	private Set<Acteur> participants;

	public Projet(){
		
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
	public Projet(String refProjet, String nom, float surfaceTotal, String avancement, Date dateFinEstime,
			float coutTotalEstime, boolean termine, Date dateFinReelle, Adresse localisation, Set<Lot> lots) {
		this.refProjet = refProjet;
		this.nom = nom;
		this.surfaceTotal = surfaceTotal;
		this.avancement = avancement;
		this.dateFinEstime = dateFinEstime;
		this.coutTotalEstime = coutTotalEstime;
		this.termine = termine;
		this.dateFinReelle = dateFinReelle;
		this.localisation = localisation;
		this.lots = lots;
	}

	public String getRefProjet() {
		return refProjet;
	}

	public void setRefProjet(String refProjet) {
		this.refProjet = refProjet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSurfaceTotal() {
		return surfaceTotal;
	}

	public void setSurfaceTotal(float surfaceTotal) {
		this.surfaceTotal = surfaceTotal;
	}

	public String getAvancement() {
		return avancement;
	}

	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}

	public Date getDateFinEstime() {
		return dateFinEstime;
	}

	public void setDateFinEstime(Date dateFinEstime) {
		this.dateFinEstime = dateFinEstime;
	}

	public float getCoutTotalEstime() {
		return coutTotalEstime;
	}

	public void setCoutTotalEstime(float coutTotalEstime) {
		this.coutTotalEstime = coutTotalEstime;
	}

	public boolean isTermine() {
		return termine;
	}

	public void setTermine(boolean termine) {
		this.termine = termine;
	}

	public Date getDateFinReelle() {
		return dateFinReelle;
	}

	public void setDateFinReelle(Date dateFinReelle) {
		this.dateFinReelle = dateFinReelle;
	}

	public Adresse getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Adresse localisation) {
		this.localisation = localisation;
	}

	public Set<Lot> getLots() {
		return lots;
	}

	public void setLots(Set<Lot> lots) {
		this.lots = lots;
	}

	public Set<Acteur> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Acteur> participants) {
		this.participants = participants;
	}
}