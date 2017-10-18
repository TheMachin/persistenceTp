package miage.m2.persistenceTP.model;

import javax.persistence.Entity;

@Entity
public class Musee extends BatimentPublic {

	private int nbSalles;
	
	public Musee(){
		
	}

	/**
	 * @param ministere
	 */
	public Musee(String ministere, int nbSalles) {
		super(ministere);
		this.nbSalles=nbSalles;
	}

	public int getNbSalles() {
		return nbSalles;
	}

	public void setNbSalles(int nbSalles) {
		this.nbSalles = nbSalles;
	}
	
	
	
	

}