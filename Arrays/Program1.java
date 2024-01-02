package Arrays;

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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 6, 7, 18, 9, 10, 5, 11, 12, 13, 14, 11, 16, 17, 18 };
        usingTwoForLoops(arr);
    }
}
