package miage.m2.persistenceTP.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Lot {

	@Id
	private String numero;

	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	private int dureeEstime;

	private float coutEstime;

	private String avancement;

	private float coutReel;

	@Temporal(TemporalType.DATE)
	private Date dateFinReel;

	@ManyToMany
	private Set<Entreprise> realise;

	@ManyToOne
	private Entreprise responsable;

}