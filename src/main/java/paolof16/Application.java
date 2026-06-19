package paolof16;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettobackend2");

    /* Creo l' entity manager*/
    public static void main(String[] args) {

        EntityManager entityManager = emf.createEntityManager();
        System.out.println("Hello World!");
    }
}
