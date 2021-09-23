package com.java;

import java.util.Scanner;

public class Medical {
    public String name;
    public int quantity;
    public double price;

    public Medical(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void checkQuantity(){
        System.out.println("current quantity is " + this.quantity);
    }
    public void buyQuantity() {
        int Rquantity;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter qty:");
        Rquantity = sc.nextInt();

        if (Rquantity > quantity) {
            System.out.println("Insufficient quantity:(");
        } else {
            System.out.println("Medicine available");
            System.out.println("Price: "+ this.price);
            this.quantity = this.quantity - Rquantity;
            System.out.println("Medicine purchased!!!");
            System.out.println("Remaining quantity is: " + this.quantity);
        }

    }
}