package Logic;

public class FrequencyCounter {
    // public static void freqCount(int arr[]) {
    // int n = arr.length;
    // boolean visited[] = new boolean[n];

    // for (int i = 0; i < n; i++) {
    // if (visited[i] == true) {
    // continue;
    // }
    // int count = 1;
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // visited[j] = true;
    // count++;
    // }
    // }
    // System.out.println(arr[i] + " " + count);
    // }
    // }
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 20, 10, 30, 20, 10, 10, 30 };
        freqCount(arr);
    }

    public static void freqCount(int arr[]) {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }
}
/**?
 * 
 * freqcounter(arr[]){
 * n=arr.length
 * boolean visited[n]
 * fori=0 to n-1
 * if(visited[i]==true)
 * continue
 * int count=1
 * forj=i+1 to n-1
 * if(arr[i]==arr[j])
 * count++
 * visited[j]=true
 * print(arr[i],count)
 */