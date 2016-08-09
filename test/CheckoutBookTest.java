package com.jinli.test;

import com.jinli.view.CheckoutBookView;
import org.junit.Assert;
import org.junit.Test;

public class CheckoutBookTest {
    @Test
    public void checkout(){
        CheckoutBookView checkoutBookView = new CheckoutBookView();
        Assert.assertEquals("checkout failed", checkoutBookView.checkoutBook(-2));
        Assert.assertEquals("checkout success", checkoutBookView.checkoutBook(2));
    }
}
