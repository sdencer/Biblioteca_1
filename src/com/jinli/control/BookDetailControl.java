package com.jinli.control;

import com.jinli.service.MainService;

public class BookDetailControl {

    public String getBookDetailById(Integer bookId){
        MainService mainService = new MainService();
        String bookDetail = mainService.getBookDetailsById(bookId);
        if (bookDetail == null) {
            return "err bookId";
        }
        return bookDetail;
    }

}
