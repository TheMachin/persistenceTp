package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Immeuble extends Projet {

	private int nbNiveaux;

	@OneToMany
	private Set<Appartement> appartements;

}