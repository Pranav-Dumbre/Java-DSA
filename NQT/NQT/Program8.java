package NQT;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

// all factors of number
public class Program8 {
    public static void main(String[] args) {
        allFactors(36);
    }

    public static void allFactors(int num) {
        List<Integer> factorList = new ArrayList<>();
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                // System.out.println(i + " ");
                factorList.add(i);
                if (num / i != i) {
                    // System.out.println(num / i + " ");
                    factorList.add(num / i);
                }
            }
        }
        factorList.sort(null);
        for (int i = 0; i < factorList.size(); i++) {
            System.out.println(factorList.get(i));
        }
    }
}
