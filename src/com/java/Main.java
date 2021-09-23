package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
//        Student abhijit = new Student();
//
//        abhijit.name = "abhijit";
//        abhijit.number = 1;
//        abhijit.speak();
//        System.out.println("this is java programming " + abhijit.name +" "+ abhijit.number);
//
//
//        Teacher xyz = new Teacher();
//        xyz.name = "dhanya";
//        xyz.num = 12;
//        xyz.salary =8394.98F;
//        xyz.teaching();
//        System.out.println(xyz.name +" "+ xyz.num +" "+ xyz.salary );
//
//
//        Mobile nokia = new Mobile();
//        nokia.name = "nokia";
//        nokia.ram = 4;
//        nokia.price = 387459.54f;
//        nokia.camera = 48;
//
//        nokia.call();
//        System.out.println( nokia.name +"\n "+ nokia.ram +" \n"+ nokia.price +"\n "+ nokia.camera );
//        System.out.println( nokia );
//
//        Animal dog = new Animal();
//        dog.name = "tomy";
//        dog.weight = 10;
//        dog.unit = kg;
//        dog.color ="black";
//        System.out.println( dog.name +"\n "+ dog.weight +" "+ dog.unit +"\n "+ dog.color );
        /*Customer c1 = new Customer();
        c1.fname = "test";
        c1.lname = "test2";
        c1.balance = 1000.3;
        int option;
        System.out.print("1. check balance\n2. cash withdraw\n3. cash deposit\n4. exit\n----->");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch (option){
            case 1:
                c1.checkBalance();
                break;
            case 2:
                double amount;
                System.out.print("Enter Amount: ");
                amount = sc.nextDouble();
                c1.withdraw(amount);
                break;
            case 3:
                double amount1;
                System.out.print("Enter Amount: ");
                amount1 = sc.nextDouble();
                c1.deposit(amount1);
                break;
            case 4:
                break;
        }*/
//        Billing b1 = new Billing();
//        b1.productName ="abcd";
//        b1.productPrice =45.44;
//        System.out.println( b1.productName +" "+ b1.productPrice);
//        b1.checkProductName();


//        Calculator cc = new Calculator();
//        int option;
//        System.out.println("1.addition 2.subtraction 3.multiplication 4.division ");
//        Scanner sc = new Scanner(System.in);
//        option = sc.nextInt();
//        switch (option) {
//            case 1:
//                System.out.print("enter a: ");
//                cc.a = sc.nextDouble();
//                System.out.print("enter b: ");
//                cc.b = sc.nextDouble();
//                cc.setAddition();
//                break;
//            case 2:
//                System.out.print("enter a: ");
//                cc.a = sc.nextDouble();
//                System.out.print("enter b: ");
//                cc.b = sc.nextDouble();
//                cc.setSubtraction();
//                break;
//            case 3:
//                System.out.print("enter a: ");
//                cc.a = sc.nextDouble();
//                System.out.print("enter b: ");
//                cc.b = sc.nextDouble();
//                cc.setMultiplication();
//                break;
//             case 4:
//                System.out.print("enter a: ");
//                cc.a = sc.nextDouble();
//                System.out.print("enter b: ");
//                cc.b = sc.nextDouble();
//                cc.setDivision();
//                break;
//    }
//        Laptop lap1 = new Laptop("hp", 8, 1080, 60000);
//        Laptop lap2 = new Laptop("dell", 16, 2080, 120000);
//        Laptop lap3 = new Laptop("asus", 32, 2080, 230000);
//
//        int options;
//        System.out.println("1.hp 2.dell 3.asus");
//        System.out.println("enter the number =");
//        Scanner sc = new Scanner(System.in);
//        options = sc.nextInt();
//
//        switch (options) {
//            case 1:
//                System.out.print("specification of " + lap1.name + " is:\n1.ram=" + lap1.ramSize + "GB" + "\n2.HDD=" + lap1.hdd + " \n3.price= Rs. " + lap1.price);
//                break;
//
//            case 2:
//                System.out.print("specification of " + lap2.name + "  is:\n1.ram=" + lap2.ramSize + "GB" + "\n2.HDD=" + lap2.hdd + " \n3.price= Rs. " + lap2.price);
//                break;
//            case 3:
//                System.out.print("specification of " + lap3.name + "  is:\n1.ram=" + lap3.ramSize + "GB" + "\n2.HDD=" + lap3.hdd + " \n3.price= Rs. " + lap3.price);
//                break;

        Medical tab1 = new Medical("paracetemol",100,500);
        Medical tab2 = new Medical("o2",80,400);
        Medical tab3 = new Medical("dolo",50,200);
        Medical tab4 = new Medical("omee-d",10,100);

        List<Medical> medicals = new ArrayList<>();
        medicals.add(tab1);
        medicals.add(tab2);
        medicals.add(tab3);
        medicals.add(tab4);
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter medicine name:");
        name = sc.nextLine();

        medicals.forEach(medical -> {
            if(medical.name.equals(name)){
                medical.buyQuantity();
            }else{
                System.out.println("invalid medicine");
            }
        });
    }


}

