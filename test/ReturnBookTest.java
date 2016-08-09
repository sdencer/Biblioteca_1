package com.jinli.test;

import com.jinli.view.ReturnBookView;
import org.junit.Assert;
import org.junit.Test;

public class ReturnBookTest {
    @Test
    public void returnBook(){
        ReturnBookView returnBookView = new ReturnBookView();
        Assert.assertEquals("return success", returnBookView.returnBook(1));
        Assert.assertEquals("return failed", returnBookView.returnBook(-2));
    }
}
