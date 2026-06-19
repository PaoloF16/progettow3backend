package paolof16.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import paolof16.enums.Currently;

import java.time.LocalDate;
@Entity
@Table(name="magazines")
public class Magazine extends Catalog{
    @Enumerated(EnumType.STRING)
    private Currently periodicita;

    public Magazine (){}
    public Magazine (String title, LocalDate yearPublish, int numberPages,Currently periodicita){
        super(title,yearPublish,numberPages);
        this.periodicita = periodicita;
    }

    public Currently getPeriodicita() {
        return periodicita;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "periodicita=" + periodicita +
                "} " + super.toString();
    }
}
