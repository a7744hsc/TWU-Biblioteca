package com.twu.biblioteca;

/**
 * Created by hchan on 12/23/15.
 */
public class Book {
    private String name;
    private String author;
    private Integer publishYear;
    private Boolean isAvailable;

    public Book(String name, String author, Integer publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        isAvailable = true;

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

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%s", name, author,publishYear);

    }
}
