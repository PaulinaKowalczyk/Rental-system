package models;

import models.ElementinLibrary;

import java.io.Serializable;

public class Game extends ElementinLibrary implements Serializable{

    public Game(String title, String author, String genre, int amount) {
        super(title, author, genre, amount);
    }

    public Game (String title, String author, int amount){ // tworzenie elementu pod wypozyczenie ; niepotrzebny gatunek
        super(title, author, amount);
    }

    public Game (String title, String game){
        super (title, game);
    }
}