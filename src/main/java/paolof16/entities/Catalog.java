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
    @Column(name = "code_isbn",nullable = false)
    @GeneratedValue
    private UUID codeISBN;

    @OneToMany(mappedBy = "catalog")
    private List<Loan> prestiti = new ArrayList<>();

    @Column(nullable = false)
    private String title;

    @Column(name="year_of_publication")
    private LocalDate yearPublish;

    private int numberPages;


    protected Catalog(){
    }

    public Catalog(String title,LocalDate yearPublish,int numberPages){
        this.title = title;
        this.yearPublish = yearPublish;
        this.numberPages = numberPages;
    }


    public UUID getCodeISBN() {
        return codeISBN;
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
                "codeISBN=" + codeISBN +
                ", title='" + title + '\'' +
                ", yearPublish=" + yearPublish +
                ", numberPages=" + numberPages +
                '}';
    }
}
