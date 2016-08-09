package com.jinli.test;


import com.jinli.view.LoginView;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WelcomTest {
    PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
    ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流
    LoginView login;
    @org.junit.Before
    public void setUp() throws Exception {
        login = new LoginView();
        bytes = new ByteArrayOutputStream();    // 分配空间
        console = System.out;                   // 获取System.out 输出流的句柄
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes
    }
    @org.junit.After
    public void tearDown() throws Exception {
        System.setOut(console);
    }
    @org.junit.Test
    public void testResult() throws Exception {
        login.login();
        String s = new String("Sdencer\n");    // 注意：控制台的换行，这里用 '\n' 表示
        Assert.assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流
    }




}
