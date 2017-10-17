package miage.m2.persistenceTP.model;

import javax.persistence.Entity;

@Entity
public class Electricite extends Lot {

	private int nbTableau;

	private float longueurCable;

}