package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    private double imdbRating;
    public Movie(){}

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.durationInMinutes = duration;
        this.imdbRating=rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}