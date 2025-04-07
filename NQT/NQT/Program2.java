package NQT;

import java.util.Scanner;

/**
 * Problem Statement-
 * A positive integer has been given as an input. Convert decimal value to
 * binary representation. Toggle all bits of it after the most significant bit
 * including the most significant bit. Print the positive integer value after
 * toggling all bits.
 * 
 * Constrains-
 * 1<=N<=100
 * 
 * Example 1:
 * Input :
 * 10 -> Integer
 * Output :
 * 5 -> result- Integer
 * 
 * Explanation:
 * Binary representation of 10 is 1010. After toggling the bits(1010), will get
 * 0101 which represents “5”. Hence output will print “5”.
 */

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr number");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Not a Positive Number");
        }
        if (number == 0) {
            System.out.println("1");
        } else if (number == 1) {
            System.out.println("0");
        } else {
            String binary = "";
            while (number != 0) {
                binary = (number & 1) + binary;
                number = number >> 1;
            }
            binary = binary.replaceAll("1", "2");
            binary = binary.replaceAll("0", "1");
            binary = binary.replaceAll("2", "0");

            int result = Integer.parseInt(binary, 2);
            System.out.println(result);
        }
        sc.close();
    }
}
