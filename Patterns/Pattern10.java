package Patterns;
/*

* 
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

 */

public class Pattern10 {
    public static void main(String[] args) {
        // attern10(5);
        pattern11(5);
        pattern12(5);
    }

    public static void pattern10(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int stars = i;
            if (i >= n) {
                stars = 2 * n - i;
            }
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     * 0
     * 10
     * 010
     * 1010
     * 01010
     */

    public static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {

                start = 1 - start;
                System.out.print(start);
            }
            System.out.println();
        }
    }
/*
1        1
12      21
123    321
1234  4321
1234554321
 */
    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

}
