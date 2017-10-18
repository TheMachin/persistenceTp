package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String numero;

	private String rue;

	private String CP;

	private String ville;

	public Adresse(){
		
	}

	/**
	 * @param numero
	 * @param rue
	 * @param cP
	 * @param ville
	 */
	public Adresse(String numero, String rue, String cP, String ville) {
		this.numero = numero;
		this.rue = rue;
		CP = cP;
		this.ville = ville;
	}

	public int getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public String getRue() {
		return rue;
	}

	public String getCP() {
		return CP;
	}

	public String getVille() {
		return ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", CP=" + CP + ", ville=" + ville + "]";
	}
	
	
	
}