package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class EtablissementScolaire extends BatimentPublic {

	private int nbEleves;

	@Enumerated(EnumType.STRING)
	private EEtaScolaire categorie;

}