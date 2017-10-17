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

}