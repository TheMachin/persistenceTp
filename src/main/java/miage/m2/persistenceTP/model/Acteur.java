package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;
import java.util.Set;

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

	@ManyToMany
	private Set<Projet> projets;

}