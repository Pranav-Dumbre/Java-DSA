package Patterns;

import java.util.Scanner;
/*
12345
1234
123
12
1
 */

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        pattern6(n);
        sc.close();
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
