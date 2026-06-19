package paolof16.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public Loan(){}
    public Loan(LocalDate inizioPrestito,LocalDate dataRestituzione,LocalDate dataRestituzioneEfettiva,Catalog catalogid,User user_id){
        this.inizioPrestito = LocalDate.now();
        this.dataRestituzione = LocalDate.now().plusDays(30);
        this.dataRestituzione = dataRestituzione;
        this.catalog = catalogid;
        this.user = user;

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
