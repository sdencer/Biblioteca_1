package com.jinli.util;

import java.util.Scanner;

/**
 * Created by jinli on 8/4/16.
 */
public class StringUtil {
    public static String getInputString(){
        return new Scanner(System.in).nextLine();
    }
    public static Integer getInputInt(){
        Integer inputNum = -1;
        try {
            inputNum = Integer.parseInt(getInputString());
        } catch (Exception exception) {
            exception.getMessage();
            System.out.println("please input a valid number");
        }
        return inputNum;
    }
}
