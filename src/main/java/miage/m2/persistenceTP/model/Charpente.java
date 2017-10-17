package miage.m2.persistenceTP.model;

import miage.m2.persistenceTP.enumeration.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Charpente extends Lot {

	@Enumerated(EnumType.STRING)
	private ECharpente typeCharpente;

}