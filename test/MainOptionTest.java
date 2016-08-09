package com.jinli.test;

import com.jinli.control.MainControl;
import com.jinli.view.ErrorView;
import com.jinli.view.MainView;
import org.junit.Assert;
import org.junit.Test;

public class MainOptionTest {
    @Test
    public void invalidOption(){
        ErrorView errorView = new ErrorView();
        Assert.assertEquals("Select a valid option!", errorView.invalidOption());
    }
}
