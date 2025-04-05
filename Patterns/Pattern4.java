package Patterns;

import java.util.Scanner;
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        pattern4(n);
        sc.close();
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
