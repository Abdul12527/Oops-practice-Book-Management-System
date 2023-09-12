package org.example;

import java.util.ArrayList;

public class Services {
    public ArrayList<Book> filterBookByAuthor(ArrayList<Book> books, Author author){
        ArrayList<Book> ans=new ArrayList<>();
        for(Book b:books){
            if(b.hasAuthor(author))ans.add(b);
        }
        return ans;
    }
    public ArrayList<Book> filterBookByPublisher(ArrayList<Book> books, Publisher publisher){
        ArrayList<Book> ans=new ArrayList<>();
        for(Book b:books){
            if(b.getPublisher().equals(publisher))ans.add(b);
        }
        return ans;
    }

    public ArrayList<Book> filterBookByPublishYear(ArrayList<Book> books, Integer Year){
        ArrayList<Book> ans=new ArrayList<>();
        for(Book b:books){
            if(b.getPublishYear().equals(Year))ans.add(b);
        }
        return ans;
    }
    public ArrayList<Book> filterBookByBeforeSpecifiedYear(ArrayList<Book> books, Integer Year){
        ArrayList<Book> ans=new ArrayList<>();
        for(Book b:books){
            if(b.getPublishYear()<=Year)ans.add(b);
        }
        return ans;
    }
    public ArrayList<Book> filterBookByAfterSpecifiedYear(ArrayList<Book> books, Integer Year){
        ArrayList<Book> ans=new ArrayList<>();
        for(Book b:books){
            if(b.getPublishYear()>=Year)ans.add(b);
        }
        return ans;
    }

}
