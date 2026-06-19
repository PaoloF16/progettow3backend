package paolof16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "first_name")
    private String name;
    @Column(name = "second_name")
    private String surname;
    @Column(name = "date_of_birth")
    private LocalDate birthDate;
    private int cardNumber;
    @OneToMany(mappedBy = "user")
    private List<Loan> prestiti = new ArrayList<>();

    public User(){}
    public User(String name,String surname,LocalDate birthDate,int cardNumber){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.cardNumber = cardNumber;
    }

    public void setPrestiti(List<Loan> prestiti) {
        this.prestiti = prestiti;
    }

    public UUID getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public List<Loan> getPrestiti() {
        return prestiti;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
