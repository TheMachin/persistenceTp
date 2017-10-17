package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Lotissement extends Projet {

	private int nbMaisons;

	@OneToMany
	private Set<Maison> maisons;
}