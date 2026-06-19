package paolof16.entities;

import paolof16.enums.GenreBook;

import java.time.LocalDate;

public class Book extends Catalog {
    private String author;
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
