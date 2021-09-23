package com.java;

public class Customer {
    public String fname;
    public  String lname;
    public double balance;

    public void checkBalance(){
        System.out.println("Current balance is: "+ this.balance);
    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient Balance :(");
        }else{
            this.balance = this.balance - amount;
            System.out.println("Transaction successfull ");
            System.out.println("Remaining Balance is: "+ this.balance);
        }
    }

    public void deposit(double amount){
            this.balance = this.balance + amount;
            System.out.println("Transaction successfull!");
            System.out.println("Updated Balance is: "+ this.balance);
    }
}
