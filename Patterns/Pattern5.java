package Patterns;

import java.util.Scanner;

/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        pattern5(n);
        sc.close();
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
