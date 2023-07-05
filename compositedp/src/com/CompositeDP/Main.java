package com.CompositeDP;//creating a package

import java.util.ArrayList;
import java.util.List;

 interface person {
    void showDetails();//declaring operation
}
//package CompositeDP;
class Newcustomer implements person {//leaf
    private String name;
    private int number;
    public Newcustomer(String name, int n) {
        this.name = name;
        this.number = n;
    }
    @Override
    public void showDetails() {//operation of leaf
        System.out.println("Customer_Name:" + name);
        System.out.println("Number:" + number);
    }
}
//package CompositeDP;
class Newmanager implements person {//leaf
    private String name;
    private int number;
    public Newmanager(String name, String e, int n) {
        this.name = name;

        this.number = n;
    }
    @Override
    public void showDetails() {//operation of leaf 2
        System.out.println("Manager_Name:" + name);
        System.out.println("Number:" + number);
    }
}
//package CompositeDP;

class organisation implements person {
    private List<person> personlist = new ArrayList<person>();
    @Override
    public void showDetails() {
        for (person p : personlist) {
            p.showDetails();
        }
    }
    public void addPerson(person p) {
        personlist.add(p);
    }
    public void removePerson(person p) {
        personlist.remove(p);
    }
}
public class Main {
    public static void main(String args[]) {

        Newcustomer c1 = new Newcustomer("Rahul",
                 945719651);
        Newcustomer c2 = new Newcustomer("Diya",
                 200006420);
        organisation org = new organisation();
        org.addPerson(c1);
        org.addPerson(c2);
        Newmanager m1 = new Newmanager("Suhani",
                "suhani.malhotra@gmail.com", 502623484);
        Newmanager m2 = new Newmanager("Ram", "ram.shah45@gmail.com",
                956482643);
        organisation org2 = new organisation();
        org2.addPerson(m1);
        org2.addPerson(m2);
        organisation org3 = new
                organisation();
        org3.addPerson(org);
        org3.addPerson(org2);
        org3.showDetails();
    }
}
