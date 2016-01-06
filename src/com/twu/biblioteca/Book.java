package com.twu.biblioteca;

/**
 * Created by hchan on 12/23/15.
 */
public class Book {
    private String name;
    private String author;
    private Integer publishYear;

    public Book(String name, String author, Integer publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublishYear() {
        return publishYear;
    }
}
