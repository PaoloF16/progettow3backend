package paolof16;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import paolof16.dao.CatalogDAO;
import paolof16.dao.LoanDAO;
import paolof16.dao.UserDAO;
import paolof16.entities.*;
import paolof16.enums.Currently;
import paolof16.enums.GenreBook;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettobackend2");

    /* Creo l' entity manager*/
    public static void main(String[] args) {

        EntityManager entityManager = emf.createEntityManager();
        System.out.println("Hello World!");

        CatalogDAO catalogdao = new CatalogDAO(entityManager);
        //Books
        Book book1 = new Book("Lord of the Rings","12332", LocalDate.of(1954,6,29),2000,"J R R Tolken", GenreBook.FICTION);
        Book book2 = new Book("1984", "9780451524935", LocalDate.of(1949, 6, 8), 328, "George Orwell", GenreBook.FICTION);
        Book book3 = new Book("To Kill a Mockingbird", "9780061120084", LocalDate.of(1960, 7, 11), 281, "Harper Lee", GenreBook.FICTION);
        Book book4 = new Book("The Great Gatsby", "9780743273565", LocalDate.of(1925, 4, 10), 180, "F. Scott Fitzgerald", GenreBook.FICTION);
        Book book5 = new Book("The Dark Knight Returns", "9781401263119", LocalDate.of(1986, 2, 20), 224, "Frank Miller", GenreBook.ACTION);
        Book book6 = new Book("The Bourne Identity", "9780345438324", LocalDate.of(1980, 2, 1), 543, "Robert Ludlum", GenreBook.THRILLER);
        Book book7 = new Book("The Hobbit", "9780007487301", LocalDate.of(1937, 9, 21), 310, "J.R.R. Tolkien", GenreBook.FICTION);
        Book book8 = new Book("Pride and Prejudice", "9780141439518", LocalDate.of(1813, 1, 28), 432, "Jane Austen", GenreBook.FICTION);
        Book book9 = new Book("Death Note Vol. 1", "9781421501680", LocalDate.of(2003, 12, 1), 198, "Tsugumi Ohba", GenreBook.MANGA);
        Book book10 = new Book("The Catcher in the Rye", "9780316769174", LocalDate.of(1951, 7, 16), 277, "J.D. Salinger", GenreBook.FICTION);
        Book book11 = new Book("Brave New World", "9780060850524", LocalDate.of(1932, 1, 1), 268, "Aldous Huxley", GenreBook.FICTION);
        Book book12 = new Book("Attack on Titan Vol. 1", "9781612620244", LocalDate.of(2010, 3, 17), 208, "Hajime Isayama", GenreBook.MANGA);
        Book book13 = new Book("Gone Girl", "9780307588371", LocalDate.of(2012, 6, 5), 432, "Gillian Flynn", GenreBook.THRILLER);
        Book book14 = new Book("Crime and Punishment", "9780140449136", LocalDate.of(1866, 1, 1), 671, "Fyodor Dostoevsky", GenreBook.FICTION);
        Book book15 = new Book("The Shining", "9780345803788", LocalDate.of(1977, 1, 28), 447, "Stephen King", GenreBook.THRILLER);
        Book book16 = new Book("Naruto Vol. 1", "9781569319000", LocalDate.of(1999, 3, 3), 192, "Masashi Kishimoto", GenreBook.MANGA);

       /* catalogdao.save(book7);
        catalogdao.save(book8);
        catalogdao.save(book9);
        catalogdao.save(book10);
        catalogdao.save(book11);
        catalogdao.save(book12);
        catalogdao.save(book13);
        catalogdao.save(book14);
        catalogdao.save(book15);
        catalogdao.save(book16);*/

        //magazine
        Magazine mg1 = new Magazine("SOMOS","1213",LocalDate.of(2021,3,2),32, Currently.WEEKLY);
        Magazine mg2 = new Magazine("National Geographic", "1021", LocalDate.of(2023, 5, 12), 140, Currently.MONTHLY);
        Magazine mg3 = new Magazine("Time", "1022", LocalDate.of(2025, 1, 15), 64, Currently.WEEKLY);
        Magazine mg4 = new Magazine("Vogue", "1023", LocalDate.of(2024, 9, 1), 210, Currently.MONTHLY);
        Magazine mg5 = new Magazine("The New Yorker", "1024", LocalDate.of(2026, 2, 22), 88, Currently.WEEKLY);
        Magazine mg6 = new Magazine("Forbes", "1025", LocalDate.of(2023, 11, 5), 112, Currently.MONTHLY);
        Magazine mg7 = new Magazine("Wired", "1026", LocalDate.of(2024, 4, 18), 96, Currently.MONTHLY);
        Magazine mg8 = new Magazine("The Economist", "1027", LocalDate.of(2026, 6, 10), 90, Currently.WEEKLY);
        Magazine mg9 = new Magazine("Scientific American", "1028", LocalDate.of(2022, 8, 25), 80, Currently.MONTHLY);
        Magazine mg10 = new Magazine("Rolling Stone", "1029", LocalDate.of(2025, 10, 3), 104, Currently.MONTHLY);
        Magazine mg11 = new Magazine("People", "1030", LocalDate.of(2026, 3, 14), 72, Currently.WEEKLY);
        Magazine mg12 = new Magazine("Cosmopolitan", "1031", LocalDate.of(2023, 7, 19), 130, Currently.MONTHLY);
        Magazine mg13 = new Magazine("Sports Illustrated", "1032", LocalDate.of(2024, 12, 12), 84, Currently.MONTHLY);
        Magazine mg14 = new Magazine("Harvard Business Review", "1033", LocalDate.of(2025, 5, 20), 150, Currently.MONTHLY);
        Magazine mg15 = new Magazine("Entertainment Weekly", "1034", LocalDate.of(2021, 6, 4), 58, Currently.WEEKLY);
        Magazine mg16 = new Magazine("GQ", "1035", LocalDate.of(2024, 2, 14), 124, Currently.MONTHLY);
        Magazine mg17 = new Magazine("Newsweek", "1036", LocalDate.of(2025, 8, 29), 68, Currently.WEEKLY);
        Magazine mg18 = new Magazine("Empire", "1037", LocalDate.of(2023, 3, 11), 116, Currently.MONTHLY);
        Magazine mg19 = new Magazine("Bloomberg Businessweek", "1038", LocalDate.of(2026, 1, 9), 76, Currently.WEEKLY);
        Magazine mg20 = new Magazine("Architectural Digest", "1039", LocalDate.of(2024, 10, 22), 144, Currently.MONTHLY);
        Magazine mg21 = new Magazine("New Scientist", "1040", LocalDate.of(2025, 11, 15), 56, Currently.WEEKLY);


       /* catalogdao.save(mg1);
        catalogdao.save(mg2);
        catalogdao.save(mg3);
        catalogdao.save(mg4);
        catalogdao.save(mg5);*/
        //utenti
        UserDAO ud = new UserDAO(entityManager);

        User u1 = new User("Aldo", "Baglio", LocalDate.of(1980, 5, 15),
                45568);
        User u2 = new User("Giovanni", "Storti", LocalDate.of(1978, 8, 4)
                , 32424);
        User u3 = new User("Giacomo", "Poretti", LocalDate.of(1970, 2, 20),
                325234);
        User u4 = new User("Valentina", "Bianchi", LocalDate.of(1990, 6, 25),
                342432);
        User u5 = new User("Francesco", "Rossi", LocalDate.of(1988, 11, 8),
                432432);
      /*  ud.save(u1);
        ud.save(u2);
        ud.save(u3);
        ud.save(u4);
        ud.save(u5);*/


        User user1fromDb = ud.findById("3987580e-f844-4717-9cf4-2b1e9e51c4a6");
        System.out.println(user1fromDb.toString());
        Catalog book1fromDb = catalogdao.findById("30849664-2d97-4b2b-903e-2774331a7afd");
        System.out.println(book1fromDb.toString());
        Catalog magazine1fromDb = catalogdao.findById("67eca0e2-0047-4d36-b97b-bf48fc8b2c68");
        System.out.println(magazine1fromDb.toString());

        //prestiti
        LoanDAO loan = new LoanDAO(entityManager);

        Loan loan1 = new Loan(u1, book5, LocalDate.now());

        Loan loan2 = new Loan(u1, book9, LocalDate.of(2025, 7, 1));

        Loan loan3 = new Loan(u3, book10, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 28));
/*
        loan.save(loan1);
        loan.save(loan2);
        loan.save(loan3);*/


       Catalog foundElement = catalogdao.findById("3987580e-f844-4717-9cf4-2b1e9e51c4a6");
        System.out.println("Elemento trovato nel catalogo:");
        System.out.println(foundElement);

        catalogdao.deleteById("9780316769174");
        Catalog catalogbyid = catalogdao.findById("28f4fe55-5bda-44f8-865f-c354f6f9970c");
        System.out.println(catalogbyid);

        List<Catalog> elementibyyear = catalogdao.findByYear(2026);
        System.out.println(elementibyyear);
        List<Catalog> elementsbytitle = catalogdao.findByTitleContaining("Attack on Titan Vol. 1");
        System.out.println(elementsbytitle);
        List<Catalog> elementbyauthor = catalogdao.findByAuthor("J.R.R. Tolkien");
        System.out.println(elementbyauthor);

    }

}
