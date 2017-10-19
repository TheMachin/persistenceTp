package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;
import java.util.Set;

@NamedQueries(
		@NamedQuery(
				name="Acteur.requete9",
				query="SELECT a.nom, a.entreprise.nom FROM Acteur a JOIN a.projets p WHERE p.refProjet = :ref")
)

@Entity
public class Acteur {

	@Id
	private String nom;

	@Enumerated(EnumType.STRING)
	private ETitre titre;

	@Enumerated(EnumType.STRING)
	private EStatut statut;

	@ManyToOne
	private Entreprise entreprise;

	@ManyToMany(mappedBy = "participants")
	private Set<Projet> projets;

	public Acteur(){
		
	}
	
	
	/**
	 * @param nom
	 * @param titre
	 * @param statut
	 * @param entreprise
	 */
	public Acteur(String nom, ETitre titre, EStatut statut, Entreprise entreprise) {
		this.nom = nom;
		this.titre = titre;
		this.statut = statut;
		this.entreprise = entreprise;
	}
	
	/**
	 * @param nom
	 * @param titre
	 * @param statut
	 * @param entreprise
	 * @param projets
	 */
	public Acteur(String nom, ETitre titre, EStatut statut, Entreprise entreprise, Set<Projet> projets) {
		this.nom = nom;
		this.titre = titre;
		this.statut = statut;
		this.entreprise = entreprise;
		this.projets = projets;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ETitre getTitre() {
		return titre;
	}

	public void setTitre(ETitre titre) {
		this.titre = titre;
	}

	public EStatut getStatut() {
		return statut;
	}

	public void setStatut(EStatut statut) {
		this.statut = statut;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Set<Projet> getProjets() {
		return projets;
	}

	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}


	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", titre=" + titre + ", statut=" + statut + ", entreprise=" + entreprise + "]";
	}

	
	
}