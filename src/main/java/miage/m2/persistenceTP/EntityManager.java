package miage.m2.persistenceTP;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {
    private static javax.persistence.EntityManager em;

    public static void init(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencetp");
        em = emf.createEntityManager();
    }

    public static javax.persistence.EntityManager getInstance(){
        return em;
    }
}
