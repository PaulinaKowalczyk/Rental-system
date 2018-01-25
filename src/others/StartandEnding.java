package others;

import actions.InputandOutput;
import models.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartandEnding {

    public static List startCustomer() throws ClassNotFoundException, IOException {
        List<Customer> CustomerList = InputandOutput.readingObjects("klienciObiekty.txt");
        return  CustomerList;
    }

    public static List startElement(String filename) throws ClassNotFoundException, IOException {
        List list  = InputandOutput.readingObjects(filename);

        return list;
    }


    public static void end () throws ClassNotFoundException, IOException {
        // zapisanie na samym koncu tuz przed zamknieciem systemu

        InputandOutput.writingObjects("klienciObiekty.txt", Main.CustomerList);

        List<List> ElementList = new ArrayList<>();
        ElementList .add(Main.BookList);
        ElementList .add(Main.FilmList);
        ElementList .add(Main.GameList);
        InputandOutput.writingObjects( "Obiekty.txt", ElementList );

        List<List> BorrowedList = new ArrayList<>();
        BorrowedList.add(Main.BookBorrowingList);
        BorrowedList.add(Main.FilmBorrowingList);
        BorrowedList.add(Main.GameBorrowingList);
        InputandOutput.writingObjects( "Wypozyczenia.txt", BorrowedList );

    }
}
