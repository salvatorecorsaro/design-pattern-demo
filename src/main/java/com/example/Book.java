package com.example;

public class Book {

    private Long id;
    private String name;
    private String isbn;
    private String author;
    private String genre;


    public static class Builder {
        private Long id;
        private String name;
        private String isbn;
        private String author;
        private String genre;



        public Builder(long id){
            this.id = id;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withIsbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public Builder withAuthor(String author){
            this.author = author;
            return this;
        }

        public Builder withGenre(String genre){
            this.genre = genre;
            return this;
        }


        public Book build(){
            Book book = new Book();
            book.id = this.id;
            book.author = this.author;
            book.isbn = this.isbn;
            book.genre = this.genre;

            return book;
        }
    }

    public Book(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
