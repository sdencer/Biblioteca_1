package com.jinli.view;

import com.jinli.model.Book;
import com.jinli.service.MainService;

import java.util.List;

/**
 * Created by jinli on 8/5/16.
 */
public class BookListView {
    MainService mainService = new MainService();
    public List<Book> showBookList(){
        List<Book> bookList = mainService.getBookList();
        System.out.println("id     | bookname             | isCheckout");
        for (int bookIndex = 0; bookIndex < bookList.size(); bookIndex ++) {
            Book book = bookList.get(bookIndex);
            System.out.print(" " + String.format("%-5s", book.getId())+ " | "
                    + String.format("%-20s", book.getName()) +" | "
                    + String.format("%-10s", book.isCheckout()) + "\n");
        }
        return bookList;
    }
}
