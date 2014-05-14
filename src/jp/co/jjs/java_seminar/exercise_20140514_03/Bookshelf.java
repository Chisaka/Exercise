package jp.co.jjs.java_seminar.exercise_20140514_03;


public class Bookshelf {
    
    Book[] books = new Book[10];
    int i;

    public Bookshelf(Book book1) {
        books[i] = book1;
        System.out.println(books[i].title + " " + books[i].publisher + " " + books[i].writer);
        i++;
    }

}
