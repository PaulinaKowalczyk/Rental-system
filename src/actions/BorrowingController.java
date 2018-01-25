package actions;

import models.*;
import others.Main;
import view.BorrowingView;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BorrowingController {

   // public static models.Customer newCustomer;

    public static boolean checkingCustomer(Customer newCustomer) {
        for(Customer c: Main.CustomerList){
            if(c.equals(newCustomer))
                return true;
        }
        return false;
    }

    public static boolean checkingElement (String title, String author, int amount, List<ElementinLibrary> list) {
        ElementinLibrary newElement = new ElementinLibrary(title, author, amount);

        for(ElementinLibrary e: list){
           if (e.equals(newElement)) {
               if (e.amount >= amount) {
                   e.amount=e.amount-amount; // wypozyczam
                   return true;
               }
           }
       }
        return false;
       }

    public static void makingBorrowing (Customer newCustomer, String title, String author, int amount, int number)
    throws ClassNotFoundException, IOException{
        //models.Customer newCustomer=new models.Customer(name, surname);
        Borrowing newBorrowing=null;

        // ustawienie czasu wypozyczenia
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 30);
        dt = c.getTime();
        String date = dt.toString();

        switch (number){
            case 5: // ksiazka
                Book newBook = new Book(title, author, amount);
                newBorrowing = new Borrowing(newCustomer, newBook,amount,date);
                Main.BookBorrowingList.add(newBorrowing);
                break;
            case 6:
                Film newFilm = new Film(title, author, amount);
                newBorrowing = new Borrowing(newCustomer, newFilm,amount,date);
                Main.FilmBorrowingList.add(newBorrowing);
                break;
            case 7:
                Game newGame = new Game(title, author, amount);
                newBorrowing = new Borrowing(newCustomer, newGame,amount,date);
                Main.GameBorrowingList.add(newBorrowing);
                break;

        }

        BorrowingView.nextBorrowing(newCustomer, number);


    }
}


