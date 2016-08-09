package com.jinli.view;

import com.jinli.control.BookDetailControl;
import com.jinli.util.StringUtil;

public class BookDetailView {
    public String showBookDetail(Integer bookId){
        String bookDetail = null;
        while (true) {
            System.out.println("please input bookId to see book details or input 0 to quit");
            if (bookId == null) {
                bookId = StringUtil.getInputInt();
            }
            if (bookId == 0) {
                break;
            }
            BookDetailControl bookDetailControl = new BookDetailControl();
            bookDetail = bookDetailControl.getBookDetailById(bookId);
            bookId = null;
            System.out.println(bookDetail);

        }

        return bookDetail;
    }

}
