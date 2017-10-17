package miage.m2.persistenceTP.model;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Projet {

	@Id
	private String refProjet;

	private String nom;

	private float surfaceTotal;

	private String avancement;

	@Temporal(TemporalType.DATE)
	private Date dateFinEstime;

	private float coutTotalEstime;

	private boolean termine;

	@Temporal(TemporalType.DATE)
	private Date dateFinReelle;

	@OneToOne
	private Adresse localisation;

	@OneToMany
	private Set<Lot> lots;

}