package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;

@Entity
public class Appartement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int niveau;

	private float surface;

	@Enumerated(EnumType.STRING)
	private ETypeAppart type;
	
	public Appartement(){
		
	}

	/**
	 * @param niveau
	 * @param surface
	 * @param type
	 */
	public Appartement(int niveau, float surface, ETypeAppart type) {
		this.niveau = niveau;
		this.surface = surface;
		this.type = type;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	public ETypeAppart getType() {
		return type;
	}

	public void setType(ETypeAppart type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Appartement [niveau=" + niveau + ", surface=" + surface + ", type=" + type + "]";
	}
	
	

}