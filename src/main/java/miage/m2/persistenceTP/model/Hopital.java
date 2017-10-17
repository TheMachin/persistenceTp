package miage.m2.persistenceTP.model;

import javax.persistence.Entity;

@Entity
public class Hopital extends BatimentPublic {

	private int nbLits;

	private int nbServices;

}