package com.example.sem_4.models;

import androidx.annotation.NonNull;

import java.util.Date;

public class Movie {
    private String title; // EditText
    private Double budget; // EditText
    private Date release; // EditText
    private GenreEnum genre; // Spinner
    private Integer duration; // SeekBar
    private ParentalApprovalEnum pApproval; // RadioButtons
    private Float rating;   // RatingBar
    private Boolean watched;    // Switch
    private String poster;

    @NonNull
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", budget=" + budget +
                ", release=" + release +
                ", genre=" + genre +
                ", duration=" + duration +
                ", pApproval=" + pApproval +
                ", rating=" + rating +
                ", watched=" + watched +
                ", poster='" + poster + '\'' +
                '}';
    }

    public Movie(String title, Double budget, Date release, Integer duration, GenreEnum genre, ParentalApprovalEnum pApproval, Float rating, Boolean watched, String poster) {
        this.title = title;
        this.budget = budget;
        this.release = release;
        this.duration = duration;
        this.genre = genre;
        this.pApproval = pApproval;
        this.rating = rating;
        this.watched = watched;
        this.poster = poster;
    }
}

