package com.jinli.db;

import com.jinli.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jinli on 8/5/16.
 */
public class BookDB {
    private static List<Book> bookList = null;
    private static Map<Integer, Book> bookMap = null;
    public static List<Book> getBookList(){
        if (bookList == null) {
            initBookDB();
        }
        return bookList;
    }
    public static void initBookDB(){
        bookList = new ArrayList<Book>();
        bookMap = new HashMap<Integer, Book>();
        Book javaBook = new Book();
        javaBook.setId(1);
        javaBook.setName("Java");
        javaBook.setDetails("help you learn java");

        javaBook.setCheckout(false);
        bookList.add(javaBook);
        bookMap.put(1, javaBook);

        Book cBook = new Book();
        cBook.setId(2);
        cBook.setName("C");
        cBook.setDetails("help you learn c");
        cBook.setCheckout(false);
        bookList.add(cBook);
        bookMap.put(2, cBook);

        Book jsBook = new Book();
        jsBook.setId(3);
        jsBook.setName("JavaScript");
        jsBook.setDetails("help you learn js");
        jsBook.setCheckout(false);
        bookList.add(jsBook);
        bookMap.put(3, jsBook);

        Book musicBook = new Book();
        musicBook.setId(1);
        musicBook.setName("Music");
        musicBook.setDetails("relax yourself");
        musicBook.setCheckout(false);
        bookList.add(musicBook);
        bookMap.put(4, musicBook);

        Book yellowBook = new Book();
        yellowBook.setId(5);
        yellowBook.setName("yellowBook");
        yellowBook.setDetails("make yourself at home");
        yellowBook.setCheckout(true);
        bookList.add(yellowBook);
        bookMap.put(5, yellowBook);

    }

    public static Map getBookMap(){
        if (bookMap == null) {
            initBookDB();
        }
        return bookMap;
    }
}
