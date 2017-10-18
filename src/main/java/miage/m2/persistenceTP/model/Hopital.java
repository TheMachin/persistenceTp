package miage.m2.persistenceTP.model;

import javax.persistence.Entity;

@Entity
public class Hopital extends BatimentPublic {

	private int nbLits;

	private int nbServices;

	public Hopital(){
		
	}

	/**
	 * @param ministere
	 */
	public Hopital(String ministere, int nbLits, int nbServices) {
		super(ministere);
		this.nbLits=nbLits;
		this.nbServices=nbServices;
	}

	public int getNbLits() {
		return nbLits;
	}

	public void setNbLits(int nbLits) {
		this.nbLits = nbLits;
	}

	public int getNbServices() {
		return nbServices;
	}

	public void setNbServices(int nbServices) {
		this.nbServices = nbServices;
	}
	
	
	
}