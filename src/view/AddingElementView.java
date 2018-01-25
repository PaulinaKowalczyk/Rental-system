package view;

import actions.*;
import others.MyInput;
import models.*;

import java.io.IOException;


public class AddingElementView {

    public static void addingsingularElement(int number) throws IOException, ClassNotFoundException {

        switch (number) {
            case 2: // dodawanie ksiazki
                Book b = MyInput.getBook();
                MyInput.showString("Podaj gatunek ksiazki (baśnie/poezja/klasyka/przygodowa/" +
                                                        "historyczna/popularnonaukowa/specjalistyczna):");
                String genreBook= MyInput.getBookgenre();
                MyInput.showString("Podaj ilosc wprowadzanych ksiazek:");
                int amountBook= MyInput.rightAmount();
                AddingElementController.makeElement(2, b.title, b.author, genreBook, amountBook);
                break;
            case 3: // dodawanie filmu
                Film f = MyInput.getFilm();
                MyInput.showString("Podaj gatunek filmu (dramat/komedia/akcja/animowany/\" +\n" +
                        "                        \"fantasy/SF/western) :");
                String genreFilm = MyInput.getFilmgenre();
                MyInput.showString("Podaj ilosc wprowadzanych filmow:");
                int amountFilm = MyInput.rightAmount();
                AddingElementController.makeElement(3, f.title, f.author, genreFilm, amountFilm);
                break;
            case 4: // dodawanie gry
                Game g = MyInput.getGame();
                MyInput.showString("Podaj gatunek gry (bijatyka/strzelanka/przygodowa/\" +\n" +
                        "                        \"logiczna/muzyczna):");
                String genreGame = MyInput.getGamegenre();
                MyInput.showString("Podaj ilosc wprowadzanych gier:");
                int amountGame = MyInput.rightAmount();
                AddingElementController.makeElement(4, g.title, g.author, genreGame, amountGame);
                break;
    }
    }

    public static void addingnextelement(int number) throws ClassNotFoundException, IOException {

        switch(number) {
            case 2:
                MyInput.showString("Czy chcesz dodac kolejna ksiazke? Odpowiedz tak lub nie.");
                String answer;
                answer = MyInput.answer();
                if (answer.equals("nie"))
                StartView.talking_with_user();
                else
                    addingsingularElement(2);
                break;
            case 3:
                MyInput.showString("Czy chcesz dodac kolejny film? Odpowiedz tak lub nie.");
                answer = MyInput.answer();
                if (answer.equals("nie"))
                    StartView.talking_with_user();
                else
                    addingsingularElement(3);
                break;
            case 4:
                MyInput.showString("Czy chcesz dodac kolejna gre? Odpowiedz tak lub nie.");
                answer = MyInput.answer();
                if (answer.equals("nie"))
                    StartView.talking_with_user();
                else
                    addingsingularElement(4);
                break;
        }

    }
}

