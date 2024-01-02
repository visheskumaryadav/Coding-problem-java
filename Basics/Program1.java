package Basics;

import java.util.HashMap;
import java.util.Map;

class Program1 {

    static void basicMethod() {
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.print(second);
        int remainingCount = 8;
        while (remainingCount > 0) {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
            remainingCount--;
        }
    }

    static int recursiveMethod(int num) {
        if (num <= 1) {
            return num;
        }

        return recursiveMethod(num - 1) + recursiveMethod(num - 2);
    }

    static int moreOptimize(int num, Map<Integer, Integer> record) {

        if (num <= 1) {
            return num;
        }
        int sum = 0;

        if (record.containsKey(num)) {
            return record.get(num);
        } else {
            sum = moreOptimize(num - 1, record) + moreOptimize(num - 2, record);
            record.put(num, sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        basicMethod(); // printing the fibonacci series
        System.out.println();
        System.out.println(recursiveMethod(8)); // printing nth no. in fibonacci
        System.out.println(moreOptimize(8, new HashMap<>())); // more optimized using hashmap
    }
}