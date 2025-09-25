package Logic.week_01;

import java.util.Arrays;

public class Array_01 {
     public static void insertSorted(int[] arr, int num){
        int n= arr.length;
        int i;
        System.out.println("Before Insert:"+Arrays.toString(arr));
        for(i=n-1;(i>=0 && arr[i]>num);i--){
        if(i==n-1){
            continue;
        }
        arr[i+1]=arr[i];
        }
        arr[i+1]=num;
        
            System.out.println("After Insert:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // Default values of arrays (int → 0, boolean → false, objects → null).

        int[] demo; // or int demo[]

        // provide either size or element , at least 1 is requred, both are illegal.

        int[] demo2 = new int[5];

        int[] demo3 = { 11, 22, 33 };
        // illegal
        // int[] demo4 = new int[2]{1,2};

        int[] arr = { 10, 20, 30 };

        for (int i : arr) { // for each loop
            System.out.println(i);
        }

        // inserting element in arr :

        System.out.println("inserting arr");
        demo2[0] = 11;
        // demo2[1]=22.5; // error: lossy conversion double to int
        demo2[2] = 'a'; // character converted to int ASCII
        // demo2[3]="Hello"; //error: incompatible types
        // demo2[4]=true; //error: incompatible types

        for (int i = 0; i < demo2.length; i++) {
            System.out.println(demo2[i]);
        }

        // updating elements in arr :
        System.out.println("Updating arr");
        for (int i : demo3) {
            System.out.println(i);
        }
        demo3[0] = 999;
        System.out.println("after update");
        for (int i : demo3) {
            System.out.println(i);
        }

        // arr functions :
        // * length
        System.out.println("Arr length :" + arr.length);

        // * tostring(arr)
        System.out.println(Arrays.toString(demo3));
        // * sort(arr)
        Arrays.sort(demo3); // returns void
        System.out.println(Arrays.toString(demo3));
        // * binarySearch(arr,val)
        System.out.println(Arrays.binarySearch(demo3, 22));// return index if found, -1 for not found

        // * fill(val)
        System.out.println(Arrays.toString(demo2));
        Arrays.fill(demo2, 16);
        System.out.println(Arrays.toString(demo2));

        // * comparing arrs
        System.out.println(Arrays.equals(demo2, demo3)); // true/false
        // * copy(arr,size)
        int[] copy = Arrays.copyOf(demo2, 10);
        System.out.println(Arrays.toString(copy));

        // * copyOfRange(arr,firstind,lastind+1)
        int[] sub = Arrays.copyOfRange(demo3, 0, 2);
        System.out.println(Arrays.toString(sub));

        // * parallelSort(arr)
        System.out.println(Arrays.toString(copy));
        Arrays.parallelSort(copy);
        System.out.println(Arrays.toString(copy));

    }
}
