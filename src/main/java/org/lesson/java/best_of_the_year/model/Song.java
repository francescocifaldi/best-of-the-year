package org.lesson.java.best_of_the_year.model;

import java.io.Serializable;

public class Song implements Serializable {
    private Integer id;
    private String title;

    public Song() {
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