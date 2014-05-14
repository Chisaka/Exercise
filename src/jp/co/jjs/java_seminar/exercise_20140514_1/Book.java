package jp.co.jjs.java_seminar.exercise_20140514_1;

import java.util.Date;

public class Book {

    int id; // 本を識別する番号
    int price; // 本の値段
    String title; // タイトル
    String isbnNum; // isbn番号
    String publisher; // 出版社
    String writer;
    Date publication;

    public Book(
            int id,
            int price,
            String title,
            String isbnNum,
            String publisher,
            String writer,
            Date publication
            ) {
        this.id = id;
        this.price = price;
        this.title = title;

    }

}
