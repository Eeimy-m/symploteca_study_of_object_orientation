package com.example.symploteca.domain.entities.book;

public class Book {
    private Integer id;
    private Integer edition;
    private Integer numberOfPages;
    private String name;
    private String author;
    private String publisher;
    private String ISBN;

    private BookGender gender;
    private BookStatus status;

    public Book() {
        status = BookStatus.AVAILABLE;
    }

    public Book(Integer edition, Integer numberOfPages, String name, String author, String publisher, String ISBN, BookStatus status, BookGender gender) {
        this(null, edition, numberOfPages, name, author, publisher, ISBN, status, gender);
    }

    public Book(Integer id, Integer edition, Integer numberOfPages, String name, String author, String publisher, String ISBN, BookStatus status, BookGender gender) {
        this.id = id;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.status = status;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public BookStatus getStatus() {
        return status;
    }


    public BookGender getGender() {
        return gender;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getEdition() {
        return edition;
    }


    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void setGender(BookGender gender) {
        this.gender = gender;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", edition=" + edition +
                ", numberOfPages=" + numberOfPages +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", gender=" + gender +
                ", status=" + status +
                '}';
    }
}
