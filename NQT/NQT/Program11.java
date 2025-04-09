package NQT;

public class Program11 {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                if (num / i != i) {
                    count++;
                }
            }
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}
