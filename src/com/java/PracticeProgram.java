package com.java;

import java.util.Scanner;

public class PracticeProgram {
    public static void main(String args[]) {
        int option;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("name of Employee is");
            String Employee_name = scan.nextLine();
            System.out.println("age of ");
            int Employee_age = scan.nextInt();
            System.out.println("salary is ");
            double Employee_salary = scan.nextDouble();

            Employee e1 = new Employee(Employee_name, Employee_age, Employee_salary);
            e1.show_details();
            System.out.println("do you wish to continue?");
            option = scan.nextInt();

        } while (option == 1);

        int options;
        do{
        Scanner s1 = new Scanner(System.in);
        System.out.println("name of employee");
        String name = s1.nextLine();
        System.out.println("id is: ");
        int id =s1.nextInt();
        System.out.println("salary is: ");
        double salary = s1.nextDouble();

        Employee1 Em = new Employee1(name,id,salary);
            System.out.println("do you continue this loop :");
            options = s1.nextInt();
        }while (options == 1);

//
//        char[] a = new char[4];
//        a[0] = 'a';
//        a[1] = 'b';
//        a[2] = 'c';
//        a[3] = 'd';
////        a[4] = 'e';
//        for (int i = 0; i < 4; i++) {
//            System.out.println(a[i]);
//        }
////  array program;
//        int num = 5;
//        int A[] = new int[5];
//        int b[] = new int[5];
//        int c[] = new int[5];
//        for (int i=0; i<5; i++){
//            A[i]=i;
//        }
//        for (int i=0; i<5; i++){
//            b[i]=num;
//            num++;
//        }
//        System.out.println("values in array A :");
//        for (int i=0; i<5; i++){
//            System.out.print(A[i] + " ");
//        }
//        System.out.println();
//        System.out.println("values in array b : ");
//        for (int i=0; i<5; i++){
//            System.out.print(b[i]+" ");
//        }
//        for (int i=0; i<5; i++){
//            c[i]=A[i]+b[i];
//        }
//        System.out.println();
//        System.out.println("values in array c : ");
//        for (int i=0; i<5; i++){
//            System.out.print(c[i]+" ");
//        }
//  multi-dimensional Array
//        int num1 = 1;
//        int[][] x = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                x[i][j] = num1;
//                num1++;
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(x[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
