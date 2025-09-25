package Logic;

import java.util.HashMap;

public class FreeqMap {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 20, 10, 30, 20, 10, 10, 30 };
        freqCount(arr);
        mapgen(arr);
    }

    public static void freqCount(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void mapgen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int j : map.keySet()) {
            System.out.println(j + " " + map.get(j));
        }
    }
}
