package miage.m2.persistenceTP.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Lot {

	@Id
	private String numero;

	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	private int dureeEstime;

	private float coutEstime;

	private String avancement;

	private float coutReel;

	@Temporal(TemporalType.DATE)
	private Date dateFinReel;

	@ManyToMany
	private Set<Entreprise> realise;

	@ManyToOne
	private Entreprise responsable;

	
	public Lot(){
		
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
	public Lot(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement, float coutReel,
			Date dateFinReel, Set<Entreprise> realise, Entreprise responsable) {
		this.numero = numero;
		this.dateDebut = dateDebut;
		this.dureeEstime = dureeEstime;
		this.coutEstime = coutEstime;
		this.avancement = avancement;
		this.coutReel = coutReel;
		this.dateFinReel = dateFinReel;
		this.realise = realise;
		this.responsable = responsable;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDureeEstime() {
		return dureeEstime;
	}

	public void setDureeEstime(int dureeEstime) {
		this.dureeEstime = dureeEstime;
	}

	public float getCoutEstime() {
		return coutEstime;
	}

	public void setCoutEstime(float coutEstime) {
		this.coutEstime = coutEstime;
	}

	public String getAvancement() {
		return avancement;
	}

	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}

	public float getCoutReel() {
		return coutReel;
	}

	public void setCoutReel(float coutReel) {
		this.coutReel = coutReel;
	}

	public Date getDateFinReel() {
		return dateFinReel;
	}

	public void setDateFinReel(Date dateFinReel) {
		this.dateFinReel = dateFinReel;
	}

	public Set<Entreprise> getRealise() {
		return realise;
	}

	public void setRealise(Set<Entreprise> realise) {
		this.realise = realise;
	}

	public Entreprise getResponsable() {
		return responsable;
	}

	public void setResponsable(Entreprise responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Lot [numero=" + numero + ", dateDebut=" + dateDebut + ", dureeEstime=" + dureeEstime + ", coutEstime="
				+ coutEstime + ", avancement=" + avancement + ", coutReel=" + coutReel + ", dateFinReel=" + dateFinReel
				+ ", realise=" + realise + ", responsable=" + responsable + "]";
	}
	
	

}