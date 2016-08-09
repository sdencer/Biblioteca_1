package com.jinli.view;

import com.jinli.service.MainService;
import com.jinli.util.StringUtil;

/**
 * Created by jinli on 8/5/16.
 */
public class CheckoutBookView {
    MainService mainService = new MainService();
    public String  checkoutBook(Integer bookId){
        String checkoutRes = null;
        while (true){
            System.out.println("please input the book id or input 0 to quit");
            if (bookId == null) {
                bookId = StringUtil.getInputInt();
            }
            if (bookId == 0) {
                break;
            }
            if (mainService.updateBookStatus(bookId, true)) {
                checkoutRes = "checkout success";
            }else {
                checkoutRes = "checkout failed";
            }
            bookId = null;
            System.out.println(checkoutRes);

        }
        return checkoutRes;
    }
}
