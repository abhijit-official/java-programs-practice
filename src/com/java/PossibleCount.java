package com.java;

import java.util.Scanner;

public class PossibleCount {
        static int count=0;
        public static void partition(int total, int k) {
            partition(total, k, "");
        }
        public static void partition(int n, int max, String prefix) {
            if (n == 0) {
                count++;
                return;
            }
            for (int i = Math.min(max, n); i >= 1; i--) {
                partition(n - i, i, prefix + " " + i);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            partition(n,k);
            System.out.println(count);
        }
}
