package miage.m2.persistenceTP.requetes;

import miage.m2.persistenceTP.enumeration.ECorpsMetier;

import javax.persistence.Query;
import java.util.List;

public class Impair {
    public static void requete1(){
        System.out.println("1. Quelles sont les entreprises avec lesquelles le cabinet travaille ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Entreprise.requete1");
        List<String> lesEntreprises = q.getResultList();
        for (String nomEntreprise : lesEntreprises) {
            System.out.println("Entreprise : "+nomEntreprise);
        }
    }

    public static void requete3(){
        String projetRef = "PLot12";
        System.out.println("3. Quel est lʼavancement du projet de référence : "+projetRef+" ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Projet.requete3");
        q.setParameter("ref",projetRef);
        String avancement = String.valueOf(q.getSingleResult());
        System.out.println(" => "+avancement);
    }

    public static void requete5(){
        ECorpsMetier corpsMetier = ECorpsMetier.Plombier;
        System.out.println("5. Quelles sont les entreprises de : "+corpsMetier+" ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Entreprise.requete5");
        q.setParameter("corpsMetier",corpsMetier);
        List<String> lesEntreprises = q.getResultList();
        for (String nomEntreprise : lesEntreprises) {
            System.out.println(" => "+nomEntreprise);
        }
    }

    public static void requete7(){
        String nomEntreprise = "Général Bâtiment";
        System.out.println("7. A quels projets terminés lʼentreprise « Général Bâtiment » a participé ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Projet.requete7");
        q.setParameter("nom",nomEntreprise);
        List<String> lesProjets = q.getResultList();
        for (String nomProjet : lesProjets) {
            System.out.println(" => "+nomProjet);
        }
    }

    public static void requete9(){
        String projetRef = "PLot12";
        System.out.println("9. Quels sont les acteurs (et leur entreprise) participant au projet de référence « PLot12 » ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Acteur.requete9");
        q.setParameter("ref",projetRef);
        List<Object[]> lesActeurs = q.getResultList();
        for (Object[] acteur : lesActeurs) {
            System.out.println(" => "+acteur[0]+ " entreprise : "+acteur[1]);
        }
    }

    public static void requete11(){
        String projetRef = "PLot12";
        System.out.println("11. Quel est le coût total estimé du projet de référence « PLot12 »?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Projet.requete11");
        q.setParameter("ref",projetRef);
        List<Object> coutTotalEstime = q.getResultList();
        System.out.println(" => "+coutTotalEstime);
    }

    public static void requete13(){
        System.out.println("13. Quelles sont les durées estimées des différents projets en cours ?");
        javax.persistence.EntityManager em = miage.m2.persistenceTP.EntityManager.getInstance();
        Query q = em.createNamedQuery("Projet.requete13");
        List<Object[]> projets = q.getResultList();
        for (Object[] projet : projets) {
            System.out.println(" => "+projet[0]+ " Durée estimées : "+projet[1]);
        }
    }
}
