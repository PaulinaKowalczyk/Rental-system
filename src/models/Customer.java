package models;

import java.io.Serializable;

public class Customer implements  Serializable, Comparable<Customer>{
    String name;
    String surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }

   public int compareTo(Customer o) {
        int nameComparision = this.surname.compareTo(o.surname);
        return nameComparision == 0 ? this.name.compareTo(o.name) : nameComparision;
    }

    public boolean equals(Customer c) {
        if (c.name.equals(this.name) && c.surname.equals(this.surname)) return true;
        else return false;
    }
}
