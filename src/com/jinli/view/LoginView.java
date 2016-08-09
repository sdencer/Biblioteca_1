package com.jinli.view;

import com.jinli.util.StringUtil;
import com.jinli.control.LoginControl;


public class LoginView {
    LoginControl loginControl = new LoginControl();
    MainView mainView = new MainView();

    public void login(){
        System.out.println("please input your name:");
        String username = StringUtil.getInputString();
        System.out.println("Welcome, " + loginControl.getUserName(username));
        goMainView();
    }

    public void welcome(){
        System.out.println("Welcome to Biblioteca");
    }

    public void goMainView(){
        mainView.showMainMenu();
    }





}
