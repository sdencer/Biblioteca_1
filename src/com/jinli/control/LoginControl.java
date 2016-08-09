package com.jinli.control;

import com.jinli.view.MainView;

/**
 * Created by jinli on 8/4/16.
 */
public class LoginControl {

    public String getUserName(String username){
        if (username != null && username != "" && username.length() <= 100){
            return username;
        } else {
            return "Invalid Username, Username should not be null or length >100";
        }
    }




}
