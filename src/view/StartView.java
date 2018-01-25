package view;
import actions.*;
import others.MyInput;
import others.StartandEnding;


import java.io.IOException;
import java.util.InputMismatchException;

public class StartView {
    public static void talking_with_user() throws IOException, ClassNotFoundException{
        MyInput.showString( "\n" +"Wybierz co chcesz zrobić: " + "\n" +
                "1.  Dodawanie klienta " + "\n" +
                "2.  Dodanie nowej książki do katalogu " + "\n" +
                "3.  Dodanie nowego filmu do katalogu " + "\n" +
                "4.  Dodanie nowej gry do katalogu " + "\n" +
                "5.  Wypożyczenie książki " + "\n" +
                "6.  Wypożyczenie filmu " + "\n" +
                "7.  Wypożyczenie gry" + "\n" +
                "8.  Oddanie książki " + "\n" +
                "9.  Oddanie filmu" +  "\n" +
                "10. Oddanie gry " + "\n" +
                "11. Usun klienta" + "\n" +
                "12. Pokaż listę klientów"  + "\n" +
                "13. Pokaż listę dostępnych książek"  + "\n" +
                "14. Pokaż listę dostępnych filmów"  + "\n" +
                "15. Pokaż listę dostępnych gier"  + "\n" +
                "16. Pokaż listę wypożyczonych książek"  + "\n" +
                "17. Pokaż listę wypożyczonych filmów"  + "\n" +
                "18. Pokaż listę wypożyczonych gier"  + "\n" +
                "19. Wyjscie "  + "\n");

        int number=0;
        try {
            number= MyInput.getInt();
        }catch (InputMismatchException e){
        }
            switch (number) {
                case 1:
                    view.AddingClientView.addingClient();
                    break;
                case 2:
                    AddingElementView.addingsingularElement(2);
                    break;
                case 3:
                    AddingElementView.addingsingularElement(3);
                    break;
                case 4:
                    AddingElementView.addingsingularElement(4);
                    break;
                case 5:
                    BorrowingView.borrowingClient(5);
                    break;
                case 6:
                    BorrowingView.borrowingClient(6);
                    break;
                case 7:
                    BorrowingView.borrowingClient(7);
                    break;
                case 8:
                    ReturningView.returning(8);
                    break;
                case  9:
                    ReturningView.returning(9);
                    break;
                case 10:
                    ReturningView.returning(10);
                    break;
                case 11:
                    RemovingCustomer.removeCustomer();
                    break;
                case 12:
                    Display.display(12);
                    break;
                case 13:
                    Display.display(13);
                    break;
                case 14:
                    Display.display(14);
                    break;
                case 15:
                    Display.display(15);
                    break;
                case 16:
                    Display.display(16);
                    break;
                case 17:
                    Display.display(17);
                    break;
                case 18:
                    Display.display(18);
                    break;
                case 19:
                    StartandEnding.end();
                    break;
                default:
                    System.out.println("Niepoprawne argumenty na wejściu. Podaj numer z przedziału 1-19!");
                    StartView.talking_with_user();
                    break;
            }
    }
}
