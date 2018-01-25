package actions;

import models.Customer;
import others.Main;
import others.MyInput;
import view.StartView;

import java.io.IOException;
import java.util.Iterator;

public class RemovingCustomer {
    public static void removeCustomer() throws ClassNotFoundException, IOException{
        MyInput.showString("Podaj dane klienta do usunięcia.");
        Customer forRemoving = MyInput.getCustomer();
        boolean removed=false;

        /*for(models.Customer c: others.Main.CustomerList){
            if(c.equals(forRemoving)){
                others.Main.CustomerList.remove(c);
                removed=true;
            }
        }*/
        Iterator<Customer> iter = Main.CustomerList.iterator();

        while (iter.hasNext()) {
            Customer str = iter.next();

            if (str.equals(forRemoving)) {
                iter.remove();
                removed=true;
            }
        }

        if(removed){
            MyInput.showString("Klient usuniety z bazy danych.");
        }else{
            MyInput.showString("Nie znaleziono klienta w bazie.");
        }
        StartView.talking_with_user();
    }
}
