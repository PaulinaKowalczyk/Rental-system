package others;

import models.Borrowing;
import models.Customer;
import models.ElementinLibrary;
import view.StartView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Customer> CustomerList=new ArrayList<>();
    public static List <ElementinLibrary> BookList=new ArrayList<>();
    public static List <ElementinLibrary> FilmList=new ArrayList<>();
    public static List <ElementinLibrary> GameList=new ArrayList<>();
    public static List<Borrowing> BookBorrowingList=new ArrayList<>();
    public static List<Borrowing> FilmBorrowingList=new ArrayList<>();
    public static List<Borrowing> GameBorrowingList=new ArrayList<>();

    public static void main(String [] args) throws ClassNotFoundException, IOException {

        CustomerList =(List) StartandEnding.startCustomer();

        List ElementList = StartandEnding.startElement("Obiekty.txt");
        if(!ElementList.isEmpty()) {
            BookList = (List) ElementList.get(0);
            FilmList = (List) ElementList.get(1);
            GameList = (List) ElementList.get(2);
        }

        List BorrowedList= StartandEnding.startElement("Wypozyczenia.txt");
        if(!BorrowedList.isEmpty()) {
            BookBorrowingList = (List) BorrowedList.get(0);
            FilmBorrowingList = (List) BorrowedList.get(1);
            GameBorrowingList = (List) BorrowedList.get(2);
        }

        StartView.talking_with_user();

    }
}
