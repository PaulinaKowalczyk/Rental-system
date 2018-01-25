package actions;

import models.Borrowing;
import models.Customer;
import models.ElementinLibrary;
import others.Main;
import others.MyInput;
import view.StartView;

import java.io.IOException;

public class Display {

    public static void display (int number) throws ClassNotFoundException, IOException{
        boolean displayed=true;
        switch (number) {
            case 12:
                if(Main.CustomerList.isEmpty())
                    displayed=false;
                for (Customer c : Main.CustomerList) {
                    MyInput.showString(c.toString());
                }
                break;
            case 13:
                if(Main.BookList.isEmpty())
                    displayed=false;
                for(ElementinLibrary e: Main.BookList){
                    MyInput.showString(e.toString());
                }
                break;
            case 14:
                if(Main.FilmList.isEmpty())
                    displayed=false;
                for(ElementinLibrary e: Main.FilmList){
                    MyInput.showString(e.toString());
                }
                break;
            case 15:
                if(Main.GameList.isEmpty())
                    displayed=false;
                for(ElementinLibrary e: Main.GameList){
                    MyInput.showString(e.toString());
                }
                break;
            case 16:
                if(Main.BookBorrowingList.isEmpty())
                    displayed=false;
                for(Borrowing b: Main.BookBorrowingList){
                    MyInput.showString(b.toString());
                }
                break;
            case 17:
                if(Main.FilmBorrowingList.isEmpty())
                    displayed=false;
                for(Borrowing b: Main.FilmBorrowingList){
                    MyInput.showString(b.toString());
                }
                break;
            case 18:
                if(Main.GameBorrowingList.isEmpty())
                    displayed=false;
                for(Borrowing b: Main.GameBorrowingList){
                    MyInput.showString(b.toString());
                }
                break;
        }
        if(displayed==false){
            MyInput.showString("Lista jest pusta.");
        }
        StartView.talking_with_user();
    }
}