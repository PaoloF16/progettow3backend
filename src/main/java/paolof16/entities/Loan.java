package paolof16.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Loan {
    @Id
    @GeneratedValue
    private UUID userid;
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
        this.dataRestituzione = inizioPrestito.plusDays(30); // Se calcula en base a la fecha de inicio
    }


    public Loan(User user, Catalog catalog, LocalDate inizioPrestito, LocalDate dataRestituzioneEfettiva) {
        this.user = user;
        this.catalog = catalog;
        this.inizioPrestito = inizioPrestito;
        this.dataRestituzione = inizioPrestito.plusDays(30);
        this.dataRestituzioneEfettiva = dataRestituzioneEfettiva;
    }

    public Loan(User u1, Book book5, LocalDate now) {
    }

    public Loan(User u3, Book book10, LocalDate of, LocalDate of1) {
    }

    public void setDataRestituzioneEfettiva(LocalDate dataRestituzioneEfettiva) {
        this.dataRestituzioneEfettiva = dataRestituzioneEfettiva;
    }

    public UUID getUserid() {
        return userid;
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
                "userid=" + userid +
                ", user=" + user +
                ", inizioPrestito=" + inizioPrestito +
                ", dataRestituzione=" + dataRestituzione +
                ", dataRestituzioneEfettiva=" + dataRestituzioneEfettiva +
                ", catalog=" + catalog +
                '}';
    }
}
