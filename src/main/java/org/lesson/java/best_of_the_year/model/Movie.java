package org.lesson.java.best_of_the_year.model;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer id;
    private String title;

    public Movie() {
    }

    public Movie(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}