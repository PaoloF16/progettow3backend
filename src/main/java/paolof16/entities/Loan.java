package paolof16.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Loan {
    @Id
    @GeneratedValue
    @Column(name = "loan_id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDate inizioPrestito;
    private LocalDate dataRestituzione;
    private LocalDate dataRestituzioneEfettiva;

    @ManyToOne
    @JoinColumn(name = "item_id",nullable = false)
    private Catalog catalog;



    public Loan() {}

    public Loan(User user, Catalog catalog, LocalDate inizioPrestito) {
        this.user = user;
        this.catalog = catalog;
        this.inizioPrestito = inizioPrestito;
        this.dataRestituzione = inizioPrestito.plusDays(30);
    }


    public Loan(User user, Catalog catalog, LocalDate inizioPrestito, LocalDate dataRestituzioneEfettiva) {
        this.user = user;
        this.catalog = catalog;
        this.inizioPrestito = inizioPrestito;
        this.dataRestituzione = inizioPrestito.plusDays(30);
        this.dataRestituzioneEfettiva = dataRestituzioneEfettiva;
    }

    public void setDataRestituzioneEfettiva(LocalDate dataRestituzioneEfettiva) {
        this.dataRestituzioneEfettiva = dataRestituzioneEfettiva;
    }

    public UUID getUserid() {
        return id;
    }

    public LocalDate getInizioPrestito() {
        return inizioPrestito;
    }

    public LocalDate getDataRestituzione() {
        return dataRestituzione;
    }

    public LocalDate getDataRestituzioneEfettiva() {
        return dataRestituzioneEfettiva;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "userid=" + id +
                ", user=" + user +
                ", inizioPrestito=" + inizioPrestito +
                ", dataRestituzione=" + dataRestituzione +
                ", dataRestituzioneEfettiva=" + dataRestituzioneEfettiva +
                ", catalog=" + catalog +
                '}';
    }
}
