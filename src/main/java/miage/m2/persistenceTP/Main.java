package miage.m2.persistenceTP;

import miage.m2.persistenceTP.requetes.Impair;
import miage.m2.persistenceTP.requetes.Pair;

public class Main {
    public static void main(String[] args) {
        EntityManager.init();

        JeuEssai.create();
        System.out.println("START");
        //TODO
        Pair p = new Pair();

        Impair.requete1();
        p.projetEnCours_2();
        Impair.requete3();
        p.nbProjetEtablissementScolaire_4();
        Impair.requete5();
        p.nomContactEntrepriseGeneralBatiment_6();
        Impair.requete7();
        p.lotsProjetEnCoursQueParticipeEntrepriseGeneralBatiment_8();
        Impair.requete9();
        p.nbLotsProjetPLot12_10();
        Impair.requete11();
        p.entrepriseEtAdresseQuiOntRealiseMenuiseriesDansProjetDeMusee_12();
        Impair.requete13();
        p.avencementLotsEtLeurTypeDuProjetPLot12_14();
        
        EntityManager.close();
        
    }
}
