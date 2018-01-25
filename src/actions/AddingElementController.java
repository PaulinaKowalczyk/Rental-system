package actions;

import models.Book;
import models.ElementinLibrary;
import models.Film;
import models.Game;
import others.*;
import others.Main;
import view.AddingElementView;

import java.io.IOException;
import java.util.Collections;

public class AddingElementController {


    public static void makeElement(int number, String title, String author, String genre, int amount) throws ClassNotFoundException, IOException {

        switch (number) {
            case 2:
                // tworze element
                Book b = new Book(title, author, genre, amount);
                // jesli jest
                boolean is_in_the_catalogue = false;
                for (ElementinLibrary book : Main.BookList) {
                    if (book.equals(b)) {
                        is_in_the_catalogue = true;
                        book.amount = book.amount + amount;
                    }
                }
                if (is_in_the_catalogue == false) { // jak nie ma  w katalogu to dodaje osobny obiekt
                    Main.BookList.add(b);
                    Collections.sort(Main.BookList, new ElementComparator() {
                        @Override
                        public int compare(ElementinLibrary b1, ElementinLibrary b2) {
                            return super.compare(b1, b2);
                        }
                    });
                }
                break;
            case 3:
                // tworze element
                Film f = new Film(title, author, genre, amount);
                is_in_the_catalogue = false;
                for (ElementinLibrary film : Main.FilmList) {
                    if (film.equals(f)) {
                        is_in_the_catalogue = true;
                        film.amount = film.amount + amount;
                    }
                }
                if (is_in_the_catalogue == false) {
                    Main.FilmList.add(f);
                    Collections.sort(Main.FilmList, new ElementComparator() {
                        @Override
                        public int compare(ElementinLibrary b1, ElementinLibrary b2) {
                            return super.compare(b1, b2);
                        }
                    });
                }
                break;
            case 4:
                // tworze element
                Game g = new Game(title, author, genre, amount);
                is_in_the_catalogue = false;
                for (ElementinLibrary game : Main.GameList) {
                    if (game.equals(g)) {
                        is_in_the_catalogue = true;
                        game.amount = game.amount + amount;
                    }
                }
                if (is_in_the_catalogue == false) {
                    Main.GameList.add(g);
                    Collections.sort(Main.GameList, new ElementComparator() {
                        @Override
                        public int compare(ElementinLibrary b1, ElementinLibrary b2) {
                            return super.compare(b1, b2);
                        }
                    });
                    break;

                }
        }
                AddingElementView.addingnextelement(number);

        }
    }

