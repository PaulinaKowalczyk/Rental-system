package others;

import models.Book;
import models.Customer;
import models.Film;
import models.Game;

import java.util.Scanner;

public class MyInput {

    public static void showString(String args){
        System.out.println(args);
    }
    public static String getString(){
        Scanner in = new Scanner (System.in);
        String answer = in.nextLine();
        return answer;
    }
    public static int getInt(){
        Scanner forInt = new Scanner(System.in);
        int value = forInt.nextInt();
        return value;
    }


    public static int rightAmount(){
        int amount=0 ;
        boolean right_amount = false;
        do {
            try {
                amount=MyInput.getInt();
                if(amount>0) {
                    right_amount = true;
                }
                if(amount<=0){
                    System.out.println("Ilość musi być liczbą całkowitą, większą od zera!");
                }
            } catch (Exception e) {
                if ((amount <= 0)) {
                    System.out.println("Ilość musi być liczbą całkowitą, większą od zera!");
                }
            }
        } while(right_amount==false);
        return amount;
    }


    public static String answer() {
        boolean get_answer=false;
        String ans;
        do {

            ans=MyInput.getString();
            for (EnumValues.YesorNo answers : EnumValues.YesorNo.values()) {
                if (answers.answer.equals(ans)) {
                    get_answer = true;
                }
            }
            if(get_answer==false)
                MyInput.showString("Odpowiedz musi brzmiec tak lub nie");
        } while (get_answer == false);
        return ans;
    }

    public static String getBookgenre () {
        String genreBook;
        boolean get_genre = false;
        do {
            genreBook = MyInput.getString();
            for (EnumValues.Bookgenres eb : EnumValues.Bookgenres.values()) {
                if (eb.value.equals(genreBook)) {
                    get_genre = true;
                }
            }//koniec fora
            if (get_genre == false) {
                MyInput.showString("Gatunek musi byc jednym z nastepujacych: baśnie/poezja/klasyka/przygodowa/" +
                        "historyczna/popularnonaukowa/specjalistyczna");
            }
        } while (get_genre == false);// while gatunku

        return genreBook;
    }

    public static String getFilmgenre () {
        String genreFilm;
        boolean get_genre = false;
        do {
            genreFilm = MyInput.getString();
            for (EnumValues.Filmgenres eb : EnumValues.Filmgenres.values()) {
                if (eb.value.equals(genreFilm)) {
                    get_genre = true;
                }
            }//koniec fora
            if (get_genre == false) {
                MyInput.showString("Gatunek musi byc jednym z nastepujacych: dramat/komedia/akcja/animowany/fantasy/SF/western");
            }
        } while (get_genre == false);// while gatunku

        return genreFilm;
    }

    public static String getGamegenre () {
        String genreGame;
        boolean get_genre = false;
        do {
            genreGame = MyInput.getString();
            for (EnumValues.Gamegenres eb : EnumValues.Gamegenres.values()) {
                if (eb.value.equals(genreGame)) {
                    get_genre = true;
                }
            }//koniec fora
            if (get_genre == false) {
                MyInput.showString("Gatunek musi byc jednym z nastepujacych: bijatyka/strzelanka/przygodowa/logiczna/muzyczna");
            }
        } while (get_genre == false);// while gatunku

        return genreGame;
    }


    public static Customer getCustomer (){
        MyInput.showString("Podaj imie klienta:");
        String name = MyInput.getString();

        MyInput.showString("Podaj nazwisko klienta:");
        String surname = MyInput.getString();

        Customer newCustomer = new Customer(name, surname);
        return newCustomer;
    }

    public static Book getBook (){
        MyInput.showString("Podaj tytul ksiazki:");
        String titleBook = MyInput.getString();
        MyInput.showString("Podaj autora ksiazki:");
        String authorBook = MyInput.getString();

        Book b = new Book (titleBook, authorBook);
        return b;
    }

    public static Film getFilm (){
        MyInput.showString("Podaj tytul filmu:");
        String titleFilm = MyInput.getString();
        MyInput.showString("Podaj reżysera filmu:");
        String authorFilm = MyInput.getString();
        Film f = new Film(titleFilm, authorFilm);
        return f;
    }

    public static Game getGame (){
        MyInput.showString("Podaj tytul gry:");
        String titleGame = MyInput.getString();
        MyInput.showString("Podaj producenta gry:");
        String authorGame = MyInput.getString();
        Game g = new Game(titleGame, authorGame);
        return g ;
    }

}
