package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
     //   Bookwriter writer = new Bookwriter();
        ArrayList<Book> books = Io.read("books.csv");
        BookShelftest bookshelf = new BookShelftest();
        bookshelf.addAll(books);
        bookshelf.showAll();

    }

}
