package NQT;

/*
 * Given an integer array Arr of size N the task is to find the 
 * count of elements whose value is greater than all of its prior elements.
 * Note : 1st element of the array should be considered in the count of the result.
 */
public class Program9 {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 7, 11, 22, 8, 13, 25 };
        greaterThanPriorElements(arr);
    }

    public static void greaterThanPriorElements(int arr[]) {
        int greatest = arr[0];
        int matchCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (greatest <= arr[i]) {
                matchCount++;
                greatest = arr[i];
            }
        }
        System.out.println("count of elements whose value is greater than all of its prior elements: " + matchCount);
    }
}
