
package NQT;

import java.util.Scanner;

// Palindrome
public class Progam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverseNumber(num);
        sc.close();
    }

    public static void reverseNumber(int num) {
        int org = num;
        int lastDigit = 0;
        int revNum = 0;
        while (num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        if (revNum == org)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }
}
