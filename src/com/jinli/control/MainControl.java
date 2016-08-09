package com.jinli.control;

import com.jinli.util.StringUtil;
import com.jinli.view.*;

/**
 * Created by jinli on 8/4/16.
 */
public class MainControl {
    public void choseMenu(Integer menu){

        switch (menu){
            case 1:
                BookListView bookListView = new BookListView();
                bookListView.showBookList();
                BookDetailView bookDetailView = new BookDetailView();
                bookDetailView.showBookDetail(null);
                break;
            case 2:
                CheckoutBookView checkoutBookView = new CheckoutBookView();
                checkoutBookView.checkoutBook(null);
                break;
            case 3:
                ReturnBookView returnBookView = new ReturnBookView();
                returnBookView.returnBook(null);
                break;
            default:
                ErrorView errorView = new ErrorView();
                errorView.invalidOption();
                break;
        }


    }


}
