package miage.m2.persistenceTP.requetes;

import java.util.List;

import javax.persistence.Query;

import miage.m2.persistenceTP.EntityManager;
import miage.m2.persistenceTP.model.Acteur;
import miage.m2.persistenceTP.model.Entreprise;
import miage.m2.persistenceTP.model.EtablissementScolaire;
import miage.m2.persistenceTP.model.Lot;
import miage.m2.persistenceTP.model.Menuiseries;
import miage.m2.persistenceTP.model.Projet;

public class Pair {

	private javax.persistence.EntityManager em = EntityManager.getInstance();
	
	public Pair(){
		em.getTransaction().begin();
		projetEnCours_2();
		nbProjetEtablissementScolaire_4();
		nomContactEntrepriseGeneralBatiment_6();
		lotsProjetEnCoursQueParticipeEntrepriseGeneralBatiment_8();
		nbLotsProjetPLot12_10();
		entrepriseEtAdresseQuiOntRealiseMenuiseriesDansProjetDeMusee_12();
		avencementLotsEtLeurTypeDuProjetPLot12_14();
		em.getTransaction().commit();
	}
	
	public void projetEnCours_2(){
		
		String r = "Select p FROM Projet p WHERE p.termine=:over";
		Query q = em.createQuery(r);
		q.setParameter("over", false);
		List<Projet> listP = q.getResultList();
		System.out.println("Liste des projets en cours : ");
		if(listP.isEmpty()){
			System.out.println("Aucun projet en cours");
		}
		for(Projet p : listP){
			System.out.println(p.toString());
		}
		
	}
	
	public void nbProjetEtablissementScolaire_4(){
		String r = "Select p FROM EtablissementScolaire p WHERE p.termine=:over";
		Query q = em.createQuery(r);
		q.setParameter("over", false);
		List<Projet> listP = q.getResultList();
		System.out.println("Nombre de projets réalisé portant sur un établissement scolaire : "+listP.size());
	}
	
	public void nomContactEntrepriseGeneralBatiment_6(){
		String r = "Select a FROM Acteur a JOIN a.entreprise e WHERE e.nom=:name";
		Query q = em.createQuery(r);
		q.setParameter("name", "Général Bâtiment");
		List<Acteur> list = q.getResultList();
		System.out.println("Nom des contacts de l'entreprise Général Bâtiment");
		if(list.isEmpty()){
			System.out.println("Aucun contact");
		}
		for(Acteur a : list){
			System.out.println(a.getNom());
		}
	}
	
	/**
	 * Voir si ça marche
	 */
	public void lotsProjetEnCoursQueParticipeEntrepriseGeneralBatiment_8(){
		
		String r = "Select l FROM Projet p JOIN p.lots l JOIN l.realisateurs e WHERE e.nom=:name AND p.termine=:over";
		Query q = em.createQuery(r);
		q.setParameter("name", "Général Bâtiment");
		q.setParameter("over", false);
		List<Lot> list = q.getResultList();
		System.out.println("Lots de projet en cours que l'entreprise Général Bâtiment participe");
		if(list.isEmpty()){
			System.out.println("Elle ne participe à aucun projet en cours");
		}
		for(Lot l : list){
			System.out.println(l.getClass().getSimpleName());
		}
	}
	
	public void nbLotsProjetPLot12_10(){
		String r = "Select p FROM Projet p WHERE p.refProjet=:ref";
		Query q = em.createQuery(r);
		q.setParameter("ref", "PLot12");
		int nbResult = q.getResultList().size();
		System.out.println("Nombre de lots du projet PLot12 : "+nbResult);
	}
	
	public void entrepriseEtAdresseQuiOntRealiseMenuiseriesDansProjetDeMusee_12(){
		
		String r="Select e FROM Musee mu JOIN mu.lots l JOIN l.realisateurs e WHERE type(l) = :type";
		Query q = em.createQuery(r);
		q.setParameter("type", Menuiseries.class);
		List<Entreprise> list = q.getResultList();
		System.out.println("Entreprise de qui ont réalisées les menuiseries dans les projet de Musée");
		for(Entreprise e : list){
			System.out.println("Nom entreprise : "+e.getNom()+" "+e.getSiegeSocial().toString());
		}
	}
	
	public void avencementLotsEtLeurTypeDuProjetPLot12_14(){
		String r="SELECT l FROM Projet p JOIN p.lots l WHERE p.refProjet=:ref";
		Query q = em.createQuery(r);
		q.setParameter("ref", "PLot12");
		List<Object> list = q.getResultList();
		System.out.println("Avancement des lots du projet PLot12");
		if(list.isEmpty()){
			System.out.println("Aucun lot dans le projet");
		}
		for(Object s : list){
			System.out.println("Type du lot : "+s.getClass().getSimpleName());
		}
	}
	
}
