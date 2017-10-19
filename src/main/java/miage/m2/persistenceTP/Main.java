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
        Impair.requete3();
        Impair.requete5();
        Impair.requete7();
        Impair.requete9();
        Impair.requete11();
        Impair.requete13();
    }
}
