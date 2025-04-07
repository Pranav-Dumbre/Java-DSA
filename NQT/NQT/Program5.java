package NQT;

import java.util.Scanner;
// reverse a number
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = reverseNumber(num);
        System.out.println(res);
        sc.close();
    }

    public static int reverseNumber(int num) {
        int lastDigit = 0;
        int revNum = 0;
        while (num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        return revNum;
    }
}
