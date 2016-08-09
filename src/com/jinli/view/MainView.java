package com.jinli.view;

import com.jinli.util.StringUtil;
import com.jinli.control.MainControl;

/**
 * Created by jinli on 8/4/16.
 */
public class MainView {
    MainControl mainControl = new MainControl();

    public void showMainMenu(){
        while (true) {
            System.out.println("===================================");
            System.out.println("1. BookList");
            System.out.println("2. Checkout Book");
            System.out.println("3. Return Book");
            System.out.println("0. exit");
            System.out.println("please input the number:");
            Integer menu = StringUtil.getInputInt();
            if (menu == 0) {
                break;
            }
            mainControl.choseMenu(menu);
        }

    }
}
