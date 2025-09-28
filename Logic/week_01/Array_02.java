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

    public static void secondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest:" + secondLargest);
    }
    public static void thirdlargest(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
                third=arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        findMissingRepeating(arr);
        secondLargest(arr);
        thirdlargest(arr);
    }

}
