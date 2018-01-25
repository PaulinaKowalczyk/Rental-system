package actions;

import models.Customer;
import others.Main;
import view.AddingClientView;

import java.io.IOException;
import java.util.Collections;


public class AddingClientController {
    public static void addingClient(Customer newCustomer) throws IOException, ClassNotFoundException {

        Main.CustomerList.add(newCustomer);
        Collections.sort(Main.CustomerList);

        AddingClientView.next_Client();
    }
}