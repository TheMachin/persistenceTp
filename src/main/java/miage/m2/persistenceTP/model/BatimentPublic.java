package miage.m2.persistenceTP.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class BatimentPublic extends Projet {

	private String Ministere;

}