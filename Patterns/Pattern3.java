package Patterns;

import java.util.Scanner;
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        pattern3(n);
        sc.close();

    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
