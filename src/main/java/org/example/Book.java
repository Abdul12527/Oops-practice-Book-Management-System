package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
    private Integer id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private Integer publishYear;
    private Integer numberOfPages;
    private BigDecimal price;
    CoverTypes coverTypes;

    public Book(Integer id, String name, Author[] authors, Publisher publisher, Integer publishYear, Integer numberOfPages, BigDecimal price, CoverTypes coverTypes) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.coverTypes = coverTypes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishYear=" + publishYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", coverTypes=" + coverTypes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Arrays.equals(authors, book.authors) && Objects.equals(publisher, book.publisher) && Objects.equals(publishYear, book.publishYear) && Objects.equals(numberOfPages, book.numberOfPages) && Objects.equals(price, book.price) && coverTypes == book.coverTypes;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, publisher, publishYear, numberOfPages, price, coverTypes);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverTypes getCoverTypes() {
        return coverTypes;
    }

    public void setCoverTypes(CoverTypes coverTypes) {
        this.coverTypes = coverTypes;
    }
    public boolean hasAuthor(Author authorCriteria) {
        for (Author author : authors) {
            if (author.equals(authorCriteria)) {
                return true;
            }
        }
        return false;
    }
}
