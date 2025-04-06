package NQT;

import java.util.Scanner;

/*
 Airport security officials have confiscated several item of the passengers at the security check point.
 All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2].
 Here, the risk severity of the items represent an array[] of N number of integer values.
 The task here is to sort the items based on their levels of risk in the array.
 The risk values range from 0 to 2.
 */
public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Count of items :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        riskSortedSeverityforItems(n, arr);
        sc.close();
    }

    public static void riskSortedSeverityforItems(int itemCount, int severityArray[]) {
        for (int i = 0; i < severityArray.length; i++) {
            int zeroCount = 0;
            int oneCount = 0;
            if (severityArray[i] == 0) {
                zeroCount++;
            } else if (severityArray[i] == 1) {
                oneCount++;
            }            
        }
    }
}
