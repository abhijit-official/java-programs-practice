package com.java;

public class Info {
    public static void main(String[] args) {
        Teachers t1 = new Teachers("Abhijit", 44, 220000);
        Students s1 = new Students("Abhijeet", 22, 327);
        System.out.println(t1);
        System.out.println(s1);
////swapping values
//        System.out.println("swapping values are");
//        int a = 10;
//        int b = 20;
//        swa(a, b);
//    }
//
//    public static void swa(int num1, int num2) {
//        System.out.println("values before swapping are: a; " + num1 + " b:" + num2);
//        int c = num1;
//        num1 = num2;
//        num2 = c;
//
//        System.out.println("values after swapping are: a; " + num1 + " b:" + num2);
//        int l =10;
//        int w =20;
//        float r = 2.5f;
//        int RectangleArea = area(10,20 );
//        float circleArea = area(r);
//        System.out.println("Area of rectangle is :"+ RectangleArea);
//        System.out.println("Area of circle is :"+ circleArea);
//    }
//
//    //    methode og overloading
//    public static int area(int n1, int n2) {
//        System.out.println("methode of overloading ");
//        int result = n1 * n2;
//        return result;
//    }
//    public static float area(float n){
//        float result = 3.14f*n*n;
//        return result;

// array in java
        char[] a = new char[5];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';
        a[3] = 'd';
        a[4] = 'e';
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            b[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
        System.out.println(" 1-D arrays ");
        int num = 5;
        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            x[i] = i;
        }
        for (int i = 0; i < 5; i++) {
            y[i] = num;
            ++num;
        }
        System.out.println("values in arrays x:");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("values in arrays y:");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            z[i] = x[i] + y[i];
        }
        System.out.println();
        System.out.println("values in arrays z:");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i] + " ");
        }
        int num1 = 1;
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = num1;
                num1++;
            }
        }
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
