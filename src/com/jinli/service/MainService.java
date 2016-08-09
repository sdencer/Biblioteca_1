package com.jinli.service;

import com.jinli.db.BookDB;
import com.jinli.model.Book;
import com.jinli.util.StringUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by jinli on 8/4/16.
 */
public class MainService {
    public List<Book> getBookList(){
        return BookDB.getBookList();
    }

    public boolean updateBookStatus(Integer bookId, boolean isCheckout){
        Map bookMap = BookDB.getBookMap();
        if (bookMap.containsKey(bookId)){
            Book book = (Book) bookMap.get(bookId);
            if (isCheckout) {
                if (book.isCheckout()) {
                    return false;
                }
                book.setCheckout(isCheckout);
            } else {
                if (!book.isCheckout()){
                    return false;
                }
                book.setCheckout(isCheckout);
            }
            return true;
        }
        return false;
    }

    public String getBookDetailsById(Integer bookId){
        Map bookMap = BookDB.getBookMap();
        if (bookMap.containsKey(bookId)){
            Book book = (Book) bookMap.get(bookId);
            return book.getDetails();
        }
        return  null;

    }

}
