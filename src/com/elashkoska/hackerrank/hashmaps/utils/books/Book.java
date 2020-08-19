package com.elashkoska.hackerrank.hashmaps.utils.books;

public class Book {
   private String name;
    private Integer numberOfPages;

    public Book(String name, Integer numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
