package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.User;
import paolof16.exceptions.UserNotFoundException;

import java.util.UUID;

public class UserDAO {
    private final EntityManager em;

    public UserDAO(EntityManager em) {
        this.em = em;
    }

    public void save(User newUser) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newUser);
        transaction.commit();
        System.out.println("User saved: " + newUser.getId());
    }

    public User findById(UUID id) {
        User user = em.find(User.class, id);
        if (user == null) throw new UserNotFoundException(id);
        return user;
    }
}
