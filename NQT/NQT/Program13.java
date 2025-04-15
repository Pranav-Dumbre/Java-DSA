package NQT;

// recursion
public class Program13 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void revArray(int i, int[] arr, int n) {
        if (i > n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        revArray(++i, arr, n);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println("________");
        int arr[] = new int[] { 10, 20, 30, 40, 50 };
        int x = 10;
        revArray(0, arr, 5);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        // System.out.println(x++);
        // System.out.println(x);
    }
}
