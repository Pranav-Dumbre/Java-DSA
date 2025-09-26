package Logic.week_01;

public class Array_02 {

    public static void findMissingRepeating(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int missing = -1;
        int repeating = -1;
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                repeating = i;
            }
        }
        System.out.println("[MIssing :" + missing + " , Repeating :" + repeating + "]");

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        findMissingRepeating(arr);
    }

}
