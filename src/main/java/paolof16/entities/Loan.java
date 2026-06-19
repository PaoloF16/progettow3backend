package paolof16.entities;


import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userid;

    private LocalDate inizioPrestito;
    private LocalDate dataRestituzione;
    private LocalDate dataRestituzioneEfettiva;
    
    private Catalog catalogid;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    public Loan(){}
    public Loan(LocalDate inizioPrestito,LocalDate dataRestituzione,LocalDate dataRestituzioneEfettiva,Catalog catalogid,User user_id){
        this.inizioPrestito = LocalDate.now();
        this.dataRestituzione = LocalDate.now().plusDays(30);
        this.dataRestituzione = dataRestituzione;
        this.catalogid = catalogid;
        this.user_id = user_id;

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

    public Catalog getCatalogid() {
        return catalogid;
    }

    public User getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "userid=" + userid +
                ", inizioPrestito=" + inizioPrestito +
                ", dataRestituzione=" + dataRestituzione +
                ", dataRestituzioneEfettiva=" + dataRestituzioneEfettiva +
                ", catalogid=" + catalogid +
                ", user_id=" + user_id +
                '}';
    }
}
