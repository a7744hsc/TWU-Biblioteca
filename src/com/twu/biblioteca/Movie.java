package com.twu.biblioteca;

/**
 * Created by hchan on 1/18/16.
 */
public class Movie {
    @Override
    public String toString() {
        return String.format("%-23s%-23s%-23s%s", name, director,year,rate);

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public double getRate() {
        return rate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Movie(String name, int year, String director, double rate) {

        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        isAvailable = true;

    }

    private String name;
    private int year;
    private String director;
    private double rate;
    private boolean isAvailable;
}
