package com.java;

import java.util.Scanner;

public class Billing {
    public String productName;
    public double productPrice;

    public void checkProductName(){
        System.out.println(" 1.mobile\n 2.tv\n 3.laptop");
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if (i==1){
            checkProductPrice("mobile");
        }else if  (i==2){
            checkProductPrice("tv");
        }else if (i==3){
            checkProductPrice("laptop");
        }
    }
    public void checkProductPrice(String product){
        if (product.equals("mobile")){
            System.out.println("mobile=200-300");
        }else if (product.equals("tv")){
            System.out.println("tv=300-400");
        }else {
            System.out.println("laptop=500-700");
        }
    }

}