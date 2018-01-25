package view;
import actions.*;
import models.*;
import others.MyInput;

import java.io.IOException;

public class ReturningView {

    public static void returning(int number) throws ClassNotFoundException, IOException {
        Customer newCustomer = MyInput.getCustomer();
        switch (number) {
            case 8: // oddanie ksiazki
                Book b = MyInput.getBook();
                MyInput.showString("Podaj ile egzemplarzy ksiazki chcesz oddać:");
                int amount = MyInput.rightAmount();
                ReturningBorrowing.returning(8,newCustomer, b, amount);
                break;
            case 9: // oddanie filmu
                Film f= MyInput.getFilm();
                MyInput.showString("Podaj ile egzemplarzy filmu chcesz oddać:");
                amount = MyInput.rightAmount();
                ReturningBorrowing.returning(9,newCustomer, f, amount);
                break;
            case 10: // oddanie filmu
                Game g= MyInput.getGame();
                MyInput.showString("Podaj ile egzemplarzy gry chcesz oddać:");
                amount = MyInput.rightAmount();
                ReturningBorrowing.returning(10,newCustomer, g, amount);
                break;
        }
        //view.StartView.talking_with_user();
    }
}
