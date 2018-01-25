package actions;

import models.Borrowing;
import models.Customer;
import models.ElementinLibrary;
import others.Main;
import others.MyInput;
import view.StartView;

import java.io.IOException;

public class ReturningBorrowing {
    public static void returning(int number, Customer newCustomer, ElementinLibrary e, int returnAmount) throws ClassNotFoundException, IOException {

        switch(number) {
            case 8:
                ElementinLibrary returnBook = new ElementinLibrary(e.title, e.author);
                Borrowing returnBorrowing = new Borrowing(newCustomer, returnBook);

                boolean removed = false;

                for (Borrowing b : Main.BookBorrowingList) {
                    if (b.equals(returnBorrowing)) {
                        if (b.amount - returnAmount == 0) {
                            Main.BookBorrowingList.remove(b);
                            removed = true;
                        }
                        else if (b.amount - returnAmount > 0) {
                            b.amount = b.amount - returnAmount;
                            removed = true;
                        } else {
                            MyInput.showString("Podana niepoprawna ilość wypożyczonych książek. Wypożyczyłeś łącznie " +
                                    b.amount + " egzemplarzy!");
                        }
                    }
                    if(removed) {
                        for (ElementinLibrary book : Main.BookList) {
                            if (book.equals(returnBook)) {
                                book.amount = book.amount + returnAmount;
                            }
                        }
                        MyInput.showString("Ksiazka zwrocona poprawnie");
                        break;
                    }// koniec if removed
                }
                if (!removed) {
                    MyInput.showString("Nie ma takiego wypozyczenia!");
                }
                break;

            case 9:
                ElementinLibrary returnFilm = new ElementinLibrary(e.title, e.author);
                returnBorrowing = new Borrowing(newCustomer, returnFilm);

                removed = false;

                for (Borrowing f : Main.FilmBorrowingList) {
                    if (f.equals(returnBorrowing)) {
                        if (f.amount - returnAmount == 0) {
                            Main.FilmBorrowingList.remove(f);
                            removed = true;
                        }
                        else if (f.amount - returnAmount > 0) {
                            f.amount = f.amount - returnAmount;
                            removed = true;
                        } else {
                            MyInput.showString("Podana niepoprawna ilość wypożyczonych filmów. Wypożyczyłeś łącznie " +
                                    f.amount + " egzemplarzy!");
                        }
                    }
                    if(removed) {
                        for (ElementinLibrary film : Main.FilmList) {
                            if (film.equals(returnFilm)) {
                                film.amount = film.amount + returnAmount;
                            }
                        }
                        MyInput.showString("Film zwrócony poprawnie");
                        break;
                    }// koniec if removed
                }
                if (!removed) {
                    MyInput.showString("Nie ma takiego wypozyczenia!");
                }
                break;
            case 10:
                ElementinLibrary returnGame = new ElementinLibrary(e.title, e.author);
                returnBorrowing = new Borrowing(newCustomer, returnGame);

                removed = false;

                for (Borrowing g : Main.GameBorrowingList) {
                    if (g.equals(returnBorrowing)) {
                        if (g.amount - returnAmount == 0) {
                            Main.GameBorrowingList.remove(g);
                            removed = true;
                        }
                        else if (g.amount - returnAmount > 0) {
                            g.amount = g.amount - returnAmount;
                            removed = true;
                        } else {
                            MyInput.showString("Podana niepoprawna ilość wypożyczonych gier. Wypożyczyłeś łącznie " +
                                    g.amount + " egzemplarzy!");
                        }
                    }
                    if(removed) {
                        for (ElementinLibrary game : Main.GameList) {
                            if (game.equals(returnGame)) {
                                game.amount = game.amount + returnAmount;
                            }
                        }
                        MyInput.showString("Gra zwrócona poprawnie");
                        break;
                    }// koniec if removed
                }
                if (!removed) {
                    MyInput.showString("Nie ma takiego wypozyczenia!");
                }
                break;
        }

        StartView.talking_with_user();

    }
}
