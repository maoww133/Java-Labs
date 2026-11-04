package org.example;

public class Book {
    private String title;
    private Language language; // Поле типа Enum

    public Book(String title, Language language) {
        this.title = title;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public Language getLanguage() {
        return language;
    }
}