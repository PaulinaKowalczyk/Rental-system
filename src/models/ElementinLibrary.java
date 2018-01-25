package models;

import java.io.Serializable;

public class ElementinLibrary implements Serializable, Comparable<ElementinLibrary>{

    public String title;
    public String author;
    public String genre;
    public int amount;

    public ElementinLibrary(String title, String author, String genre, int amount){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.amount=amount;
    }
    public ElementinLibrary(String title, String author, int amount){ // tworzenie elementu pod wypozyczenie ; niepotrzebny gatunek
        this.title=title;
        this.author=author;
        this.amount=amount;
    }
    public ElementinLibrary (String title, String author)
    {
        this.title=title;
        this.author=author;
    }

    public String getGenre() {
        return this.genre;
    }

    public int compareTo (ElementinLibrary b) {
        int porownanie = this.title.compareTo(b.title);
        return porownanie == 0 ? this.author.compareTo(b.author) : porownanie;
    }

    public String toString() {
        return this.title + " " + this.author + " " + this.genre + " " + this.amount;
    }


    public boolean equals(ElementinLibrary b) {
        if (b.title.equals(this.title) && b.author.equals(this.author)) return true;
        else return false;
    }
}
