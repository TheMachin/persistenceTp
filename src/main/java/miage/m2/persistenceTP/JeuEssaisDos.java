package miage.m2.persistenceTP;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import miage.m2.persistenceTP.enumeration.ECorpsMetier;
import miage.m2.persistenceTP.enumeration.EStatut;
import miage.m2.persistenceTP.enumeration.ETitre;
import miage.m2.persistenceTP.model.Acteur;
import miage.m2.persistenceTP.model.Adresse;
import miage.m2.persistenceTP.model.Dallage;
import miage.m2.persistenceTP.model.Entreprise;
import miage.m2.persistenceTP.model.Fondation;
import miage.m2.persistenceTP.model.Lot;
import miage.m2.persistenceTP.model.Lotissement;
import miage.m2.persistenceTP.model.Maison;
import miage.m2.persistenceTP.model.Peinture;
import miage.m2.persistenceTP.model.Platerie;
import miage.m2.persistenceTP.model.Reseaux;
import miage.m2.persistenceTP.model.Terrassement;

public class JeuEssaisDos {
	
	public static void create(){
		
		EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
		
		//Maison
		
		Adresse adresseRobertCharpentier = new Adresse("51","avenue des coquelicots","57000","Metz");
        Entreprise entrepriseMaisonCharpentier = new Entreprise();
        entrepriseMaisonCharpentier.setCorpsMetier(ECorpsMetier.Charpentier);
        entrepriseMaisonCharpentier.setNom("Maison SARL");
        entrepriseMaisonCharpentier.setNumTel("0384520455");
        entrepriseMaisonCharpentier.setSiegeSocial(adresseRobertCharpentier);
        entrepriseMaisonCharpentier.setActeurs(new HashSet<Acteur>());
        
        Adresse adresseRobertCharpentier2 = new Adresse("53","avenue des coquelicots","57000","Metz");
        Entreprise entrepriseMaisonFils1Charpentier = new Entreprise();
        entrepriseMaisonFils1Charpentier.setCorpsMetier(ECorpsMetier.Charpentier);
        entrepriseMaisonFils1Charpentier.setNom("Maison 1 SARL");
        entrepriseMaisonFils1Charpentier.setNumTel("0384520455");
        entrepriseMaisonFils1Charpentier.setSiegeSocial(adresseRobertCharpentier2);
        entrepriseMaisonFils1Charpentier.setActeurs(new HashSet<Acteur>());
        
        Adresse adresseRobertCharpentier3 = new Adresse("54","avenue des coquelicots","57000","Metz");
        Entreprise entrepriseMaisonFils2Charpentier = new Entreprise();
        entrepriseMaisonFils2Charpentier.setCorpsMetier(ECorpsMetier.Charpentier);
        entrepriseMaisonFils2Charpentier.setNom("Maison 2 SARL");
        entrepriseMaisonFils2Charpentier.setNumTel("0384520455");
        entrepriseMaisonFils2Charpentier.setSiegeSocial(adresseRobertCharpentier3);
        entrepriseMaisonFils2Charpentier.setActeurs(new HashSet<Acteur>());
        
        Adresse adresseRobertCharpentier4 = new Adresse("53","avenue des coquelicots","57000","Metz");
        Entreprise entrepriseMaisonFils3Charpentier = new Entreprise();
        entrepriseMaisonFils3Charpentier.setCorpsMetier(ECorpsMetier.Charpentier);
        entrepriseMaisonFils3Charpentier.setNom("Maison 3 SARL");
        entrepriseMaisonFils3Charpentier.setNumTel("0384520455");
        entrepriseMaisonFils3Charpentier.setSiegeSocial(adresseRobertCharpentier4);
        entrepriseMaisonFils3Charpentier.setActeurs(new HashSet<Acteur>());
        
        
        Acteur michelMichel = new Acteur();
        michelMichel.setNom("Michel Michel");
        michelMichel.setEntreprise(entrepriseMaisonCharpentier);
        michelMichel.setStatut(EStatut.Directeur);
        michelMichel.setTitre(ETitre.Docteur);
        
        Acteur pascalPascal = new Acteur();
        pascalPascal.setNom("Pascal Pascal");
        pascalPascal.setEntreprise(entrepriseMaisonFils1Charpentier);
        pascalPascal.setStatut(EStatut.Directeur);
        pascalPascal.setTitre(ETitre.Docteur);
        
        Acteur ericCristaline = new Acteur();
        ericCristaline.setNom("Eric Cristaline");
        ericCristaline.setEntreprise(entrepriseMaisonFils3Charpentier);
        ericCristaline.setStatut(EStatut.Directeur);
        ericCristaline.setTitre(ETitre.Docteur);
        
        Acteur jeanPuritou = new Acteur();
        jeanPuritou.setNom("Jean Puritou");
        jeanPuritou.setEntreprise(entrepriseMaisonFils2Charpentier);
        jeanPuritou.setStatut(EStatut.Directeur);
        jeanPuritou.setTitre(ETitre.Docteur);
        
        em.getTransaction().begin();

        em.persist(adresseRobertCharpentier);
        em.persist(adresseRobertCharpentier2);
        em.persist(adresseRobertCharpentier3);
        em.persist(adresseRobertCharpentier4);
        
        em.persist(entrepriseMaisonCharpentier);
        em.persist(entrepriseMaisonFils1Charpentier);
        em.persist(entrepriseMaisonFils2Charpentier);
        em.persist(entrepriseMaisonFils3Charpentier);

        em.persist(michelMichel);
        em.persist(pascalPascal);
        em.persist(jeanPuritou);
        em.persist(ericCristaline);

        em.getTransaction().commit();
        
        Maison maisonOver = new Maison();
        maisonOver.setRefProjet("PLot50");
        maisonOver.setNom("La maison du coin");
        maisonOver.setSurfaceTotal(500);
        maisonOver.setAvancement("100%");
        maisonOver.setDateFinEstime(new Date());
        maisonOver.setCoutTotalEstime(500000);
        maisonOver.setTermine(true);
        maisonOver.setDateFinReelle(new Date());
        maisonOver.setNbPieces(5);
        maisonOver.setNbNiveaux(50);
        
        Set<Lot>lotMaison = new HashSet<Lot>();
        
        Terrassement mT = new Terrassement();
        mT.setNumero("tM1");
        mT.setDateDebut(new GregorianCalendar(2017, 7, 1).getTime());
        mT.setDureeEstime(10);
        mT.setAvancement("100%");
        mT.setCoutEstime(400);
        mT.setCoutReel(500);
        mT.setDateFinReel(new Date());
        mT.setResponsable(entrepriseMaisonCharpentier);
        
        Set<Entreprise> realMaison = new HashSet<Entreprise>();
        realMaison.add(entrepriseMaisonFils3Charpentier);
        realMaison.add(entrepriseMaisonFils2Charpentier);
        realMaison.add(entrepriseMaisonFils1Charpentier);
        
        mT.setRealisateurs(realMaison);
        
        
        
        Dallage dal = new Dallage();
        dal.setNumero("dM1");
        dal.setDateDebut(new GregorianCalendar(2017, 7, 2).getTime());
        dal.setDureeEstime(4);
        dal.setCoutEstime(400);
        dal.setCoutReel(450);
        dal.setAvancement("100%");
        dal.setDateFinReel(new Date());
        dal.setSurfaceTotale(450);
        dal.setResponsable(entrepriseMaisonCharpentier);
        dal.setRealisateurs(realMaison);
        
        
        
          
        Fondation fMaison = new Fondation();
        fMaison.setNumero("fM1");
        fMaison.setDateDebut(new GregorianCalendar(2017, 7, 2).getTime());
        fMaison.setDureeEstime(4);
        fMaison.setCoutEstime(400);
        fMaison.setCoutReel(450);
        fMaison.setAvancement("100%");
        fMaison.setDateFinReel(new Date());
        fMaison.setProfondeur(450);
        fMaison.setResponsable(entrepriseMaisonCharpentier);
        fMaison.setRealisateurs(realMaison);
        
        
        
        Reseaux rMaison = new Reseaux();
        rMaison.setNumero("rM1");
        rMaison.setDateDebut(new GregorianCalendar(2017, 7, 2).getTime());
        rMaison.setDureeEstime(4);
        rMaison.setCoutEstime(400);
        rMaison.setCoutReel(450);
        rMaison.setAvancement("100%");
        rMaison.setDateFinReel(new Date());
        rMaison.setLongueur(450);
        rMaison.setResponsable(entrepriseMaisonCharpentier);
        rMaison.setRealisateurs(realMaison);
        
        
        
        Peinture pMaison = new Peinture();
        pMaison.setNumero("pM1");
        pMaison.setDateDebut(new GregorianCalendar(2017, 7, 2).getTime());
        pMaison.setDureeEstime(4);
        pMaison.setCoutEstime(400);
        pMaison.setCoutReel(450);
        pMaison.setAvancement("100%");
        pMaison.setDateFinReel(new Date());
        pMaison.setSurface(100);
        pMaison.setResponsable(entrepriseMaisonCharpentier);
        pMaison.setRealisateurs(realMaison);
        
        
        em.getTransaction().begin();
        em.persist(mT);
        em.persist(dal);
        em.persist(fMaison);
        em.persist(pMaison);
        em.getTransaction().commit();
        
        lotMaison.add(mT);
        lotMaison.add(dal);
        lotMaison.add(fMaison);
        lotMaison.add(rMaison);
        lotMaison.add(pMaison);
        
        maisonOver.setLots(lotMaison);
        
        Set<Acteur> acteursMaison = new HashSet<Acteur>();
		acteursMaison.add(jeanPuritou);
		acteursMaison.add(ericCristaline);
		acteursMaison.add(ericCristaline);
		acteursMaison.add(michelMichel);
		acteursMaison.add(pascalPascal);
        
		maisonOver.setParticipants(acteursMaison);
		
        em.getTransaction().begin();
        em.persist(maisonOver);
        em.getTransaction().commit();
        
        
        //Lotissement
        Adresse a1 = new Adresse("51","avenue des coquelicots","54000","Nancy");
        
        Entreprise e1 = new Entreprise();
        e1.setNom("Le fameux lotisseur aveugle");
        e1.setCorpsMetier(ECorpsMetier.Maçon);
        e1.setNumTel("0606060606");
        e1.setSiegeSocial(a1);
        
        Adresse a2 = new Adresse("5","avenue des coquelicots","54000","Nancy");
        
        Entreprise e2 = new Entreprise();
        e2.setNom("Le fameux lotisseur muet");
        e2.setCorpsMetier(ECorpsMetier.Serrurier);
        e2.setNumTel("0606060606");
        e2.setSiegeSocial(a2);
        
        Adresse a3 = new Adresse("1","avenue des coquelicots","54000","Nancy");
        
        Entreprise e3 = new Entreprise();
        e3.setNom("Le fameux lotisseur isocèle");
        e3.setCorpsMetier(ECorpsMetier.Plombier);
        e3.setNumTel("0606060606");
        e3.setSiegeSocial(a3);
        
        Adresse a4 = new Adresse("541","avenue des coquelicots","54000","Nancy");
        
        Entreprise e4 = new Entreprise();
        e4.setNom("Le fameux lotisseur sourd");
        e4.setCorpsMetier(ECorpsMetier.Couvreur);
        e4.setNumTel("0606060606");
        e4.setSiegeSocial(a4);
        
        Adresse a5 = new Adresse("4","avenue des coquelicots","54000","Nancy");
        
        Entreprise e5 = new Entreprise();
        e5.setNom("Le fameux lotisseur sans tête");
        e5.setCorpsMetier(ECorpsMetier.Couvreur);
        e5.setNumTel("0606060606");
        e5.setSiegeSocial(a5);
        
        Adresse a6 = new Adresse("8","avenue des coquelicots","54000","Nancy");
        
        Entreprise e6 = new Entreprise();
        e6.setNom("Le fameux lotisseur qui lotisse");
        e6.setCorpsMetier(ECorpsMetier.Couvreur);
        e6.setNumTel("0606060606");
        e6.setSiegeSocial(a6);
        
        Adresse a7 = new Adresse("9","avenue des coquelicots","54000","Nancy");
        
        Entreprise e7 = new Entreprise();
        e7.setNom("Le fameux lotisseur qui a des ampoules sous ses pieds");
        e7.setCorpsMetier(ECorpsMetier.Electricien);
        e7.setNumTel("0606060606");
        e7.setSiegeSocial(a7);
        
        Adresse a8 = new Adresse("51","avenue des coquelicots","54000","Nancy");
        
        Entreprise e8 = new Entreprise();
        e8.setNom("Le fameux lotisseur qui n'est pas un lotisseur");
        e8.setCorpsMetier(ECorpsMetier.Couvreur);
        e8.setNumTel("0606060606");
        e8.setSiegeSocial(a8);
        
        Acteur p1 = new Acteur();
        p1.setNom("Patrick le Buisson");
        p1.setEntreprise(e1);
        p1.setStatut(EStatut.Directeur);
        p1.setTitre(ETitre.Docteur);
        
        Acteur p2 = new Acteur();
        p2.setNom("Patrick la Table");
        p2.setEntreprise(e2);
        p2.setStatut(EStatut.Chef_déquipe);
        p2.setTitre(ETitre.Docteur);
        
        Acteur p3 = new Acteur();
        p3.setNom("Patrick la Chaise");
        p3.setEntreprise(e3);
        p3.setStatut(EStatut.Ouvrier);
        p3.setTitre(ETitre.Technicien);
        
        Acteur p4 = new Acteur();
        p4.setNom("Patrick la Voiture");
        p4.setEntreprise(e4);
        p4.setStatut(EStatut.Responsable);
        p4.setTitre(ETitre.Architecte);
        
        Acteur p5 = new Acteur();
        p5.setNom("Patrick la Maison");
        p5.setEntreprise(e5);
        p5.setStatut(EStatut.Chef_déquipe);
        p5.setTitre(ETitre.Ingénieur);
        
        Acteur p6 = new Acteur();
        p6.setNom("Patrick le Clou");
        p6.setEntreprise(e6);
        p6.setStatut(EStatut.Chef_déquipe);
        p6.setTitre(ETitre.Docteur);
        
        Acteur p7 = new Acteur();
        p7.setNom("Patrick la Table");
        p7.setEntreprise(e7);
        p7.setStatut(EStatut.Chef_déquipe);
        p7.setTitre(ETitre.Docteur);
        
        Acteur p8 = new Acteur();
        p8.setNom("Patrick le Nain");
        p8.setEntreprise(e2);
        p8.setStatut(EStatut.Chef_déquipe);
        p8.setTitre(ETitre.Docteur);
        
        Acteur p9 = new Acteur();
        p9.setNom("Patrick la Bouteille");
        p9.setEntreprise(e2);
        p9.setStatut(EStatut.Employé);
        p9.setTitre(ETitre.Technicien);
        
        Acteur p10 = new Acteur();
        p10.setNom("Patrick la Vitre");
        p10.setEntreprise(e2);
        p10.setStatut(EStatut.BIM_Manager);
        p10.setTitre(ETitre.Architecte);
        
        em.getTransaction().begin();
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.persist(e7);
        em.persist(e8);
        
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(p6);
        em.persist(p7);
        em.persist(p8);
        em.persist(p9);
        em.persist(p10);
        em.getTransaction().commit();
        
        Lotissement lotissement = new Lotissement();
        lotissement.setRefProjet("PLot55");
        lotissement.setNom("Un lotissement");
        lotissement.setSurfaceTotal(6881);
        lotissement.setAvancement("100%");
        lotissement.setDateFinEstime(new Date());
        lotissement.setCoutTotalEstime(5656156);
        lotissement.setTermine(true);
        lotissement.setDateFinReelle(new Date());
        lotissement.setNbMaisons(1);
        lotissement.addMaison(maisonOver);
        
        Set<Entreprise> ePlaterie = new HashSet<Entreprise>();
        ePlaterie.add(e2);
        ePlaterie.add(e3);
        ePlaterie.add(e4);
        ePlaterie.add(e5);
        ePlaterie.add(e6);
        ePlaterie.add(e7);
        ePlaterie.add(e8);
        
        Set<Lot> lotPlaterie = new HashSet<Lot>();
        
        Platerie platerie = new Platerie();
        for(int i=0;i<5;i++){
        	platerie = new Platerie();
        	platerie.setNumero("platerie"+i);
        	platerie.setDateDebut(new GregorianCalendar(2017, 7, 2).getTime());
        	platerie.setDureeEstime(78);
        	platerie.setCoutEstime(56);
        	platerie.setAvancement("100%");
        	platerie.setCoutReel(56111861);
        	platerie.setDateFinReel(new Date());
        	platerie.setSurfacePlafond(84);
        	platerie.setSurfaceMur(978);
        	platerie.setResponsable(e1);
        	platerie.setRealisateurs(ePlaterie);
        	
        	em.getTransaction().begin();
        	em.persist(platerie);
        	em.getTransaction().commit();
        	
        	lotPlaterie.add(platerie);
        }
        
        lotissement.setLots(lotPlaterie);
        Set<Acteur> acteursP = new HashSet<Acteur>();
        acteursP.add(jeanPuritou);
        acteursP.add(ericCristaline);
        acteursP.add(ericCristaline);
        acteursP.add(michelMichel);
        acteursP.add(pascalPascal);
        acteursP.add(p1);
        acteursP.add(p2);
        acteursP.add(p3);
        acteursP.add(p4);
        acteursP.add(p5);
        acteursP.add(p6);
        acteursP.add(p7);
        acteursP.add(p8);
        acteursP.add(p9);
        acteursP.add(p10);
        
        lotissement.setParticipants(acteursP);
        
        em.getTransaction().begin();
        em.persist(lotissement);
        em.getTransaction().commit();
        
        
        
        
	}

}
