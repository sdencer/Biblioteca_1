package com.jinli.model;

/**
 * Created by jinli on 8/4/16.
 */
public class Book {
    private String name;
    private Integer id;
    private boolean isCheckout;
    //private Integer totalNum;
    //private Integer currentNum;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String details;

//    public Integer getCurrentNum() {
//        return currentNum;
//    }
//
//    public void setCurrentNum(Integer currentNum) {
//        this.currentNum = currentNum;
//    }
//
//    public Integer getTotalNum() {
//
//        return totalNum;
//    }
//
//    public void setTotalNum(Integer totalNum) {
//        this.totalNum = totalNum;
//    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

}
