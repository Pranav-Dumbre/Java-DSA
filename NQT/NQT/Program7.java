package NQT;

import java.util.Scanner;

// Armstrong number
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isArmstrong(num);
        sc.close();
    }

    public static void isArmstrong(int num) {
        int lastDigit = 0;
        int cubeSum = 0;
        int org = num;
        while (num > 0) {
            lastDigit = num % 10;
            cubeSum = cubeSum + lastDigit * lastDigit * lastDigit;
            num = num / 10;
        }
        if (cubeSum == org)
            System.out.println("is Armstrong number");

        else
            System.out.println("NOT an Armstrong number");
    }
}
