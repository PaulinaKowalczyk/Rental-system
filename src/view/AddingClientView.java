package view;

import actions.AddingClientController;
import others.MyInput;
import models.Customer;

import java.io.IOException;



public class AddingClientView {
    public static void addingClient() throws IOException, ClassNotFoundException {

            Customer newCustomer = MyInput.getCustomer();
            AddingClientController.addingClient(newCustomer); // dodaje klienta
    }

        public static void next_Client() throws ClassNotFoundException, IOException{
        MyInput.showString("Czy chcesz dodać kolejnego klienta? Odpowiedz tak lub nie."); // enum na tak i nie

              String answer= MyInput.answer();

                if (answer.equals("tak")) {
                    AddingClientView.addingClient();
                }
                if (answer.equals("nie")) {
                   StartView.talking_with_user();
                }


    }

}
