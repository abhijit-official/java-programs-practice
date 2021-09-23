package com.java;

import java.util.Scanner;

class Text {
    public static void main(String args[]) {
//         Calculator cc = new Calculator();
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
//
//     }
//arithmetic operator (+,-,*,/;) comparison operators(<,>,==,!=) logical operators(&, ||;)
        boolean a = true;
        boolean b = false;
        System.out.println(b || b);
//if statement
        if (20 > 18) {
            System.out.println("20 is greater than 18");

            int x = 20, y = 10;
            if (y > x) {
                System.out.println("y is greater than x ");
            } else {
                System.out.println("x is greater than y ");
            }
//if else if statement

            int marks = 65;

            if (marks < 50) {
                System.out.println("fail");
            } else if (marks >= 50 && marks < 60) {
                System.out.println("D grade ");
            } else if (marks >= 60 && marks < 75) {
                System.out.println("C grade ");
            } else if (marks >= 75 && marks < 90) {
                System.out.println("B grade ");
            } else if (marks >= 90 && marks < 100) {
                System.out.println("A+ grade ");
            } else {
                System.out.println("Invalid");
            }
//-ve if else if
            int number = -11;
            if (number > 0) {
                System.out.println("number is positive");
            } else if (number < 0) {
                System.out.println("number is Negative");
            } else {
                System.out.println("zero");
            }
//+ve if else if statement

            int num = 25;
            if (num >= 0) {
                System.out.println("num is positive");
            } else if (num < 0) {
                System.out.println("num is negative ");
            } else {
                System.out.println("zero ");
            }
// while loop
            System.out.println("while  loop program");
            int A = 1;
            while (A <= 5) {
                System.out.println(A);
                A++;
            }
// for loop
            System.out.println("for loop program");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println("for loop program");
            for (int i = 0; i < 10; i = i + 2) {
                System.out.println(i);
            }
// pattern loop
            int n = 5;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            int N = 5;
            for (int i = 5; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }


// loop pattern
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: "); //to take input from user
            int row;
            int rows = sc.nextInt();
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("$" + " ");
                }
                System.out.println();
            }
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("$" + " ");
                }
                System.out.println();
            }
            sc.close();

        }
    }
}

