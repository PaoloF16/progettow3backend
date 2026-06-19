package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import paolof16.entities.Catalog;
import paolof16.exceptions.NotFoundException;

import java.util.List;
import java.util.UUID;

public class CatalogDAO {
    private final EntityManager entityManager;

    public CatalogDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Catalog newItem) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newItem);
        transaction.commit();
        System.out.println("The item " + newItem.getTitle() + " was successfully added to the catalog!");
    }

    public Catalog findById(String isbn) {
        Catalog found = entityManager.find(Catalog.class, UUID.fromString(isbn));
        if (found == null) throw new NotFoundException(isbn);
        return found;
    }

    public List<Catalog> findAll() {
        TypedQuery<Catalog> query = entityManager.createQuery("SELECT i FROM CatalogItem i", Catalog.class);
        return query.getResultList();
    }

    public List<Catalog> findByYear(int year) {
        TypedQuery<Catalog> query = entityManager.createQuery(
                "SELECT i FROM CatalogItem i WHERE i.yearOfPublication = :year",
                Catalog.class
        );
        query.setParameter("year", year);
        return query.getResultList();
    }

    public List<Catalog> findByAuthor(String author) {
        TypedQuery<Catalog> query = entityManager.createQuery(
                "SELECT i FROM CatalogItem i WHERE LOWER(i.author) LIKE LOWER(:author)",
                Catalog.class
        );
        query.setParameter("author", author + "%");
        return query.getResultList();
    }

    public List<Catalog> findByTitleContaining(String partialTitle) {
        TypedQuery<Catalog> query = entityManager.createQuery(
                "SELECT i FROM CatalogItem i WHERE LOWER(i.title) LIKE LOWER(:title)",
                Catalog.class
        );
        query.setParameter("title", "%" + partialTitle + "%");
        return query.getResultList();
    }

    public void deleteById(String isbn) {
        Catalog found = this.findById(isbn);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(found);
        transaction.commit();

        System.out.println("The item * " + found.getId() + " " + found.getTitle() + " * was successfully deleted from the database.");
    }

    @Override
    public String toString() {
        return "CatalogDAO{" +
                "entityManager=" + entityManager +
                '}';
    }
}
