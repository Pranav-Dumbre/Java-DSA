package NQT;

public class Program14 {
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char arr[] = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i <= n / 2; i++) {

            if (arr[i] != arr[n - i - 1])
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        boolean pal = isPalindrome("mom");
        System.out.println(pal);
    }

}
