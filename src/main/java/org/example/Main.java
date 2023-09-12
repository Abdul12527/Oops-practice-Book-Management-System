package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Publisher p1=new Publisher(1,"Kandu Publisher");
        Publisher p2=new Publisher(2,"Stupid publishe");
        Publisher p3=new Publisher(3,"Green stuff");

        Author a1=new Author("baba","bhadu",1);
        Author a2=new Author("guru","ghantal",2);
        Author a3=new Author("Bhand","baba",3);
        ArrayList<Book> lib=new ArrayList<>();

        Book b1=new Book(1,"KuKu ka Jadu",new Author[]{a1,a2},p1,1999,400,new BigDecimal(2000),CoverTypes.HardCore);
        Book b2=new Book(2,"Ek kash or Dhartipar",new Author[]{a3},p3,2999,690,new BigDecimal(1000),CoverTypes.HardCore);
        Book b3=new Book(3,"flat earth",new Author[]{a2},p1,1999,100,new BigDecimal(-2000),CoverTypes.PaperBack);

        lib.add(b1);
        lib.add(b2);
        lib.add(b3);

        Services s1=new Services();
        System.out.println(s1.filterBookByAuthor(lib,a2));
        System.out.println(s1.filterBookByPublisher(lib,p2));
    }
}