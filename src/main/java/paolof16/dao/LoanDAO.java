package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.Loan;

public class LoanDAO {
    private final EntityManager em;

    public LoanDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Loan loan) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(loan);
        transaction.commit();
        System.out.println("Borrow saved with ID: " + loan.getUserid());
    }

    @Override
    public String toString() {
        return "LoanDAO{" +
                "em=" + em +
                '}';
    }
}
