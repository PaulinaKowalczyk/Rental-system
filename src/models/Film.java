package models;

import models.ElementinLibrary;

import java.io.Serializable;

public class Film extends ElementinLibrary implements Serializable {


    public Film(String title, String author, String genre, int amount) {

        super(title, author, genre, amount);
    }

    public Film (String title, String author, int amount){ // tworzenie elementu pod wypozyczenie ; niepotrzebny gatunek
        super(title, author, amount);
    }

    public Film (String title, String author) {
        super (title, author);
    }


}