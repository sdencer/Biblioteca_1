package com.jinli.test;

import com.jinli.view.BookDetailView;
import org.junit.Assert;
import org.junit.Test;

public class BookDetailTest {
    @Test
    public void testBookDetail(){
        BookDetailView bookDetailView = new BookDetailView();
        Assert.assertEquals("help you learn java", bookDetailView.showBookDetail(1));
        Assert.assertEquals("help you learn c", bookDetailView.showBookDetail(2));
        Assert.assertEquals("help you learn js", bookDetailView.showBookDetail(3));
        Assert.assertEquals("make yourself at home", bookDetailView.showBookDetail(5));
    }
}
