package miage.m2.persistenceTP;

import miage.m2.persistenceTP.enumeration.ECorpsMetier;
import miage.m2.persistenceTP.enumeration.EEtaScolaire;
import miage.m2.persistenceTP.enumeration.EStatut;
import miage.m2.persistenceTP.enumeration.ETitre;
import miage.m2.persistenceTP.model.*;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class JeuEssai {
    public static void create(){

        Adresse adresseRobertCharpentier = new Adresse("50","avenue des coquelicots","57000","Metz");
        Entreprise entrepriseRobertCharpentier = new Entreprise();
        entrepriseRobertCharpentier.setCorpsMetier(ECorpsMetier.Charpentier);
        entrepriseRobertCharpentier.setNom("Robert SARL");
        entrepriseRobertCharpentier.setNumTel("0384520454");
        entrepriseRobertCharpentier.setSiegeSocial(adresseRobertCharpentier);
        entrepriseRobertCharpentier.setActeurs(new HashSet<Acteur>());

        Adresse adresseMarioLuigi = new Adresse("13","chateau de bowser","57000","Metz");
        Entreprise marioLuigi = new Entreprise();
        marioLuigi.setCorpsMetier(ECorpsMetier.Plombier);
        marioLuigi.setNom("Mario & Luigi Plomberie");
        marioLuigi.setNumTel("0384520454");
        marioLuigi.setSiegeSocial(adresseMarioLuigi);
        marioLuigi.setActeurs(new HashSet<Acteur>());

        Adresse adressePicassoPeinture = new Adresse("36","avenue de la joconde","55000","Bar");
        Entreprise picassoPeinture = new Entreprise();
        picassoPeinture.setCorpsMetier(ECorpsMetier.Peintre);
        picassoPeinture.setNom("Picasso peinture");
        picassoPeinture.setNumTel("0384520454");
        picassoPeinture.setSiegeSocial(adressePicassoPeinture);
        picassoPeinture.setActeurs(new HashSet<Acteur>());

        Adresse adresseTeslaElectricite = new Adresse("85","rue du tonnerre","54000","Nancy");
        Entreprise teslaElectricite = new Entreprise();
        teslaElectricite.setCorpsMetier(ECorpsMetier.Electricien);
        teslaElectricite.setNom("Tesla electricite");
        teslaElectricite.setNumTel("0384520454");
        teslaElectricite.setSiegeSocial(adresseTeslaElectricite);
        teslaElectricite.setActeurs(new HashSet<Acteur>());

        Adresse adressePortugalMaconnerie = new Adresse("42","rue des macons","54000","Nancy");
        Entreprise lesPortugais = new Entreprise();
        lesPortugais.setCorpsMetier(ECorpsMetier.Maçon);
        lesPortugais.setNom("Les portugais");
        lesPortugais.setNumTel("0384520454");
        lesPortugais.setSiegeSocial(adressePortugalMaconnerie);
        lesPortugais.setActeurs(new HashSet<Acteur>());

        Adresse adresseLesCambrioleur = new Adresse("24","rue de la banque","54000","Nancy");
        Entreprise lesCambrioleurs = new Entreprise();
        lesCambrioleurs.setCorpsMetier(ECorpsMetier.Serrurier);
        lesCambrioleurs.setNom("Les cambrioleurs");
        lesCambrioleurs.setNumTel("0384520454");
        lesCambrioleurs.setSiegeSocial(adresseLesCambrioleur);
        lesCambrioleurs.setActeurs(new HashSet<Acteur>());

        Adresse adresseLesRatonsLaveur = new Adresse("74","rue de la forêt","54000","Nancy");
        Entreprise lesRatonsLaveurs = new Entreprise();
        lesRatonsLaveurs.setCorpsMetier(ECorpsMetier.Menuisier);
        lesRatonsLaveurs.setNom("Les ratons laveurs SARL");
        lesRatonsLaveurs.setNumTel("0384520454");
        lesRatonsLaveurs.setSiegeSocial(adresseLesRatonsLaveur);
        lesRatonsLaveurs.setActeurs(new HashSet<Acteur>());

        Adresse adresseCouvreur = new Adresse("25","rue des toits","54000","Nancy");
        Entreprise lesCouvreurs = new Entreprise();
        lesCouvreurs.setCorpsMetier(ECorpsMetier.Couvreur);
        lesCouvreurs.setNom("Les couvreurs du dimanche");
        lesCouvreurs.setNumTel("0384520454");
        lesCouvreurs.setSiegeSocial(adresseCouvreur);
        lesCouvreurs.setActeurs(new HashSet<Acteur>());

        Adresse adressePlatrier = new Adresse("12","rue de l'hopital","54000","Nancy");
        Entreprise lesPlatriers = new Entreprise();
        lesPlatriers.setCorpsMetier(ECorpsMetier.Plâtrier);
        lesPlatriers.setNom("Général Bâtiment");
        lesPlatriers.setNumTel("0384520454");
        lesPlatriers.setSiegeSocial(adressePlatrier);
        lesPlatriers.setActeurs(new HashSet<Acteur>());

        Adresse adresseCarreleur = new Adresse("22","rue des sphynx","54000","Nancy");
        Entreprise lesCarreleurs = new Entreprise();
        lesCarreleurs.setCorpsMetier(ECorpsMetier.Carreleur);
        lesCarreleurs.setNom("Numerobis SARL");
        lesCarreleurs.setNumTel("0384520454");
        lesCarreleurs.setSiegeSocial(adresseCarreleur);
        lesCarreleurs.setActeurs(new HashSet<Acteur>());

        EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();

        em.getTransaction().begin();
        em.persist(adresseCarreleur);
        em.persist(adresseCouvreur);
        em.persist(adresseLesCambrioleur);
        em.persist(adresseLesRatonsLaveur);
        em.persist(adresseMarioLuigi);
        em.persist(adressePicassoPeinture);
        em.persist(adressePlatrier);
        em.persist(adressePortugalMaconnerie);
        em.persist(adresseRobertCharpentier);
        em.persist(adresseTeslaElectricite);

        em.getTransaction().commit();

        Acteur nicolasTesla = new Acteur();
        nicolasTesla.setNom("Nicolas Tesla");
        nicolasTesla.setEntreprise(teslaElectricite);
        nicolasTesla.setStatut(EStatut.Directeur);
        nicolasTesla.setTitre(ETitre.Docteur);

        Acteur mario = new Acteur();
        mario.setNom("Mario Nintendo");
        mario.setEntreprise(marioLuigi);
        mario.setTitre(ETitre.Technicien);
        mario.setStatut(EStatut.Chef_déquipe);

        Acteur ronaldo = new Acteur();
        ronaldo.setNom("Ronaldo Cristiano");
        ronaldo.setEntreprise(lesPortugais);
        ronaldo.setTitre(ETitre.Technicien);
        ronaldo.setStatut(EStatut.Ouvrier);

        Acteur kevin = new Acteur();
        kevin.setNom("Kevin LaForet");
        kevin.setEntreprise(lesRatonsLaveurs);
        kevin.setStatut(EStatut.Responsable);
        kevin.setTitre(ETitre.Ingénieur);

        Acteur robert = new Acteur();
        robert.setNom("Robert Dubois");
        robert.setEntreprise(entrepriseRobertCharpentier);
        robert.setStatut(EStatut.Directeur);
        robert.setTitre(ETitre.Architecte);

        Acteur numerobis = new Acteur();
        numerobis.setNom("Numerobis");
        numerobis.setEntreprise(lesCarreleurs);
        numerobis.setStatut(EStatut.Directeur);
        numerobis.setTitre(ETitre.Architecte);

        Acteur picasso = new Acteur();
        picasso.setNom("Pablo Picasso");
        picasso.setEntreprise(picassoPeinture);
        picasso.setStatut(EStatut.Ouvrier);
        picasso.setTitre(ETitre.Technicien);

        Acteur roberto = new Acteur();
        roberto.setNom("Roberto Francesco");
        roberto.setEntreprise(lesPlatriers);
        roberto.setStatut(EStatut.Chef_déquipe);
        roberto.setTitre(ETitre.Ingénieur);

        Acteur risitas = new Acteur();
        risitas.setNom("Risitas Elbanador");
        risitas.setEntreprise(lesPlatriers);
        risitas.setStatut(EStatut.Ouvrier);
        risitas.setTitre(ETitre.Technicien);

        Acteur jesus = new Acteur();
        jesus.setNom("Jesus Quintero");
        jesus.setEntreprise(lesPlatriers);
        jesus.setStatut(EStatut.Ouvrier);
        jesus.setTitre(ETitre.Technicien);

        Acteur regis = new Acteur();
        regis.setNom("Regis Dupont");
        regis.setEntreprise(lesCouvreurs);
        regis.setStatut(EStatut.Employé);
        regis.setTitre(ETitre.Technicien);

        em.getTransaction().begin();

        em.persist(lesCambrioleurs);
        em.persist(lesCarreleurs);
        em.persist(lesCouvreurs);
        em.persist(lesPlatriers);
        em.persist(lesPortugais);
        em.persist(lesRatonsLaveurs);
        em.persist(marioLuigi);
        em.persist(entrepriseRobertCharpentier);
        em.persist(teslaElectricite);
        em.persist(picassoPeinture);

        em.persist(nicolasTesla);
        em.persist(mario);
        em.persist(ronaldo);
        em.persist(kevin);
        em.persist(robert);
        em.persist(numerobis);
        em.persist(picasso);
        em.persist(roberto);
        em.persist(risitas);
        em.persist(jesus);
        em.persist(regis);

        em.getTransaction().commit();


        /* PROJET LOTISSEMENT */
        Adresse pLotissementAdresse = new Adresse("10","rue de metz","54000","Nancy");

        Lotissement projetLotissement = new Lotissement();
        projetLotissement.setRefProjet("PLot12");
        projetLotissement.setNom("Projet Lotissement");
        projetLotissement.setAvancement("100%");
        projetLotissement.setDateFinEstime(new Date());
        projetLotissement.setDateFinReelle(new Date());
        projetLotissement.setLocalisation(pLotissementAdresse);
        projetLotissement.setTermine(true);
        projetLotissement.setNbMaisons(5);
        projetLotissement.setCoutTotalEstime(2000000);
        Set<Acteur> participants = new HashSet<Acteur>();
        participants.add(mario);
        participants.add(picasso);
        participants.add(regis);
        participants.add(kevin);
        participants.add(nicolasTesla);
        participants.add(ronaldo);
        participants.add(numerobis);
        participants.add(roberto);
        participants.add(risitas);
        participants.add(jesus);
        projetLotissement.setParticipants(participants);
        projetLotissement.setSurfaceTotal(100);

        Set<Entreprise> realisateurLot1 = new HashSet<Entreprise>();
        realisateurLot1.add(lesPlatriers);
        realisateurLot1.add(lesRatonsLaveurs);
        realisateurLot1.add(teslaElectricite);
        Electricite lot1 = new Electricite("Lot1",new Date(),60,3500,"100%",6000,new Date(),realisateurLot1,lesPortugais, 0, 0);

        Set<Entreprise> realisateurLot2 = new HashSet<Entreprise>();
        realisateurLot2.add(lesRatonsLaveurs);
        realisateurLot2.add(picassoPeinture);
        Peinture lot2 = new Peinture("Lot2",new Date(),40,2500,"100%",3500,new Date(),realisateurLot2,lesPlatriers, 0);

        Set<Lot> lots = new HashSet<Lot>();
        lots.add(lot1);
        lots.add(lot2);
        projetLotissement.setLots(lots);

        em.getTransaction().begin();
        em.persist(lot1);
        em.persist(lot2);
        em.persist(pLotissementAdresse);
        em.persist(projetLotissement);
        em.getTransaction().commit();

        /* FIN PROJET LOTISSEMENT */

        /* PROJET ETABLISSEMENT SCOLAIRE */
        Adresse etablissementScolaireAdresse = new Adresse("25","rue Albert Einstein","54000","Nancy");
        EtablissementScolaire etablissementScolaire = new EtablissementScolaire("education",700, EEtaScolaire.lycée);
        etablissementScolaire.setRefProjet("PLot11");
        etablissementScolaire.setNom("Lycée Albert Einstein");
        etablissementScolaire.setAvancement("40%");
        etablissementScolaire.setDateFinEstime(new GregorianCalendar(2020, 7, 1).getTime());
        etablissementScolaire.setDateFinReelle(null);
        etablissementScolaire.setLocalisation(etablissementScolaireAdresse);
        etablissementScolaire.setTermine(false);
        Set<Acteur> participantsEtablissementScolaire = new HashSet<Acteur>();
        participantsEtablissementScolaire.add(mario);
        participantsEtablissementScolaire.add(picasso);
        participantsEtablissementScolaire.add(regis);
        participantsEtablissementScolaire.add(kevin);
        participantsEtablissementScolaire.add(nicolasTesla);
        participantsEtablissementScolaire.add(ronaldo);
        participantsEtablissementScolaire.add(numerobis);
        participantsEtablissementScolaire.add(roberto);
        participantsEtablissementScolaire.add(risitas);
        participantsEtablissementScolaire.add(jesus);
        etablissementScolaire.setParticipants(participantsEtablissementScolaire);
        etablissementScolaire.setSurfaceTotal(1000);
        etablissementScolaire.setCoutTotalEstime(800000);

        em.getTransaction().begin();
        em.persist(etablissementScolaireAdresse);
        em.persist(etablissementScolaire);
        em.getTransaction().commit();

        /* FIN PROJET ETABLISSEMENT SCOLAIRE */

        /* PROJET IMMEUBLE  */
        Adresse adresseImmeuble = new Adresse("74","avenue robert schuman","54000","Nancy");
        EtablissementScolaire immeuble = new EtablissementScolaire("Logement",700, EEtaScolaire.lycée);
        immeuble.setRefProjet("PLot13");
        immeuble.setNom("Residence Robert Schuman");
        immeuble.setAvancement("60%");
        immeuble.setDateFinEstime(new GregorianCalendar(2018, 3, 30).getTime());
        immeuble.setDateFinReelle(null);
        immeuble.setLocalisation(adresseImmeuble);
        immeuble.setTermine(false);
        immeuble.setParticipants(new HashSet<Acteur>());
        immeuble.setSurfaceTotal(2000);
        immeuble.setCoutTotalEstime(700000);

        em.getTransaction().begin();
        em.persist(adresseImmeuble);
        em.persist(immeuble);
        em.getTransaction().commit();

        /* FIN PROJET IMMEUBLE */

        /* PROJET MUSEE  */
        Adresse adresseMusee = new Adresse("2","rue jackie chan","54000","Nancy");
        EtablissementScolaire musee = new EtablissementScolaire("Culture",700, EEtaScolaire.lycée);
        musee.setRefProjet("PLot14");
        musee.setNom("Musée des arts martiaux");
        musee.setAvancement("20%");
        musee.setDateFinEstime(new GregorianCalendar(2019, 7, 1).getTime());
        musee.setDateFinReelle(null);
        musee.setLocalisation(adresseMusee);
        musee.setTermine(false);
        musee.setParticipants(new HashSet<Acteur>());
        musee.setSurfaceTotal(1500);
        musee.setCoutTotalEstime(400000);

        em.getTransaction().begin();
        em.persist(adresseMusee);
        em.persist(musee);
        em.getTransaction().commit();

        /* FIN PROJET MUSEE */
    }
}
