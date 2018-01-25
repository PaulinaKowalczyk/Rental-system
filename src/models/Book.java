package models;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Book extends ElementinLibrary {


    public Book(String title, String author, String genre, int amount) {

        super(title, author, genre, amount);
    }
    public Book (String title, String author, int amount){ // tworzenie elementu pod wypozyczenie ; niepotrzebny gatunek
       super(title, author, amount);
    }

    public Book (String title, String author){
        super(title, author);
    }



}
