package NQT;

public class Program12 {
    public static int sum = 0;

    public static void sumFirstnatural(int n) {
        sum = sum + n;
        n--;
        
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumFirstnatural(n);
    }

    public static void main(String[] args) {
        sumFirstnatural(5);
    }
}
