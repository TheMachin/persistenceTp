package miage.m2.persistenceTP.model;

import javax.persistence.Entity;

@Entity
public abstract class BatimentPublic extends Projet {

	private String Ministere;

	public BatimentPublic(){
		
	}

	public String getMinistere() {
		return Ministere;
	}

	public void setMinistere(String ministere) {
		Ministere = ministere;
	}

	/**
	 * @param ministere
	 */
	public BatimentPublic(String ministere) {
		Ministere = ministere;
	}
	
	
	
}