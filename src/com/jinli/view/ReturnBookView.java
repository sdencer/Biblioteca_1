package com.jinli.view;

import com.jinli.service.MainService;
import com.jinli.util.StringUtil;

/**
 * Created by jinli on 8/5/16.
 */
public class ReturnBookView {
    MainService mainService = new MainService();
    public String returnBook(Integer bookId){
        String returnRes = null;
        while (true) {
            if (bookId == null) {
                System.out.println("please input the book id");
                bookId = StringUtil.getInputInt();
            }
            if (bookId == 0) {
                break;
            }

            if (mainService.updateBookStatus(bookId, false)) {
                returnRes = "return success";
            }else {
                returnRes = "return failed";
            }
            bookId = null;
            System.out.println(returnRes);

        }
        return  returnRes;
    }

}
