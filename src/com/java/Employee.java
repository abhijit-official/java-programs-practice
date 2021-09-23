package com.java;

import java.util.Scanner;

public class Employee {

      String name;
      int age;
      double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//    Scanner scan = new Scanner(System.in);
//      String name =" ";
//      int age = 0;
//      double salary = 0;
//    //    String name ="Abhi";
//    //    int age = 22;
//    //    double salary =220000;
//
//    public void get_details(){
//        System.out.println("Enter the name of employee :");
//        name =scan.nextLine();
//        System.out.println(" Enter Age of Employee :");
//        age=scan.nextInt();
//        System.out.println("Enter the salary of Employee is :");
//        salary=scan.nextDouble();
//    }

    public void show_details(){
        System.out.println("Name of employee is :" + name);
        System.out.println("age of Employee is :" + age);
        System.out.println("salary of Employee is :" + salary);
    }
}
