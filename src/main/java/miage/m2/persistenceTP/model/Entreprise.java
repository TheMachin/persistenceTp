package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.*;

@Entity
public class Entreprise {

	@Id
	private String nom;

	@Enumerated(EnumType.STRING)
	private ECorpsMetier corpsMetier;

	private String numTel;

	@OneToOne
	private Adresse siegeSocial;

}