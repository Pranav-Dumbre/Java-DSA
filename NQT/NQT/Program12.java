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

    public static void addFirstnatural(int i, int sum) {
        sum = sum + i;
        if (i == 0) {
            System.out.println(sum);
            return;
        }
        addFirstnatural(i - 1, sum);
    }

    public static int firstsum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + firstsum(n - 1);
    }

    public static void main(String[] args) {
        sumFirstnatural(5);
        addFirstnatural(5, 0);
        System.out.println(firstsum(5));
    }
}
