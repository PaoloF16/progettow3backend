package paolof16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "catalog_items")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Catalog {
    @Id
    @GeneratedValue
    @Column(name = "catalog_id")
    private UUID id;

    @Column(name = "isbn", unique = true, nullable = false)
    private String isbn;

    @OneToMany(mappedBy = "catalog")
    private List<Loan> prestiti = new ArrayList<>();

    @Column(nullable = false)
    private String title;

    @Column(name="year_of_publication")
    private LocalDate yearPublish;

    private int numberPages;


    protected Catalog(){
    }

    public Catalog(String title,String isbn,LocalDate yearPublish,int numberPages){
        this.title = title;
        this.isbn = isbn;
        this.yearPublish = yearPublish;
        this.numberPages = numberPages;
    }

    public UUID getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Loan> getPrestiti() {
        return prestiti;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public LocalDate getYearPublish() {
        return yearPublish;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", prestiti=" + prestiti +
                ", title='" + title + '\'' +
                ", yearPublish=" + yearPublish +
                ", numberPages=" + numberPages +
                '}';
    }
}
