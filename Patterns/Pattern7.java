package Patterns;

import java.util.Scanner;
/*
 
    *    
   ***
  *****
 *******
*********

 */

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int x = sc.nextInt();
        pattern7(x);
        sc.close();
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
