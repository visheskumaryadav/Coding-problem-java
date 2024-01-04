package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program1 {
    static void usingTwoForLoops(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int targetElement = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (targetElement == arr[j] && arr[j] != -1) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (targetElement != -1) {
                System.out.println(targetElement + " repeated " + count + " times");
            }
        }
    }

    static void twoPointerMethod(int[] arr) {
        Arrays.sort(arr);

        int i = 0, j = 0, count = 0;

        while (i < arr.length && j < arr.length) {

            if (arr[i] == arr[j]) {
                count++;
                j++;
            } else {
                System.out.println(arr[i] + " repeated " + count + " times");
                count = 0;
                i = j;
            }
        }
        System.out.println(arr[i] + " repeated " + count + " times");

    }

    static void usingHashMap(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> m : entrySet) {
            int key = m.getKey();
            int value = m.getValue();
            System.out.println(key + " repeated " + value + " times");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 6, 7, 18, 9, 10, 5, 11, 12, 13, 14, 11, 16, 17, 18 };
        // usingTwoForLoops(arr);
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        twoPointerMethod(arr);
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        usingHashMap(arr);

    }
}
