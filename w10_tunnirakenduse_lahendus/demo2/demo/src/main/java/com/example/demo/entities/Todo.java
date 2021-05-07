package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Must enter a title")
    private String title;

    @NotBlank(message = "Must enter a description")
    private String description;

    private String date;

    public Todo() {

    }

    public Todo(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
    
    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", title=" + title + ", description=" + description + ", date=" + date + '}';
    }
}