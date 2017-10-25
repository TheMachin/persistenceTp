package miage.m2.persistenceTP;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {
    private static javax.persistence.EntityManager em;
    private static  EntityManagerFactory emf;

    public static void init(){
        emf = Persistence.createEntityManagerFactory("persistencetp");
        em = emf.createEntityManager();
    }

    public static javax.persistence.EntityManager getInstance(){
        return em;
    }
    
    public static void close(){
    	em.close();
    	emf.close();
    }
    
}
