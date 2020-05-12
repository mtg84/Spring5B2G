package guru.springframework.spring5webapp.models;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fisrtName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author() {
    }

    public Author(String fisrtName, String lastName, Set<Book> books) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) &&
                Objects.equals(fisrtName, author.fisrtName) &&
                Objects.equals(lastName, author.lastName) &&
                Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fisrtName, lastName, books);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}