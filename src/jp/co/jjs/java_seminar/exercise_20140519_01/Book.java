package jp.co.jjs.java_seminar.exercise_20140519_01;

public class Book {

    String title; // タイトル
    String ISBN; // ISBN番号
    String publisher; // 出版社
    String writer; // 著者
    int price;
    
    public Book(String title, String ISBN, String publisher, String writer, int price) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.writer = writer;
        this.price = price;

    }
    

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return ISBN;
    }

    public String getAuthor() {
        return writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", ISBN=" + ISBN + ", writer=" + writer
                + ", publisher=" + publisher + ", price=" + price + "]";
    }
}
