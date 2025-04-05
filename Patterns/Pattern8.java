package Patterns;

import java.util.Scanner;
/*
*********
 *******
  *****
   ***
    *
 */

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int x = sc.nextInt();
        pattern8(x);
        sc.close();

    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
