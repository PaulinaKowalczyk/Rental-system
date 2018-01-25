package models;

import java.io.Serializable;

public class Borrowing implements Serializable, Comparable<Borrowing>{
    public Customer customer;
    public ElementinLibrary element;
    public int amount;
    public String data_of_return;

    public Borrowing (Customer customer, ElementinLibrary element, int amount, String data_of_return){
        this.customer=customer;
        this.element = element; // zeby moc tu przechowywac zarowno ksiazki, jak i filmy, czy gry
        this.amount=amount;
        this.data_of_return=data_of_return;
    }

    public Borrowing (Customer customer, ElementinLibrary element){
        this.customer=customer;
        this.element=element;
    }

    @Override
    public String toString() {
        return customer + " " + element.title +" " +element.author + " " + amount;
    }

    public boolean equals(Borrowing b) {
        if (b.customer.equals(this.customer) && b.element.equals(this.element)) return true;
        else return false;
    }

    public int compareTo (Borrowing b) {
        int porownanie = this.customer.compareTo(b.customer);
        return porownanie == 0 ? this.element.compareTo(b.element) : porownanie;
    }
}
