package paolof16.entities;

import jakarta.persistence.*;
import paolof16.enums.GenreBook;

import java.time.LocalDate;
@Entity
@Table(name = "books")
public class Book extends Catalog {
    @Column(nullable = false,length = 120)
    private String author;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GenreBook genre;

    public Book(){}
    public Book(String title,LocalDate yearPublish,int numberPages,String author,GenreBook genre){
        super(title,yearPublish,numberPages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public GenreBook getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre=" + genre +
                "} " + super.toString();
    }
}
