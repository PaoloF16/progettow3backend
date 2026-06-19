package paolof16.entities;

import java.time.LocalDate;

public class Magazine extends Catalog{
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
