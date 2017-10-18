package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Charpente extends Lot {

	@Enumerated(EnumType.STRING)
	private ECharpente typeCharpente;

	/**
	 * 
	 */
	public Charpente() {
		
	}

	/**
	 * @param numero
	 * @param dateDebut
	 * @param dureeEstime
	 * @param coutEstime
	 * @param avancement
	 * @param coutReel
	 * @param dateFinReel
	 * @param realise
	 * @param responsable
	 */
	public Charpente(String numero, Date dateDebut, int dureeEstime, float coutEstime, String avancement,
			float coutReel, Date dateFinReel, Set<Entreprise> realise, Entreprise responsable) {
		super(numero, dateDebut, dureeEstime, coutEstime, avancement, coutReel, dateFinReel, realise, responsable);
		// TODO Auto-generated constructor stub
	}



	public ECharpente getTypeCharpente() {
		return typeCharpente;
	}

	public void setTypeCharpente(ECharpente typeCharpente) {
		this.typeCharpente = typeCharpente;
	}

	@Override
	public String toString() {
		return "Charpente [typeCharpente=" + typeCharpente + "]";
	}

	
	
}