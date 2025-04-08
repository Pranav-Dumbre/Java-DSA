package NQT;

import java.util.Scanner;

/*
 * A supermarket maintains a pricing format for all its products.
 * A value N is printed on each product. When the scanner reads the value N on the item
 * the product of all the digits in the value N is the price of the item.
 * The task here is to design the software such that given the code of any item N 
 * the product (multiplication) of all the digits of value should be computed(price).
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code N :");
        int code = sc.nextInt();
        countProductPrice(code);
    }

    public static void countProductPrice(int N) {
        int lastDigit = 0;
        int price = 1;
        while (N > 0) {
            lastDigit = N % 10;
            price = price * lastDigit;
            N /= 10;
        }
        System.out.println("Price :" + price);
    }
}
