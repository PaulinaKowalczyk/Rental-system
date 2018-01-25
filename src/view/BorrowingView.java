package view;
import actions.*;
import models.*;
import others.Main;
import others.MyInput;

import java.io.IOException;

public class BorrowingView {
    public static void borrowingClient(int number) throws IOException, ClassNotFoundException{

        Customer newCustomer = MyInput.getCustomer();
        boolean is_in_the_base_customer = BorrowingController.checkingCustomer(newCustomer);

        if (is_in_the_base_customer == false) {
            MyInput.showString("Klienta nie ma w bazie");
            StartView.talking_with_user();
        }
        else{
            BorrowingView.borrowing(number, newCustomer);
        }
    }

    public static void borrowing(int number, Customer newCustomer) throws IOException, ClassNotFoundException { // cyfra mowi co chcemy wypozyczyc


        switch (number) {
            case 5: // pozyczenie ksiazki
                Book b = MyInput.getBook();
                MyInput.showString("Podaj ile egzemplarzy ksiazki chcesz wypozyczyc:");
                int amount = MyInput.rightAmount();
                boolean book_in_the_base = BorrowingController.checkingElement(b.title,b.author, amount, Main.BookList);
                if(book_in_the_base)
                    BorrowingController.makingBorrowing( newCustomer, b.title, b.author, amount, 5);
                else{
                    MyInput.showString("Ksiazki nie ma w bazie");
                    StartView.talking_with_user();
                }
                break;
            case 6: // pozyczenie filmu
                Film f = MyInput.getFilm();
                MyInput.showString("Podaj ile egzemplarzy filmu chcesz wypozyczyc:");
                amount =MyInput.rightAmount();
                boolean film_in_the_base = BorrowingController.checkingElement(f.title, f.author, amount, Main.FilmList);
                if(film_in_the_base)
                    BorrowingController.makingBorrowing( newCustomer, f.title, f.author, amount, 6);
                else{
                    MyInput.showString("Filmu nie ma w bazie");
                    StartView.talking_with_user();
                }
                break;
            case 7: // pozyczenie gry
                Game g = MyInput.getGame();
                MyInput.showString("Podaj ile egzemplarzy gry chcesz wypozyczyc:");
                amount = MyInput.rightAmount();
                boolean game_in_the_base = BorrowingController.checkingElement(g.title, g.author, amount, Main.GameList);
                if(game_in_the_base)
                    BorrowingController.makingBorrowing( newCustomer, g.title, g.author, amount, 7);
                else{
                    MyInput.showString("Gry nie ma w bazie");
                    StartView.talking_with_user();
                }
                break;
        }
    }

        public static void nextBorrowing(Customer newCustomer, int number) throws IOException, ClassNotFoundException{

        switch(number) {
            case 5:
                MyInput.showString("Czy chcesz wypozyczyc kolejna ksiazke dla tego klienta?");
                String answerBook = MyInput.answer();
                if (answerBook.equals("tak")) {
                        borrowing(5, newCustomer);
                } else {
                    MyInput.showString("Czy chcesz wypozyczyc ksiazke dla innego klienta?");
                    String answer2 = MyInput.answer();
                    if (answer2.equals("tak")) {
                        borrowingClient(5);
                    }
                        StartView.talking_with_user();
                    }
                    break;
            case 6:
                MyInput.showString("Czy chcesz wypozyczyc kolejny film dla tego klienta?");
                String answerFilm = MyInput.answer();
                if (answerFilm.equals("tak")) {
                    borrowing(6, newCustomer);
                } else {
                    MyInput.showString("Czy chcesz wypozyczyc film dla innego klienta?");
                    String answer2 = MyInput.answer();
                    if (answer2.equals("tak")) {
                        borrowingClient(6);
                    } else
                        StartView.talking_with_user();
                }
                break;
            case 7:
                MyInput.showString("Czy chcesz wypozyczyc kolejną grę dla tego klienta?");
                String answerGame = MyInput.answer();
                if (answerGame.equals("tak")) {
                    borrowing(7, newCustomer);
                } else {
                    MyInput.showString("Czy chcesz wypozyczyc grę dla innego klienta?");
                    String answer3 = MyInput.answer();
                    if (answer3.equals("tak")) {
                        borrowingClient(7);
                    } else
                        StartView.talking_with_user();
                }
                break;

        }
    }

}